package springboot.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("springboot.api"))
				.paths(PathSelectors.ant("/musify/**"))
				.build();
	}

	private ApiInfo getApiInfo() {

		return new ApiInfoBuilder().title("MusicService")
				.description("This API provide nformation about a specific music artist. The information is collected from 4 different sources: MusicBrainz, Wikidata, Wikipedia and Cover Art Archive.").version("1.0").license("v2.0")
				.version("1.0")	
				.contact(new Contact("Krishna", "https://www.xxx.com/", "krishna.raja7@gmail.com")).build();
	}

}