package com.als.tog.framework.web.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Swagger 自动配置类，基于 OpenAPI + Spring doc 实现。
 *
 * @author 刘嘉杰
 * @version 1.0.0
 * @date 2023/11/9 下午2:38
 */
@AutoConfiguration
@ConditionalOnClass({OpenAPI.class})
@EnableConfigurationProperties(SwaggerProperties.class)
@ConditionalOnProperty(prefix = "springdoc.api-docs", name = "enabled", havingValue = "true", matchIfMissing = true) // 设置为 false 时，禁用
public class TogSwaggerAutoConfiguration {

    /**
     * 全局 OpenAPI 配置
     */
//    @Bean
//    public OpenAPI createApi(SwaggerProperties properties) {
//
//    }
}
