import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {

        int num = 12345;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
