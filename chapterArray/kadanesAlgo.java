public class kadanesAlgo {
    public static int kadensSum(int arr[]){
        int maxValue=Integer.MIN_VALUE;
        int currValue=0;
        for(int i=0;i<arr.length;i++){
                currValue=currValue+arr[i];
                if(currValue<0){
                    currValue=0;
                }
                maxValue=Math.max(currValue,maxValue);
        }
        return maxValue;
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int maxValue=kadensSum(arr);
        System.out.println(maxValue);
    }
}
