public class BruteForce {
    public static int bruteForce(int arr[]){
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<(arr.length);i++){
            int start = i;
            for(int j=i;j<(arr.length);j++){
                int end=j;
                int currValue=0;
                for(int k=start;k<=end;k++){
                    // System.out.print(arr[k]+" ");
                    currValue += arr[k];
                    if(currValue>maxValue){
                        maxValue=currValue;
                    }
                }
            }
        }
        return maxValue;
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int maxValue=bruteForce(arr);
        System.out.println(maxValue);
    }
}
