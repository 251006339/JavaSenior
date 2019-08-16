package com.rl.config;

import com.rl.bean.Yellow;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author XAIOHU
 * @date 2019/8/16 --13:53
 **/
public class FactroyBeanTest implements FactoryBean {
    public Object getObject() throws Exception {
        System.out.println("获得对象...getObject...");
        return new Yellow();
    }

    public Class<?> getObjectType() {
        System.out.println("ColorFactoryBean...getObject...");
        return Yellow.class;
    }

    public boolean isSingleton() {
        System.out.println("是否是单例的...getObject...");
        return true;
    }
}
