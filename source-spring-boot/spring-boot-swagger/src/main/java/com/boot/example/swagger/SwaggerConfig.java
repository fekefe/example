package com.boot.example.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket buildDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(buildApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.boot.example.controller"))
				.paths(PathSelectors.any())
				.build()
				// .tags(new Tag("基础公共接口","1"),new Tag("测试","1"))
				// .apiListingReferenceOrdering()
				;
	}
	
	
	private ApiInfo buildApiInfo() {
		return new ApiInfoBuilder()
				.title("BoContentLiveChannel")
				.description("内容管理中心直播管理的关系微服务的接口")
				.termsOfServiceUrl("http://springfox.io")
				// .extensions(null)
				.contact(new Contact("ZhangWeiDong(zhangweidong@sumaott.com)", null, null))
				.license("2018-1-10")
				.version("4.1.8")
				.build();
	}
	
	@Bean
	UiConfiguration uiConfig() {
		return UiConfigurationBuilder.builder()
				.deepLinking(true)
				.displayOperationId(false)
				.defaultModelsExpandDepth(1)
				.defaultModelExpandDepth(1)
				.defaultModelRendering(ModelRendering.EXAMPLE)
				.displayRequestDuration(false)
				.docExpansion(DocExpansion.NONE)
				.filter(false)
				.maxDisplayedTags(null)
				.operationsSorter(OperationsSorter.ALPHA)
				.showExtensions(false)
				.tagsSorter(TagsSorter.ALPHA)
				.supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
				.validatorUrl(null)
				.build();
	}
	
}
