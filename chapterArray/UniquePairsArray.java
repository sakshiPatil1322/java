public class UniquePairsArray {
    public static int uniquePairs(int arr[]){
        for(int i=0;i<(arr.length-1);i++){
            int start = arr[i];
            for(int j=i;j<(arr.length-1);j++){
                int end=arr[j];
                System.out.println("("+start+","+end+")");
            }
        }
        int totalPairs=((arr.length*(arr.length-1))/2);
        return totalPairs;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int totalPairs=uniquePairs(arr);
        System.out.println("Total arrays are "+ totalPairs);
    }
}
