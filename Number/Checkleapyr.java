import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {

        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        System.out.println("Leap Year");
        else
        System.out.println("Not Leap Year");
    }
}
