package Later;

import java.util.Random;

public class Lab2 {
//C5: C=a×B, a - const
//C7: Тип индексу int
//Обчислити суму найбільших елементів в стовпцях матриці
//з парними номерами та найменших елементів в стовпцях матриці з непарними номерами
    public static void main(String[] args) {

//Input B
        int [][] B = {
                {7, 1, 13},
                {6, 7, 6},
                {5, 8, 1},
                {4, 2, 4}};

//Метод Random для матрицы B
//        int [][] B = new int[4][3];
//        Random rnd=new Random();
//        for (int i=0;i < B.length;i++){
//            for (int j=0;j < B[i].length;j++){
//                B[i][j]=rnd.nextInt(13)+1;
//            }
//        }

        System.out.println("B = ");
        for (int j = 0; j < B.length; j++){
            for(int i = 0; i < B[j].length; i++){
                System.out.print(B[j][i] + ",  ");
            }
            System.out.println();
        }

//Multiply B on 'a'. 'a' - const
        int C[][] = B.clone();
        final int a = 5;
        for(int j = 0; j < C.length; j++){
            int l = C[j].length;
            for(int i = 0; i < l; i++){
                C[j][i] *= a;
            }
        }
        System.out.println("\n" + "a = " + a);

//Output C
        System.out.println("\n" + "C = a*B = ");
        for (int j = 0; j < C.length; j++){
            for(int i = 0; i < C[j].length; i++){
                System.out.print(C[j][i] + ",  ");
            }
            System.out.println();
        }


//Проверка прямоугольности матрицы
        for (int j = 0; j < C.length; j++){
            for(int i = 0; i < C[j].length; i++){
                if (C[0].length != C[j].length){
                    System.out.println("Please, enter rectangular array");
                    System.exit(0);
                }
            }
        }

        long result = 0;
        for(int i = 1; i <= C[0].length; i++){
            for(int j = 1; j <= C.length; j++){
                int m = C[j - 1][i - 1];
                if (i % 2 == 0){
                    for (j = 1; j <= C[j - 1].length; j++){

                        if (C[j - 1][i - 1] > m){
                            m = C[j - 1][i - 1];
                        }
                    }
                    result += m;
                    System.out.println("Максимальне значення у стовпці [" + i + "] = " + m);
                }
                else{
                    for (j = 1; j <= C[j - 1].length; j++){
                        if (C[j - 1][i - 1] < m){
                            m = C[j - 1][i - 1];
                        }
                    }
                    result += m;
                    System.out.println("Мінімальне значення у стовпці [" + i + "] = " + m);
                }
            }
        }
        System.out.println("\n" + "Результат = " + result);
    }
}
