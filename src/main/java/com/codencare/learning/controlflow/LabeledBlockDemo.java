package com.codencare.learning.controlflow;

public class LabeledBlockDemo {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Break @ 5");
        for (; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("  i = " + i);
        }
        System.out.println("Break @ 5");

        i = 0;
        System.out.println("continue @ 5 ");
        for (; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("  i = " + i);
        }
        System.out.println("continue @ 5 ");
        System.out.println("break aloop @ 5 ");
        init:
        {
            i = 0;
            aloop:
            for (; i < 10; i++) {
                for (char j = 'a'; j < 'c'; j++) {
                    if (i == 5) {
                        break aloop;
                    }
                    System.out.print(" j = " + j);
                }
                System.out.println("  i = " + i);
            }
            System.out.println("after aloop");
        }
        System.out.println("break aloop @ 5 ");
        System.out.println("continue aloop @ 5 ");
        i = 0;
        init:
        {
            i = 0;
            aloop:
            for (; i < 10; i++) {
                bloop:
                for (char j = 'a'; j < 'c'; j++) {
                    if (i == 5) {
                        continue aloop;
                    }
                    System.out.print("  j = " + j);
                }
                System.out.println(" <== i = " + i);
            }
        }
        System.out.println("continue aloop @ 5 ");
        System.out.println("continue bloop @ 5 ");
        init:
        {
            i = 0;
            aloop:
            for (; i < 10; i++) {
                bloop:
                for (char j = 'a'; j < 'c'; j++) {
                    if (i == 5) {
                        continue bloop;
                    }
                    System.out.print("  j = " + j);
                }
                System.out.println(" <== i = " + i);
            }
        }
        System.out.println("diluar block");
    }
}
