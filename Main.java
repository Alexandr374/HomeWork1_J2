package ru.geekbrains.lesson_1_J2;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(2, 1),
                new Dog(8, 10, 4),
                new Duck(4, 10)
        };

        Obstacle[] obstacles = {new Road(8), new Water(3), new Wall(2)};
        Team team = new Team("losers", animals);
        Course course = new Course(obstacles, animals);

        team.showAllMembers();
        course.doIt(team);
        team.showResult();
    }
}
