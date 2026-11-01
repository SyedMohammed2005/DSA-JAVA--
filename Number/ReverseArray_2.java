import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {

        int num = 12345;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed = " + reversed);
    }
}
