import java.util.*;
import java.lang.*;
import java.io.*;


        public class SmallestElement {
            public static void main(String[] args) {
                int[] arr = {3, 7, 2, 9, 5};
                int min = arr[0];

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) min = arr[i];
                }
                System.out.println("Smallest = " + min);
            }
        }

