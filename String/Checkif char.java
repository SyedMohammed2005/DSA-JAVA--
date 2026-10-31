import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String str = "Hello World";
        char target = 'W';
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                found = true;
                break;
            }
        }
        System.out.println("Found: " + found);

    }
}
