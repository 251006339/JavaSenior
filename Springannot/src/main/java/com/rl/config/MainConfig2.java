package com.rl.config;

import com.rl.bean.Person;
import com.rl.condition.LinuxCondition;
import com.rl.condition.WindowCondition;
import org.springframework.context.annotation.*;


/**
 * @author XAIOHU
 * @date 2019/8/15 --15:53
 **/
//配置在类上.满足当前条件,这个类中配置的所有bean注册才能生效
  //条件修饰在类上统一设置 不合适条件的都不会创建
@Conditional(LinuxCondition.class)
@Configuration

public class MainConfig2 {
    //ConfigurableBeanFactory
    //singleton 单实例的(默认值),ioc容器启动会调用方法创建对象放到ioc容器中;
    // 懒加载 单实例bean是饿汉式加载,默认容器启动加载;

    //@Scope("prototype")  //作用范围  多实例的,ioc初始化容器不会创建,懒加载.会在获得bean时,再创建对象;
    @Conditional(WindowCondition.class) //加入条件扫描 需要实现 Condition 定义方法
    @Bean("person")//
    @Scope("")//默认是单例的,可以定多例prototry
    @Lazy   //懒加载
    public Person getPerson() {
        System.out.println("默认的是否单实例");
        return new Person("re", 3);
    }

    //按照条件给 按照一定的条件进行判断,满足条件给容器中注册bean
    @Conditional(WindowCondition.class) //条件修饰的@Bean会在条件达到要求时才创建@Bean
    @Bean("bill")
    public Person person01() {
        return new Person("Bill Gates", 62);
    }

    ;

    @Conditional(LinuxCondition.class) //这个类实现的接口是true才会实例化这个类吗
    @Bean("linux")
    public Person person02() {

        return new Person("linux", 42);

    }
    //selectImports
    //给容器中注册组件
    /*
    1.

    */









}
