package ru.geekbrains.lesson_1_J2;

class Course {
    private Obstacle [] obstacles;
    private Animal [] members;

    Course(Obstacle[] obstacles, Animal[] members) {
        this.obstacles = obstacles;
        this.members = members;
    }

    void doIt(Team team) {
        for (Obstacle o:obstacles) {
            for (Animal a:members) {
                o.doIt(a);
            }
        }
    }
}
