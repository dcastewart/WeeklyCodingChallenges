import java.util.HashMap;
import java.util.Map;

public class ReorderDigits {
	public static int[] reorderDigits(int[] nums, String order){
        int[] newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            Map<Integer, Integer> digits = new HashMap<>(); 
            int current = nums[i];
            while(current > 0){
                int num = current % 10;
                Integer count = digits.get(num);
                if(count == null){
                    digits.put(num, 1);
                } else {
                    digits.put(num, count + 1);
                }

                current = current / 10;
            }

            for(int j = 0; j < 10; j++){
                if(digits.get(j) == null){
                    digits.put(j, 0);
                }
            }

            if(order.equals("asc")){
                String s = "";
                for(int j = 0; j < 10; j++){
                    for(int k = 0; k < digits.get(j); k++){
                        s += j;
                    }
                }
                int x = Integer.parseInt(s);
                newNums[i] = x;

            } else if(order.equals("desc")){
                String s = "";
                for(int j = 9; j >= 0; j--){
                    for(int k = 0; k < digits.get(j); k++){
                        s += j;
                    }
                }
                int x = Integer.parseInt(s);
                newNums[i] = x;

            } else {
                System.out.println("Invalid ordering type: Must be \"Asc\" or \"Desc\"");
                return nums;
            }
        }

        return newNums;
    }

    public static void main(String[] args){
        int[] nums = {515,341,98,44,211};

        
        int[] numsAsc = reorderDigits(nums, "asc");
        int[] numsDesc = reorderDigits(nums, "desc");
        System.out.println("==================Ascending");
        for(int i = 0; i < numsAsc.length; i++){
            System.out.println(numsAsc[i]);
        }
        System.out.println("==================Descending");
        for(int i = 0; i < numsDesc.length; i++){
            System.out.println(numsDesc[i]);
        }
        
    }

}
