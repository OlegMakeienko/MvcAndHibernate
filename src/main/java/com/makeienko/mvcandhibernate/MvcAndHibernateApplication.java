package com.makeienko.mvcandhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcAndHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcAndHibernateApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner run(ClientRepository clientRepository) {
//        return args -> {
//            clientRepository.save(new Client("Oleg", "Makeienko", 41, "molva83@gmail.com", "Citroen"));
//            //courseRepository.save(new Client(2l, "Physics", 25));
//            //courseRepository.save(new Client(3l, "Biology", 35));
//        };
//    }

}
