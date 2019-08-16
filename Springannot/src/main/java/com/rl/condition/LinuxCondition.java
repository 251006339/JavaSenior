package com.rl.condition;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author XAIOHe
 * @date 2019/8/15 --16:32
 *   LinuxCondition implements Condition
 *   实现了条件接口的方法都会执行,执行如果返回了是true ,则可以创建bean ,
 *   如果返回的false则不会创建bean为LinuxCondition.class修饰条件的返回false则不会创建bean
 **/
public class LinuxCondition implements Condition {
    //conditioncontext:判断条件能使用的上下文(环境)
    //annotatedTypeMetadata:注解信息
   //              matches
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
         //是否是linux系统
        //1.能获取到ioc使用的beanfactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
         //2.获取类的加载器 ClassLoader
        ClassLoader classLoader = conditionContext.getClassLoader();
        //3.获得当前环境信息 Environment
        Environment environment = conditionContext.getEnvironment();//环境Environment;
        //4.获取到bean定义的注册类
        //
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
         //可以判断
        boolean person = registry.containsBeanDefinition("person");//容器是存储的按照
        System.out.println(person);
        String property = environment.getProperty("os.name");
        if(property.contains("Linux")){
            return true;
        }

        return false;
    }
}
