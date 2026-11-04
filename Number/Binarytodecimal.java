import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String binary = "1010";
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1')
            decimal += Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal = " + decimal);

    }
}
