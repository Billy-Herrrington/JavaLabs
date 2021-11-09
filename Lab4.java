package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Plane plane1 = new Plane("an-225", "grey", 84, 65, "Ukraine");
        Plane plane2 = new Plane("boin-737", "white", 170, 148, "Usa");
        Plane plane3 = new Plane("kuk-13", "green", 25, 10, "Uknown");
        Plane plane4 = new Plane("ty-134", "blue", 96, 80, "China");
        Plane plane5 = new Plane("Як-130", "black", 15, 7, "Russia");
        //Масиви з об'єктами класу
        Plane[] arr = {plane1, plane2, plane3, plane4, plane5};

        System.out.print("Planes: ");

        System.out.println("From the longest plane to the shortest:");
        //Стандартні засоби сортування
        Arrays.sort(arr, Comparator.comparingInt(Plane :: getLengths).reversed());

        System.out.println("From the smallest plane to the biggest:");
        Arrays.sort(arr, Comparator.comparingInt(Plane :: getSeat));
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i].model + " ");
        }
    }
}

class Plane {
    String model;
    String colour;
    /**
     *
     */
    int length; //довжінна
    int seat; //cидіння
    String mfr; //Країна світу
    public int getSeat() {
        return seat;
    }
    public int getLengths() {
        return length;
    }

    public void setLengths(int lengths) {
        this.length = lengths;
    }

    public Plane(String model, String colour, int length, int seat, String mfr) {
        this.model = model;
        this.colour = colour;
        this.length = length;
        this.seat = seat;
        this.mfr = mfr;
    }
}
