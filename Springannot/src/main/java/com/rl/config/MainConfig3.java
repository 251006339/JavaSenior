package com.rl.config;

import com.rl.bean.ColorFactoryBean;
import com.rl.condition.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author XAIOHU
 * @date 2019/8/15 --18:15
 **/     //实现ImportSelector 导入选择器 就可以注入获得容器中的bean实例
    //返回的全类名
    //创建bean的几种方式
    // bean的生命周期  ---创建---初始化---销毁过程
    //容器管理bean的生命周期
    //我门可以自定义初始化和销毁方法;容器在bean进行到当前生命周期的时候调用我们自定义
    //

    @ComponentScan("com.rl")
    @Import({MyImportSelector.class})
public class MainConfig3{

 /*
 * 1.@Import 单名{Color.class }
 * 2.@ 多类名{Red.clas,Yellow.class}
 * 3.@import{ImportSelector.class} //实现接口 ImportSelector; 返回需要导入的组件全类名数组;
 *   //通过ImportSelector,获得bean
 * 4. ImportBeanDefinitionRegistrar:手动注册bean到容器中
 * 5.Spring提供的FactoryBean(工厂模式bean)  --getObject();-- get
 *     1.默认获取到的是工厂bean调用getObject创建对象
 *    2.要获取工厂Bean本身,我门需要给id前面加一个&
 *
 *
 * */
 @Bean
    public ColorFactoryBean colorFactoryBean(){
        //创建 工厂bean
     return new ColorFactoryBean();
 }










}
