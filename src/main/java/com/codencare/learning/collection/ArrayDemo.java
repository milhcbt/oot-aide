package com.codencare.learning.collection;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] ai1;
        int[][][] ai2;
        
        ai1 = new int[2];
        System.out.println("ai1.length:"+ai1.length);
        ai1[0] = 1;
        ai1[1] = 2;
        //ai1[2] = 3; //ArrayIndexOutOfBoundsException

        ai2 = new int[2][3][4];
        System.out.println("ai2.length:"+ai2.length);
        ai2[0][0][0] = 1;
        ai2[0][0][1] = 2;
        ai2[0][0][2] = 3;
        ai2[0][0][3] = 4;

        ai2[0][1][0] = 5;
        ai2[0][1][1] = 6;
        ai2[0][1][2] = 7;
        ai2[0][1][3] = 8;

        ai2[0][2][0] = 9;
        ai2[0][2][1] = 10;
        ai2[0][2][2] = 11;
        ai2[0][2][3] = 12;

        ai2[1][0][0] = 13;
        ai2[1][0][1] = 14;
        ai2[1][0][2] = 15;
        ai2[1][0][3] = 16;

        ai2[1][1][0] = 17;
        ai2[1][1][1] = 18;
        ai2[1][1][2] = 19;
        ai2[1][1][3] = 20;

        ai2[1][2][0] = 21;
        ai2[1][2][1] = 22;
        ai2[1][2][2] = 23;
        ai2[1][2][3] = 24;

        for (int i = 0; i < 2; i++) {
            System.out.print("{");
            for (int j = 0; j < 3; j++) {
                System.out.print("(");
                for (int k = 0; k < 4; k++) {
                    System.out.print(ai2[i][j][k]);
                    if (k != 3) {
                        System.out.print(",");
                    }
                }
                System.out.print(")");
                if (j != 2) {
                    System.out.print("\t");
                }
            }
            System.out.print("}\n");
        }

       System.out.println(Arrays.binarySearch(ai1, 0, 2, 3));
    }
}
