package com.rl.bean.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author XAIOHU
 * @date 2019/8/16 --15:07
 **/
@Component  //需要实例化Bean MyBeanPostProcessor BeanPostProcessor
public class MyBeanPostProcessor  implements BeanPostProcessor {
    //处理之前初始化
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前执行->"+beanName+" bean___>"+bean);
        //bean执行 beanname --bean实例--:

        return bean;
    }
  //processafter处理之后初始化
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //bean名字--:
        System.out.println("初始化之后执行->"+beanName+" bean___>"+bean);





        return bean;
    }
}
