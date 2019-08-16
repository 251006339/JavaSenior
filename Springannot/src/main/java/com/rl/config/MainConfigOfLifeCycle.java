package com.rl.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author XAIOHU
 * @date 2019/8/15 --19:23
 * 1指定init-method和destoy-method 销毁方法
 * 2.构造(对象创建)-->单实例:在容器启动的时候创建对象
 *                   多实例:在每次获取的时候创建对象
 *   初始化:对象创建完成,并赋值好,调用初始化方法....
 *   销毁:
 *      单实例:容器关闭的时候;
 *      多实例:容器不会管理这个bean,容器不会调用销毁方法;
 *
 *   1指定初始化和销毁法方法:
 *   通过@Bean指定init-method和destroy-method;
 *   2,通过让bean实现InitializingBean(定义初始化逻辑)
 *     DisposableBean(定义销毁)
 *
 *
 *
 **/
@Configuration
public class MainConfigOfLifeCycle {



}
