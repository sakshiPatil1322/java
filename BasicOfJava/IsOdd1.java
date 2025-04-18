
public class IsOdd1 {
    public static boolean isOdd(int[] arr){
        for(int l : arr){
            if((l%2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {1,3,5};
        System .out.println(isOdd(nums));
    }
}
