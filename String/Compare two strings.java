import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {

        String s1 = "Hello";
        String s2 = "Hella";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("Difference at index " + i);
                System.out.println(s1.charAt(i) + " vs " + s2.charAt(i));
            }
        }
    }
}
