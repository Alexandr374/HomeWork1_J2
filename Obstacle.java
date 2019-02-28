package ru.geekbrains.lesson_1_J2;

public abstract class Obstacle {
    protected final int size;

    protected Obstacle(int size) {
        this.size = size;
    }


    public abstract void doIt(Animal a);
}