package com.rl.bean;

import org.springframework.stereotype.Component;

/**
 * @author XAIOHU
 * @date 2019/8/15 --19:22
 **/
@Component
public class Car {
    public Car() {
        System.out.println("car constructor");
    }
    public void init(){

        System.out.println("car------init-->");

    }

}
