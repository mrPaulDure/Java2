package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.competitors.*;
import ru.geekbrains.java2.lesson1.obstacles.*;

public class MainClass {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Билл")};
        Obstacle[] course = {new Cross(400), new Wall(8), new Water(10)};
        Course c = new Course(course);
        Team t = new Team("Dong", competitors);

        c.doIt(t);
        System.out.println("==================");
        t.showResult();
    }
}
