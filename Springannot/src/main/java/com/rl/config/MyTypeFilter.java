package com.rl.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.File;
import java.io.IOException;

/**
 * @author XAIOHU
 * @date 2019/8/15 --14:21
 * 类型过滤 TypeFilter -->MyTypeFilter MyTypeFilter
 *  类型过滤加载@Filter 注解过滤掉不需要的注解,或者是包含一些注解
 **/
public class MyTypeFilter implements TypeFilter {
      //metadataReader:读取到的当前正在扫描的类
    //metadataReadFactory:可以读取到其他任意类的信息

     //match 匹配 match 匹配match
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
    //获得当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();//注解的元数据
//获得当前正在扫描的类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
    //获得当前类的资源(类的路径)
        Class<? extends ClassMetadata> aClass = classMetadata.getClass();
        System.out.println(aClass);
        System.out.println("------------------------------------------------");
        Resource resource = metadataReader.getResource();

        File file = resource.getFile();
        System.out.println(file);
        //获得类的名字
        String className = classMetadata.getClassName();
        System.out.println("className = " + className);
        //如果有包含er元素,则返回true ,如果没有则返回false;
      /*  if(className.contains("er")){
               return true;  //如果类名包含有er就返回类型;
           }*/

        return  true;
    }
}
