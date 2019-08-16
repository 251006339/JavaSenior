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
    //��ʼ��,���ٶ���  ִ��init����, ����ִ��destory����
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Car getCar() {
       return new Car();
    }


}
