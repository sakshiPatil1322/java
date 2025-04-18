public class InsertionSort {
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length;i++){
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        insertion(arr);
    }
}
