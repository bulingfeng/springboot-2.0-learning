package com.bulingfeng.springboot.config;

import com.bulingfeng.springboot.http.convert.HttpPropertiesConvert;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.Properties;

@Configuration
public class RestMvcConfig implements WebMvcConfigurer {
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        //这里建议把消息转换类型放到第一位，否则可能出现不生效
//        converters.add(0,new HttpPropertiesConvert());
    }

//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedOrigins("*");
//    }
}
