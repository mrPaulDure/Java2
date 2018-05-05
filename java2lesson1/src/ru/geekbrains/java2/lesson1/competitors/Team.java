package ru.geekbrains.java2.lesson1.competitors;

public class Team {
    private String teamName;
    private Competitor[] comp = new Competitor[4];

    public Team(String teamName, Competitor[] comp) {
        this.teamName = teamName;
        this.comp = comp;
    }

    public Competitor getComp(int i) {
        return comp[i];
    }

    public void showResult() {
        System.out.println("Team title: " + this.teamName);
        for (Competitor x : comp) {
            x.showResult();
        }
    }
}
