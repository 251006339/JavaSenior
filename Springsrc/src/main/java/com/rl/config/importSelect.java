package com.rl.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author XAIOHU
 * @date 2019/8/16 --13:22
 **/
public class importSelect implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.rl.bean.Yellow"};
    }
}
