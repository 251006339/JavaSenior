package com.rl.config;

import com.rl.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author XAIOHU   自定义扫描是扫描下面所有类增加
 * @date 2019/8/15 --13:49   有注解的类都会被加载到
 **/      //排除Controler 注解 和Service注解  @Filter 过滤注解Annotation classes
@ComponentScan(value = "com.rl", includeFilters =
        {@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})/*, //自定义
       @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes={MainServer.class})*/},useDefaultFilters = false)
//扫描到的包.包含的// --不包含的  过滤掉不需要扫描到
@Configuration
//@ComponentScan value:指定扫描的包
//excludeFilters=Filter[] 指定扫描的时候按照规则排除
//incluedFilters=Filter[] 指定扫描哪些
//FilterType.ANNOTATION 按照注解的来扫描;
//FilterType.ASSIGNABLE_TYPE 按照给定的类型;
//FilterType.ASPECTJ 使用aspectj表达式
//FilterType.REGEX 使用正则表达式 过滤类型
//FilterType.CuSTOM .使用自定义规则 Type
public class MainConfig{  //扫描都是server,或者dao的包 ,前面的不归这个管理
@Bean("person")
    public Person getPerson(){

    return new Person("121",2);
}


}
