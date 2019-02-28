package ru.geekbrains.lesson_1_J2;

class Team {
    private String nameTeam;
    private Animal [] members;

    Team(String nameTeam, Animal[] animals){
        this.nameTeam = nameTeam;
        this.members = animals;
    }

    void showAllMembers(){
        System.out.println("Team name - "+ nameTeam);
        for (Animal a :members) {
            System.out.println(a.name);
        }
    }

    void showResult(){
        for (Animal al2 : members) {
            System.out.println(al2.getName() + " on distance " + al2.isOnDistance());
        }
    }

}
