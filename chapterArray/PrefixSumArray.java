public class PrefixSumArray {
    public static int preFixSum(int arr[]){
        int maxValue=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<(arr.length);i++){
            int start = i;
            for(int j=i;j<(arr.length);j++){
                int end=j;
                int currValue=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxValue<currValue){
                    maxValue=currValue;
                }
            }
        }
        return maxValue;
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int maxValue=preFixSum(arr);
        System.out.println(maxValue);
    }
}
