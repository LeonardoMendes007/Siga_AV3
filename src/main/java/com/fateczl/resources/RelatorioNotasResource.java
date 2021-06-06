package com.fateczl.resources;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.fateczl.service.RelatorioNotasService;

@RestController
@RequestMapping("/relatorio")
public class RelatorioNotasResource {
	
	@Autowired
	private RelatorioNotasService service;
	
	
	@GetMapping("/{tipo}/{materia}")
	public void generateRelatorio(HttpServletResponse response, @PathVariable(value = "materia") String materia,@PathVariable(value = "tipo") String tipo) throws IOException{
	
		byte[] bytes = service.geraRelatorio(tipo,materia);
		response.setContentType(MediaType.APPLICATION_PDF_VALUE);
		response.setHeader("Content-disposition", "inline; filename=relatorio.pdf");
		response.getOutputStream().write(bytes);
		
	}
}
