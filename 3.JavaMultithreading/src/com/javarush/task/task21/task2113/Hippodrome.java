package com.javarush.task.task21.task2113;

import java.util.ArrayList;


/**
 * Created by Me on 15.03.2017.
 */
public class Hippodrome {



    public    ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;


    public Hippodrome(ArrayList<Horse> horses) {
        this.horses = horses;
    }




    public static void main (String[] args) throws InterruptedException{
        game = new Hippodrome(new ArrayList<Horse>());
        Horse pegas = new Horse("Pegas",3,0);
        Horse ralph = new Horse("Ralph",3,0);
        Horse ronald = new Horse("Ronald",3,0);
        game.getHorses().add(pegas);
        game.getHorses().add(ralph);
        game.getHorses().add(ronald);
    }



    public ArrayList<Horse> getHorses() {
        return horses;
    }



     void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }


     void move() {


    }

     void print() {

    }





}
