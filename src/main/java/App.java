import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("getHelloWorld");
        System.out.println(bean.getMessage());
        bean.getMessage();
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("getHelloWorld");
        System.out.println(bean2==bean);
        Cat cat = (Cat) applicationContext.getBean("catBean");
        Cat cat2 = (Cat) applicationContext.getBean("catBean");
        System.out.println(cat==cat2);
    }
}