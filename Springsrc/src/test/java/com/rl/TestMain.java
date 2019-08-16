package com.rl;

import com.rl.config.Myconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XAIOHU
 * @date 2019/8/16 --11:31
 **/
public class TestMain {

    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Myconfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        Object app1 = app.getBean("org.springframework.context.annotation.internalCommonAnnotationProcessor");
       Object app2 = app.getBean("getBlur");
        Object app3 = app.getBean("getBlur");
        System.out.println(app2==app3);
     Object app4 = app.getBean("getFactoryBeanTest");

        for (String beanDefinitionName : beanDefinitionNames) {

            System.out.println(
                    beanDefinitionName
            );
        }

    }

}
