package beanslifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanslifecycle/beanslifecyclexml.xml");
        BeansLifeCycleXML beanslifecyclexml = applicationContext.getBean("beanslifecyclexml", BeansLifeCycleXML.class);
        beanslifecyclexml.destroy();
    }
}
