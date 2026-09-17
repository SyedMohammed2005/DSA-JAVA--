import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int ans1 = -1, ans2 = -1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans1 = i;
					ans2 = j;
					break;
				}
			}
		}

		System.out.println("Target " + target + " found at indices: [" + ans1 + ", " + ans2 + "]");
	}
}