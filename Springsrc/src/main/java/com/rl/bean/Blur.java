package com.rl.bean;

/**
 * @author XAIOHU
 * @date 2019/8/16 --11:37
 **/
  //需要扫描包获得bean beanname是类名转小写


public class Blur {
    private String name;
    private String age;

    public Blur(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Blur{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
