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

        System.out.println("Enter the OCtacl Number ");
        int oct = in.nextInt();
        System.out.println("Equivalant Decimal number is  : " + conv.octToDec(oct));

        System.out.println("Enter the Binary Number : ");
        int bin = in.nextInt();
        System.out.println("Equivalant Decimal number is "+ conv.binToDec(bin));
    }
}
