import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Integer > list = new ArrayList < > (Arrays.asList(3, 7, 2, 9, 5));
        int max = list.get(0);
        for (int num : list) {
            if (num > max) max = num;
        }
        System.out.println("Max = " + max);

    }
}
