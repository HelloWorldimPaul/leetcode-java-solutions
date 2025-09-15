package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];

            }
        }


        return i + 1;

    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();

        int k = test.removeDuplicates(nums);

        System.out.println(k);

    }

}
