import com.rl.bean.Person;
import com.rl.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XAIOHU
 * @date 2019/8/15 --13:21
 **/
public class MainTest {
    public static void main(String[] args) {
      /*  ClassPathXmlApplicationContext classPathXmlApplication = new ClassPathXmlApplicationContext();
        Object person = classPathXmlApplication.getBean("person");
        System.out.println(person);*/
        AnnotationConfigApplicationContext anntationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);//之前是穿配置文件,现在是配置类
        Object bean = anntationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);
    }



}
