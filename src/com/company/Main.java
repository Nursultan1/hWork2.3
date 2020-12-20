package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){

            System.out.println("Введите имя");
            String name = scanner.nextLine();
            System.out.println("Введите Возраст");
            int age = scanner.nextInt();
            scanner.nextLine();
            User user = new User();
            user.setAge(age);
            System.out.println("User"+ user);


        }

    }

}
