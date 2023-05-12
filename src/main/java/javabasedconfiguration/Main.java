package javabasedconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojobeans.AccountService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(BeanConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        System.out.println("Before money transfer");
        System.out.println("Account 1 balance: " + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: " + accountService.getAccount(2).getBalance());
        accountService.transferMoney(1, 2, 7.0);
        System.out.println("==============");
        System.out.println("After money transfer");
        System.out.println("Account 1 balance: " + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: " + accountService.getAccount(2).getBalance());
    }
}
