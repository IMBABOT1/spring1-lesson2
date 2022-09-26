package ru.geekbrains.spring1.lesson2.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.spring1.lesson2.context.configs.AppConfig;
import ru.geekbrains.spring1.lesson2.context.temp.Cart;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean(Cart.class);

        while (true){
            System.out.println("set number to add product");
            System.out.println("press /end to exit");

            String cmd = sc.nextLine();

            if (cmd.equals("/end")){
                break;
            }else if (cmd.equals("/add1")){
                cart.add(1l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add2")){
                cart.add(2l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add3")){
                cart.add(3l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add4")){
                cart.add(4l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add5")){
                cart.add(5l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add6")){
                cart.add(6l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add7")){
                cart.add(7l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add8")){
                cart.add(8l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add9")){
                cart.add(9l);
                System.out.println(cart.findAll());
            }else if (cmd.equals("/add10")){
                cart.add(10l);
                System.out.println(cart.findAll());
            }
        }


        context.close();
    }
}
