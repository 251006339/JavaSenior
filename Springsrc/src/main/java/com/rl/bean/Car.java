package com.rl.bean;

import org.springframework.stereotype.Component;

/**
 * @author XAIOHU
 * @date 2019/8/16 --13:22
 **/
@Component
public class Car {
public void init(){
    System.out.println("bean初始化");
}
    public void destory(){
        System.out.println("bean销毁");
    }
}
