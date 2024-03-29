package com.ra.friendmatch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

//表示这个类是一个配置类,会把这个类注入到ioc容器中
@Configuration
@EnableSwagger2WebMvc
@Profile("dev")
public class SwaggerConfig {
    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        //.title("swagger-bootstrap-ui-demo RESTful APIs")
                        .description("friend-match-backend RESTful APIs")
                        .termsOfServiceUrl("https://xxx")
                        .contact("https://github.com/RA42-y")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("friend-match-backend-api-v1")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.ra.friendmatch.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}