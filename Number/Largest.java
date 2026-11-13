import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {

        int a = 10, b = 25, c = 15;
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Largest = " + max);
    }
}
