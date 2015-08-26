package com.excilys.controller;

import com.excilys.model.Personne;
import com.excilys.service.IPersonneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class ComputerController {


    public static void main(String... args) {
        // open/read the application context file
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IPersonneService personneService = (IPersonneService) ctx.getBean("personneService");
        Personne personne = new Personne();
        personne.setName("DJOry Test WOrk!'");
        personneService.create(personne);
        System.out.println("youhou!!!!");
        return;

    }
}
