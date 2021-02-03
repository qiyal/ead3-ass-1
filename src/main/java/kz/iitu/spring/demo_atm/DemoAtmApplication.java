package kz.iitu.spring.demo_atm;

import models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoAtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAtmApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ATM atm = context.getBean("atm", ATM.class);
        atm.run();
//        Account account =context.getBean("account1", Account.class);
//        System.out.println(account);
//        account.setBalance(1111.0);
//        System.out.println(account);
//
//        Card card = context.getBean("card2", Card.class);
//        System.out.println(card);
//
//        Client client = context.getBean("client3", Client.class);
//        System.out.println(client);
//
//        Bank bank = context.getBean("bank", Bank.class);
//        System.out.println(bank);
//
//        System.out.println(atm);
    }

}
