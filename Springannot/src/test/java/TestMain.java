import com.rl.bean.Person;
import com.rl.config.MainConfig;
import com.rl.config.MainConfig2;
import com.rl.config.MainConfig3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author XAIOHU
 * @date 2019/8/15 --13:41
 **/
public class TestMain {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);

    @Test
    public void test(){
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
    Person bean = annotationConfigApplicationContext.getBean(Person.class);
    System.out.println(
            bean
    );
}
    @Test
    public void test1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);
          //扫描bean定义名字 扫描到所有注解定义的类名,转换成小写 ->包扫描 includeFilters() excludeFilers()
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
    @Test
    public void test3(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
         //第一次根据Person.class对象获取 .第二次根据字符串person
          //ioc 创建完成;
        System.out.println("ioc容器创建完成");
        Object person = annotationConfigApplicationContext.getBean("person");
        Object person1 = annotationConfigApplicationContext.getBean("person");
        System.out.println(person==person1); //单例的
        System.out.println(person);

    }

    @Test
    public void test4(){
       //获得注解@bean对应的name
        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
       //获得运行环境 动态   环境
        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        //动态获取环境变量 获得操作系统
        String property = environment.getProperty("os.name");
        System.out.println(property);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        //String  person -->类名,  类的实例
        Map<String, Person> beansOfType = annotationConfigApplicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);

    }
    @Test
    public void test5(){

        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {

            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test6(){

        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
      //获得Color 实例对象
        Object colorFactoryBean = annotationConfigApplicationContext.getBean("colorFactoryBean");
        System.out.println(colorFactoryBean);
        Object bean = annotationConfigApplicationContext.getBean("&colorFactoryBean");
        System.out.println(bean);  //获得工厂类
}



    }



