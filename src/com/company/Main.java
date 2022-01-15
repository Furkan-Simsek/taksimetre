package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Taksimetre Programı
        * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        * Taksimetre KM başına 2.20 TL tutmaktadır.
        * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        * Taksimetre açılış ücreti 10 TL'dir.
        */
	Scanner inp = new Scanner(System.in);

    double baslangic;
    double km;
    double tutar;
    baslangic = 10;
    System.out.print("Gidilen mesafeyi girin(km olarak örn 1 or 0.5): ");
    km = inp.nextDouble();
    tutar = 2.20 * km;
    System.out.println((tutar > 20) ? "Taksimetre tutarı: " + tutar + "TL'dir" : "Taksimetre tutarı 20 TL'dir" );
    }
}
