import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
    public static void main (String[] args) throws java.lang.Exception
    {

        ArrayList<Integer > list = new ArrayList < > (Arrays.asList(10, 20, 30));
        list.remove(Integer.valueOf(20)); // removes by value
        System.out.println(list);
    }
}
