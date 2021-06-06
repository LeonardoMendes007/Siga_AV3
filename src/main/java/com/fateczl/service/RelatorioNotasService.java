package com.fateczl.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class RelatorioNotasService {
	
	@Autowired
	private Connection connection;
	
	public byte[] geraRelatorio(String tipo,String _materia) {
		String materia = _materia;
		String jasper = "classpath:jasper/" + tipo + ".jasper";
		
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("M", materia);
		byte[] bytes = null;
		File file;
		try {
			file = ResourceUtils.getFile(jasper);
			JasperPrint print = JasperFillManager.fillReport(file.getAbsolutePath(), param, connection);
			bytes = JasperExportManager.exportReportToPdf(print);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JRException e) {
			e.printStackTrace();
		}
		
		return bytes;
	}
}
