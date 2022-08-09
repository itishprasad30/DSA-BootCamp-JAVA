package Conversion;

//Decimal to Binary
public class Conversion {
    // Converting to decmimal to binary
    String decToBin(int dec){
        String bin = "";
        do {
            int b = dec % 2;
            bin = b + bin;
            dec = dec / 2;
        }while (dec != 0);
        return bin;
    }

    // Converting to decimal to octal
    String decToOct(int dec){
        String oct = "";
        do {
            int r = dec % 8;
            oct = r + oct;
            dec = dec / 8;
        }while (dec != 0);
        return oct;
    }

    // converting to decimal to hexadecimal
    String decToHex(int dec){
        String hx = "";
        do {
            int r = dec % 16;
            if(r< 10){
                hx = r + hx;
            } else  {
                hx = (char) (r+ 55)+ hx;
            }
            dec = dec / 16;
        }while (dec != 0);
        return hx;
    }

}
