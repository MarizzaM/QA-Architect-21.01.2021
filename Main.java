package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dog Rexi = new Dog();
        Rexi.name = "Rexi";
        Rexi.color = "brown";
        Rexi.height = 0.57f;
        Rexi.brand = "wolf";
        System.out.println(Rexi.name);
        System.out.println(Rexi.color);
        System.out.println(Rexi.height);
        System.out.println(Rexi.brand);
        Rexi.bark();
        Rexi.jump();
        Rexi.sayYourName();

        Dog Socks = new Dog();
        Socks.name = "Socks";
        Socks.color = "white";
        Socks.height = 0.4f;
        Socks.brand = "chiwawa";
        System.out.println(Socks.name);
        System.out.println(Socks.color);
        System.out.println(Socks.height);
        System.out.println(Socks.brand);
        Socks.bark();
        Socks.jump();
        Socks.sayYourName();
    }
}
