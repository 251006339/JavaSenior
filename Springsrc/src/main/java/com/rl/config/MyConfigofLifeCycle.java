package com.rl.config;

import com.rl.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author XAIOHU
 * @date 2019/8/16 --14:53
 **/
@ComponentScan("com.rl.bean")

public class MyConfigofLifeCycle {
    //初始化,销毁对象  执行init方法, 销毁执行destory方法
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Car getCar() {
       return new Car();
    }


}
