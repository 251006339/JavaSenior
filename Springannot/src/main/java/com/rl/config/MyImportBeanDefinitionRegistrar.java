package com.rl.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author XAIOHU
 * @date 2019/8/15 --18:55
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
   //AnnotationMetadata 当前类的注解信息


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("Red");
        System.out.println(red);
        boolean blue = registry.containsBeanDefinition("blue");
        System.out.println(blue);
      if(red&&blue){
    //指定bean名  注册一个Bean
    RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
    //指定Bean定义信息 (Bean的类型,Bean...) 定义根-Bean
    registry.registerBeanDefinition("yellow",rootBeanDefinition);
          System.out.println("---------------");


}

    }
}
