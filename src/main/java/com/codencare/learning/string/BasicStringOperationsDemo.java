package com.codencare.learning.string;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BasicStringOperationsDemo {

    public static void main(String[] args) {
        String lagu = "Halo-halo Bandung\nIbukota periangan\nHalo-halo Bandung\nKota kenang-kenangan"
                + "\n\tSudah lama beta\n\tTidak berjumpa dengan kau\n\tSekarang telah menjadi lautan api\n\tMari bung rebut kembali";
        String kota = "===================================="
                + "\nKota\t\t: %s"
                + "\npopulasi\t: %d"
                + "\nislam\t\t: %.2f%%"
                + "\nkatolik\t\t: %.2f%%"
                + "\npertumbuhan\t: %2.4f%%"
                + "\nhari jadi\t:  %6$te %6$tB %6$tY"
                + "\n====================================\n";
        Calendar c = new GregorianCalendar(1810, 9, 25);
        System.out.printf(kota, "Bandung", 2771138, 92.89, 2.79, (((2390120f - 2364312f) / 2364312f)) * 100, c);
        System.out.println("Lagu:\n" + lagu);
        System.out.println("Panjang Lagu: " + lagu.length() + "karakter");
        System.out.println("Berisi Bandung? " + lagu.contains("Bandung"));
        String bdg = "Bandung";
        System.out.println(bdg.equals("bandung"));
        System.out.println(bdg.equalsIgnoreCase("bandung"));
    }
}
