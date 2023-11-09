package com.als.tog.framework.web.swagger.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotBlank;

/**
 * swagger配置属性
 *
 * @author 刘嘉杰
 * @version 1.0.0
 * @date 2023/11/9 下午2:30
 */
@ConfigurationProperties("tog.swagger")
@Data
public class SwaggerProperties {


    @NotBlank(message = "标题不能为空")
    private String title;

    @NotBlank(message = "描述不能为空")
    private String description;

    @NotBlank(message = "作者不能为空")
    private String author;

    @NotBlank(message = "版本不能为空")
    private String version;

    @NotBlank(message = "扫描的 package 不能为空")
    private String url;

    @NotBlank(message = "email不能为空")
    private String email;


}
