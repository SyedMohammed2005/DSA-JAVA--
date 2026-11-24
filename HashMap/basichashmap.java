import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {

        int[] arr = {10, 20, 30, 20, 10, 40, 20};

        HashMap<Integer, Integer > map = new HashMap < > ();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
