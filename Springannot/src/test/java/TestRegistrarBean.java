import com.rl.config.MainConfig4;
import com.rl.config.MainConfig5;
import org.junit.Test;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;

/**
 * @author XAIOHU
 * @date 2019/8/16 --11:12
 **/
public class TestRegistrarBean {
    @Test
    public void test() {


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);

        Object bean = annotationConfigApplicationContext.getBean("yellow");
        System.out.println(bean);
    }

    @Test
    public void test1() {


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig5.class);
         //获得bean定义的名字
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        Collection<ApplicationListener<?>> applicationListeners =
                annotationConfigApplicationContext.getApplicationListeners();
        for (ApplicationListener<?> applicationListener : applicationListeners) {
            System.out.println(applicationListener);

        }

    }
    
}