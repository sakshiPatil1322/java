public class SubArrays {
    public static int subArrays(int arr[]){
        for(int i=0;i<(arr.length-1);i++){
            int start = arr[i];
            for(int j=i;j<(arr.length-1);j++){
                int end=arr[j];
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        int totalArray=((arr.length*(arr.length-1))/2);
        return totalArray;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int totalArray=subArrays(arr);
        System.out.println("Total arrays are "+ totalArray);
    }
}
