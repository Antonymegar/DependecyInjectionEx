package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[]args){
      ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class) ;
       Car engine = ctx.getBean(Car.class);
      System.out.println("engine:"+ engine.showEngineHp());
      ((AnnotationConfigApplicationContext)ctx).close();
  }
}
