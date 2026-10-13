import java.util.*;
import java.lang.*;
import java.io.*;
public class ContainsElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int target = 15;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("Found: " + found);
    }
}

