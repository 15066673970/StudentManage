package com.quanlian.mybatisGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGenerator {

	public static void main(String[] args) throws Exception{
		List<String> warning = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warning);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warning);
		myBatisGenerator.generate(null);
		System.out.println("逆向完成");
		
		
	}
}
