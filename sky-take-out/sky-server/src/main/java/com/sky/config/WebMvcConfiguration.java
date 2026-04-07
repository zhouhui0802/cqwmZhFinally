package com.sky.config;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/7 8:42
 */

import com.sky.interceptor.JwtTokenAdminInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
  配置类，注册web层相关组件
 WebMvcConfigurationSupport  用来让你自定义、扩展、接管 SpringMVC 的各项配置
 核心作用
  你可以通过继承它，来配置：
  拦截器 Interceptor
  跨域 CORS
  静态资源映射（如 /static/**）
  消息转换器（JSON 格式化、文件上传）
  视图控制器、视图解析器
  路径匹配规则

 一旦继承 WebMvcConfigurationSupport，SpringBoot 的 Web 自动配置会失效！

 WebMvcConfigurationSupport：完全接管，自动配置失效
 WebMvcConfigurer：扩展增强，自动配置保留


 */
@Configuration
@Slf4j
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private JwtTokenAdminInterceptor jwtTokenAdminInterceptor;

    /**
     * 注册自定义拦截器
     *
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("开始注册自定义拦截器...");
        registry.addInterceptor(jwtTokenAdminInterceptor)
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin/employee/login");
    }



    /**
     * 设置静态资源映射    因为我实现了WebMvcConfigurer接口，所以必须要重写这个方法，要不使用knife4j的时候，找不到调试页面
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
