import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int num = 9;
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        if (sum == num) System.out.println("Neon Number");
        else System.out.println("Not Neon Number");

    }
}
