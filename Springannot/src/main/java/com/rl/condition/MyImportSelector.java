package com.rl.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author XAIOHU
 * @date 2019/8/15 --18:19
 **/
//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
   //返回值,就是到导入到容器中组件全类名
    //Annotatian

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

      //注册Bean ;;
        return new String[]{"com.rl.bean.Yellow","com.rl.bean.Red"};
    }
}
