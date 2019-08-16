package com.rl.config;

import com.rl.bean.Car;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author XAIOHU
 * @date 2019/8/16 --13:25
 **/
public class MyImportBeanFactory implements ImportBeanDefinitionRegistrar {
    //register 注册bean定义beandefinitions
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean getBlur = registry.containsBeanDefinition("yellow");
        if (getBlur) {
            System.out.println(
                    "bean里面有blur"
            );
            //需要bean的rootbean定义的car.class注册到容器中;
            BeanDefinition beanDefinitnew = new RootBeanDefinition(Car.class);
            //注册bean  name的名字.--类class
            registry.registerBeanDefinition("Car", beanDefinitnew);

        }
    }
}
