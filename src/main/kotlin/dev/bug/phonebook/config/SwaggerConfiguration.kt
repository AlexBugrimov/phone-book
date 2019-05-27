package dev.bug.phonebook.config;

import dev.bug.phonebook.config.SwaggerConfiguration.Info.CONTACT
import dev.bug.phonebook.config.SwaggerConfiguration.Info.DESCRIPTION
import dev.bug.phonebook.config.SwaggerConfiguration.Info.LICENSE_TEXT
import dev.bug.phonebook.config.SwaggerConfiguration.Info.SWAGGER_API_VERSION
import dev.bug.phonebook.config.SwaggerConfiguration.Info.TITLE
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


@EnableSwagger2
@Configuration
class SwaggerConfiguration {

    object Info {
        const val SWAGGER_API_VERSION = "1.0"
        const val LICENSE_TEXT = "License"
        const val TITLE = "Phone Book REST API"
        const val DESCRIPTION = "RESTFul API for Phone Book"
        val CONTACT = Contact("Bugrimov Alex", "www.bug.dev", "bugrimov_a@bk.ru")
    }

    fun apiInfo(): ApiInfo = ApiInfoBuilder()
            .version(SWAGGER_API_VERSION)
            .license(LICENSE_TEXT)
            .title(TITLE)
            .description(DESCRIPTION)
            .contact(CONTACT)
            .build()

    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.regex("/.*"))
            .build();
}