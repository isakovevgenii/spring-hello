package net.proselyte.springhellotutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Здесь мы в первую очередь создаём контекст используя API ClassPathXmlApplicationContext().
 * Это API загружает конфигурационный файл “spring-hello-bye-bean.xml” и
 * создаёт и инициализирует все бины внутри этого файла.
 * Далее мы используем метод getBean() этого контекста.
 * Этот метод принимает в качестве аргумента id бина.
 */
public class SpringRunner {
    public static void main(String[] args) {

        //Здесь мы в первую очередь создаём контекст используя API ClassPathXmlApplicationContext().
        // Это API загружает конфигурационный файл “spring-hello-bean.xml” и создаёт и инициализирует все бины внутри этого файла.
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring-hello-bye-bean.xml");

        //Далее мы используем метод getBean() этого контекста. Этот метод принимает в качестве аргумента id бина.
        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.setHelloMessage("hello world");
        System.out.println(springHelloWorld.getHelloMessage());

        //Еще раз используем метод getBean() этого контекста.
        SpringHelloWorld oneMoreSpringHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        //getHelloMessage() выведет тоже самое что и предыдущий, т.к. этот bean singleton
        System.out.println(springHelloWorld.getHelloMessage());

        //анналогичные действия, что и выше только с объектом класса бина-потомка
        SpringByeWorld springByeWorld = (SpringByeWorld) context.getBean("springByeWorld");
        springByeWorld.setHelloMessage("koza");
        springByeWorld.setByeMessage("naga");
        System.out.println(springByeWorld.getHelloMessage());
        System.out.println(springByeWorld.getByeMessage());
        springByeWorld.springByeWorldCheck();

        //Зарегистрируйте привязку завершения работы с временем выполнения JVM,
        // закрыв этот контекст при завершении JVM,
        // если он уже не был закрыт при этом время.
        //
        // После этого вызовется destroy-method
        context.registerShutdownHook();
    }
}
