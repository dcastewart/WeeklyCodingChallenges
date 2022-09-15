public class Partition {
    
    public static boolean canPartition(int[] nums){
        if(nums.length == 1) return false;

        //find product of all but first element
        int product = nums[1];
        for(int i = 2; i < nums.length; i++){
            product = product * nums[i];
        }

        //check if we can partition at first element
        if(nums[0] == product) return true;

        //remove current element from overall product and add previous element
        //This avoids a nested loop - O(n) instead of O(n^2)
        for(int i = 1; i < nums.length; i++){
            product = product / nums[i];
            product = product * nums[i-1];
            if(product == nums[i]) return true;
        }



        return false;
    }

    public static void main(String[] args){

        int[] nums = {1, 4, 8, 2};
        System.out.println(canPartition(nums));

    }
}
