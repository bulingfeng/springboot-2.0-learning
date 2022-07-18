package com.bulingfeng.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes
                = metadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());

        String name=String.valueOf(annotationAttributes.get("name"));
        String value=String.valueOf(annotationAttributes.get("value"));
        String systemValue=System.getProperty(name);
        // 当返回true的时候才会把 使用该注解的bean加载到spring容器当中
        return value.equals(systemValue);
    }
}
