package solutions;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {



        int length = nums.length;

        for (int i = 0; i < length; i++) {

            if (nums[i] == target) {
                return i;
            }

        }

        int pointer = 0;
        for (int j = 0; j < length; j++) {

            if(target < nums[j]){

                pointer = j;
                /*
                if (j - 1 != -1) {
                    pointer = j - 1;
                }

                 */


                break;

            }else if ( target > nums[j]){


                if(nums[j] == target - 1){

                    pointer = j + 1;
                    break;

                }else{


                    pointer = j + 1;
                }


            }

        }
        return pointer;

    }

    public static void main(String[] arg) {

        SearchInsertPosition test = new SearchInsertPosition();

        int[] nums = {3,6,7,8,10};

        System.out.println(test.searchInsert(nums, 5));

    }

}
