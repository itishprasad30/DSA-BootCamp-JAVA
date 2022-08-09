package Conversion;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Conversion conv = new Conversion();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Decimal number : ");
        int dec = in.nextInt();

        System.out.println("Equalant Binary is : " + conv.decToBin(dec));
        System.out.println("Equalant Octal is : " + conv.decToOct(dec));
        System.out.println("Equalant HexaDecimal is : " + conv.decToHex(dec));
    }
}
