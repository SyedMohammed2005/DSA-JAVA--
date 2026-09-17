import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int n = 7;
		int a = 0;
		int b = 1;
		System.out.println("Fibonacci Series up to " + n + " terms:");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println();
	}
}