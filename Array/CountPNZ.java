import java.util.*;
import java.lang.*;
import java.io.*;


        public class CountPNZ {
            public static void main(String[] args) {
                int[] arr = {1, -2, 0, 5, -3, 0, 7};
                int pos = 0, neg = 0, zero = 0;

                for (int num : arr) {
                    if (num > 0) pos++;
                    else if (num < 0) neg++;
                    else zero++;
                }
                System.out.println("Positive = " + pos + ", Negative = " + neg + ", Zero = " + zero);
            }
        }

