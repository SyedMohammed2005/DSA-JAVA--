import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int num = 25;
        int square = num * num;
        if (String.valueOf(square).endsWith(String.valueOf(num)))
        System.out.println("Automorphic");
        else
        System.out.println("Not Automorphic");

    }
}
