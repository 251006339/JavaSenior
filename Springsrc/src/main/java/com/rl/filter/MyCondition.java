package com.rl.filter;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Iterator;

/**
 * @author XAIOHU
 * @date 2019/8/16 --14:41
 **/
public class MyCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        while (beanNamesIterator.hasNext()) {
            System.out.println(beanNamesIterator.next());
        }
        Environment environment = context.getEnvironment();
        String[] defaultProfiles = environment.getDefaultProfiles();
        for (String defaultProfile : defaultProfiles) {
            System.out.println("生产文件" + defaultProfile);
        }
        String property = environment.getProperty("os.name");
        System.out.println(property);
        if (property.contains("Win12")) {
            return true;
        }

        return false;
    }
}
