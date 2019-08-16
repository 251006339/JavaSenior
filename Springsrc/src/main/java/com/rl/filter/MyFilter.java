package com.rl.filter;

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
 * @date 2019/8/16 --14:21
 **/

public class MyFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        System.out.println("Filterbean");
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource = metadataReader.getResource();
        File file = resource.getFile();
        System.out.println("=扫描的包的地址.class=========" + file);
        String className = classMetadata.getClassName();
        System.out.println("--->" + className);//扫描的类的类名字
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        System.out.println("注解的类信息" + annotationMetadata.getClassName());
        /*     if(className.contains("yellow")){
                 return true;
             }*/

        return false;
    }

}
