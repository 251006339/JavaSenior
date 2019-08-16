package com.rl.config;

import com.rl.bean.Blur;
import org.springframework.context.annotation.*;

/**
 * @author XAIOHU
 * @date 2019/8/16 --11:32
 **/
// map("blur","实例对象");

@ComponentScan("com.rl.bean")

@Import({MyImportBeanFactory.class})
public class Myconfig {
    //先选择这个

    @Bean()//加上@Bean注册到容器中,如果默认,是方法名. beanDefinitionName()-获得@Bean的name-根据name获得实例;
    @Lazy
    public Blur getBlur() {
        System.out.println("是这个blur吗");
        return new Blur("dsa");
    }

    @Bean()  //先注册这个bean ,然后再执行方法
    public FactroyBeanTest getFactoryBeanTest() {
        return new FactroyBeanTest();
    }

}
