import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
int a = 36, b = 60;
while (b != 0) {
    int temp = b;
	    b = a % b;
		    a = temp;
			}
			System.out.println("GCD = " + a);
	}
}