package com.rl.bean.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author XAIOHU
 * @date 2019/8/16 --15:07
 **/
@Component  //��Ҫʵ����Bean MyBeanPostProcessor BeanPostProcessor
public class MyBeanPostProcessor  implements BeanPostProcessor {
    //����֮ǰ��ʼ��
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("��ʼ��֮ǰִ��->"+beanName+" bean___>"+bean);
        //beanִ�� beanname --beanʵ��--:

        return bean;
    }
  //processafter����֮���ʼ��
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //bean����--:
        System.out.println("��ʼ��֮��ִ��->"+beanName+" bean___>"+bean);





        return bean;
    }
}
