public class TilingProblem {
    public static int tilingWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        int totalWays = tilingWays(n-1)+tilingWays(n-2);
        return totalWays;
    }
    public static void main(String[] args){
        int ways = tilingWays(4);
        System.out.println(ways);
    }
}
