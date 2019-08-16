package com.rl.config;

import com.rl.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

/**
 * @author XAIOHU
 * @date 2019/8/16 --11:32
 **/
// map("blur","实例对象");

@ComponentScan("com.rl.bean") //默认是扫描注解

public class MyConfig1 {


    //@Conditional({MyCondition.class}) //达到条件就创建Bean 这个是针对@Bean
    @Scope("prototype")
    @Bean()  //先注册这个bean后再执行方法
    public Car getCar() {

        return new Car();
    }
  /*  @Bean()  //先注册这个bean后再执行方法
    public Yellow getYellow(){

        return new Yellow();
    }*/

}
