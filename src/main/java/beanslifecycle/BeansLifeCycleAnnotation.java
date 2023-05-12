package beanslifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeansLifeCycleAnnotation {
    @PostConstruct
    public void init() throws Exception{
        System.out.println("init methos id called");
    }
    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("destroy methos id called");
    }
}
