package solutions;

public class RemoveElement {


    public int removeElement(int[] nums, int val) {

        /*
        int k = 0; // next position to place non-val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        for(int num : nums){

            System.out.println(num);
        }




        return k;

         */


        int length = nums.length;

        int count = 0;
        int tempJ = length - 1;
        for(int i = 0; i < length; i++){

            if(i + 1 == length){
                break;
            }


            if(nums[i] == val){

                for(int j = tempJ; j >= 0; j--){

                    if(j == i){

                        break;
                    }

                    if(nums[j] != val){
                        nums[i] = nums[j];
                        tempJ = j - 1;
                        break;
                    }


                }


            }else{

                count++;

            }


        }

        for(int num : nums){

            System.out.println(num);
        }


        return count;




    }

    public static void main(String[] args) {

        RemoveElement test = new RemoveElement();

        int[] nums = {3,2,2,3};

        System.out.println(test.removeElement(nums, 3));

    }

}
