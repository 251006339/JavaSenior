import com.rl.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XAIOHU
 * @date 2019/8/15 --19:25
 **/
public class IOCTest_lifeCycle {
    @Test
      public void test01(){
          //
          AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
          System.out.println("容器创建完成>>>>");
          annotationConfigApplicationContext.close();
      }

      //创建容器之前      bean需要init-初始化   destr--销毁
    //      //oy




}
