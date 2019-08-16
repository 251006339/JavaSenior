package com.rl.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author XAIOHU
 * @date 2019/8/15 --19:36
 **/
@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("cat--->constructor");
    }

    @Override  //destory销毁bean方法
    public void destroy() throws Exception {
        System.out.println("销毁bean方法--->cat ");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
      //在属性值赋好值之后调用 这个方法
        System.out.println("cat_afterpropertiesSet ----");

    }
}
