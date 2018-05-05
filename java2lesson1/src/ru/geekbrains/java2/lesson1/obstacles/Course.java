package ru.geekbrains.java2.lesson1.obstacles;

import ru.geekbrains.java2.lesson1.competitors.Team;

public class Course {
    private Obstacle[] obstacles = new Obstacle[3];

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[i].doIt(team.getComp(j));
            }
        }
    }
}
