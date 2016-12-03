package com.example;

import com.example.di.xml.BeanForCollections;
import com.example.di.xml.BeanForFactoryMethod;
import com.example.di.xml.DI_Constructor;
import com.example.di.xml.DI_Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
		DI_Constructor di_constructor = context.getBean("di_constructor", DI_Constructor.class);
        di_constructor.out(1);

        DI_Setter di_setter = context.getBean("di_setter", DI_Setter.class);
        di_setter.out(2);

        DI_Setter di_setter1 = context.getBean("di_setter_pnamespace", DI_Setter.class);
        di_setter1.out(3);

        DI_Constructor di_constructor1 = context.getBean("di_constructor_cnamespace", DI_Constructor.class);
        di_constructor1.out(4);

        DI_Setter di_setter2 = context.getBean("di_setter_idref", DI_Setter.class);
        di_setter2.out(5);

        BeanForFactoryMethod beanForFactoryMethod = context.getBean("di_factoryMethod", BeanForFactoryMethod.class);
        beanForFactoryMethod.out(6);

        BeanForCollections beanForCollections = context.getBean("di_collections", BeanForCollections.class);
        beanForCollections.out(7);

//        context.getBean("beanHole", BeanHole.class);

	}
}
