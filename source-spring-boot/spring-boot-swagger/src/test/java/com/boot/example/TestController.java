package com.boot.example;

import io.github.swagger2markup.*;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/19
 */
public class TestController {
	
	public static void main(String[] args) throws Exception {
		Path outputDirectory = Paths.get("E://homework-test/source-spring-boot/spring-boot-swagger/src/docs/asciidoc/generated/all");
		Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
				.withMarkupLanguage(MarkupLanguage.ASCIIDOC)
				.withOutputLanguage(Language.ZH)
				.withPathsGroupedBy(GroupBy.TAGS)
				.withGeneratedExamples()
				.withoutInlineSchema()
				.withTagOrdering(OrderBy.AS_IS)
				.build();
		

		// Path localSwaggerFile = Paths.get("e://1.yaml");
		// Swagger2MarkupConverter.from(localSwaggerFile)
		
		URL remoteSwaggerFile = new URL("http://localhost/v2/api-docs");
		Swagger2MarkupConverter.from(remoteSwaggerFile)
				
				.withConfig(config)
				.build()
				.toFile(outputDirectory);
		
	}
	
}
