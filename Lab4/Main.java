package Lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void print(Plane[] arr){
        //Вивести масив на екран
        for (Plane plane : arr) {
            System.out.print(" " + plane.model + " ");
        }
    }

    public static void main(String[] args) {

        Plane plane1 = new Plane("AN-225", "grey", 84, 65, "Ukraine");
        Plane plane2 = new Plane("boin-737", "white", 170, 148, "Usa");
        Plane plane3 = new Plane("B737", "green", 25, 10, "Italy");
        Plane plane4 = new Plane("ty-134", "blue", 96, 80, "China");
        Plane plane5 = new Plane("ИЛ-76МД", "black", 15, 7, "Russia");
        //Елементи Масиви з об'єктами класу
        Plane[] arr = {plane1, plane2, plane3, plane4, plane5};

        System.out.print("Planes: ");
        System.out.println("From the longest plane to the shortest:");
        //Стандартні засоби сортування
        Arrays.sort(arr, Comparator.comparingInt(Plane :: getLengths).reversed());
        print(arr);   // Вывести на экран все элементы массива

        System.out.println("\nFrom the widths plane to the biggest:");
        Arrays.sort(arr, Comparator.comparingInt(Plane ::getWidth));
        print(arr);
    }
}

