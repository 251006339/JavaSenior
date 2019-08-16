package com.rl.config;

import com.rl.bean.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XAIOHU
 * @date 2019/8/16 --11:10
 **/
@Configuration
public class MainConfig4 {

    @Bean("yellow")
    public Yellow getYellow(){

        return new Yellow();
    }


}
