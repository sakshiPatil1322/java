import java.util.*;
public class IsOdd {
    public static boolean isOdd(List<Integer> lis){
        for(int l : lis){
            if((l%2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        List<Integer> nums =Arrays.asList(1,3);
        System .out.println(isOdd(nums));
    }
}
