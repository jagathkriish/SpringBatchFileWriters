package com.vv.batch.writers;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

@Component
public class YamlWrapper {
	
	@Autowired
    private ResourceLoader resourceLoader;
	
	public ExcelBean loadAsJavaBean(String fileName) {
		Yaml yaml = new Yaml();
        Resource resource = resourceLoader.getResource("classpath:templates/"+fileName+".yml");
		try (InputStream in = resource.getInputStream()) {
			ExcelBean excelBean = yaml.loadAs(in, ExcelBean.class);
			System.out.println(excelBean);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
