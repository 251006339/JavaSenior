package com.rl;

import com.rl.config.MyConfigofLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XAIOHU
 * @date 2019/8/16 --11:31
 **/
public class TestMain1 {

    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfigofLifeCycle.class);
        Object getCar = app.getBean("getCar");
        Object getCar1 = app.getBean("getCar");
        System.out.println(getCar==getCar1);

        String[] beanDefinitionNames = app.getBeanDefinitionNames();



        for (String beanDefinitionName : beanDefinitionNames) {

            System.out.println(
                    beanDefinitionName
            );
        }

    }

}
