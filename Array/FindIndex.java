import java.util.*;
import java.lang.*;
import java.io.*;
public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int target = 300;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Index = " + i);
                return;
            }
        }
        System.out.println("Not found");
    }

}
