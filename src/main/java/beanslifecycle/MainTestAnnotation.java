package beanslifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanslifecycle/beanslifecycleannotation.xml");
        BeansLifeCycleAnnotation beansLifeCycleAnnotation = applicationContext.getBean("beansLifeCycleAnnotation",BeansLifeCycleAnnotation.class);
        applicationContext.close();
    }
}
