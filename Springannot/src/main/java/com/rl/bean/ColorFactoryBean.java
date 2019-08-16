package com.rl.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author XAIOHU
 * @date 2019/8/15 --19:03
 * 创建一个spring的定义的factoryBean
 *
 **/
//创建一个color对象,这个对象会添加到
public class ColorFactoryBean implements FactoryBean<Color>{

      //返回一个Color对象,这个对象回添加到容器中;
    @Override
    public Color getObject() throws Exception {
        System.out.println("Color");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
     //控制是否单列 .  如果返回true 这个bean是单实例,在容器中保存一份;
    //
    @Override
    public boolean isSingleton() {

        return false;
    }
}
