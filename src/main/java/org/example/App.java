package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AutoFactory autoFactory = ctx.getBean("autoFactory", AutoFactory.class);
        autoFactory.setProductionSize(5);
        autoFactory.runProduction();

        System.out.println("Cars built :" +  autoFactory.getCarsBuilt());
    }

}
