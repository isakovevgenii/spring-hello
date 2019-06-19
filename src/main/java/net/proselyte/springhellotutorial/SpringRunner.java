package net.proselyte.springhellotutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Здесь мы в первую очередь создаём контекст используя API ClassPathXmlApplicationContext().
 * Это API загружает конфигурационный файл “spring-hello-bean.xml” и
 * создаёт и инициализирует все бины внутри этого файла.
 * Далее мы используем метод getBean() этого контекста.
 * Этот метод принимает в качестве аргумента id бина.
 */
public class SpringRunner {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring-hello-bye-bean.xml");

        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.setHelloMessage("hello world");
        springHelloWorld.getHelloMessage();

        SpringHelloWorld oneMoreSpringHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.getHelloMessage();
    }
}
