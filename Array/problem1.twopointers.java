import java.util.*;
import java.lang.*;
import java.io.*;
class CodeJ {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4};
        
        if (nums.length == 0)
            return;
        
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        // i is the index of the last unique element
        int uniqueCount = i + 1;
        System.out.println("Number of unique elements: " + uniqueCount);
        
        // Print the unique elements
        System.out.print("Unique elements: ");
        for (int k = 0; k < uniqueCount; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}