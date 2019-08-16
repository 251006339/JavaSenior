package com.rl.config;

import com.rl.bean.Yellow;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author XAIOHU
 * @date 2019/8/16 --13:53
 **/
public class FactroyBeanTest implements FactoryBean {
    public Object getObject() throws Exception {
        System.out.println("��ö���...getObject...");
        return new Yellow();
    }

    public Class<?> getObjectType() {
        System.out.println("ColorFactoryBean...getObject...");
        return Yellow.class;
    }

    public boolean isSingleton() {
        System.out.println("�Ƿ��ǵ�����...getObject...");
        return true;
    }
}
