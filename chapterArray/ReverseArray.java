public class ReverseArray {
    public static void reverseArray(int arr[]){
        for(int i=0;i<(arr.length/2);i++){
            int temp = arr[i];
            arr[i]= arr[(arr.length)-(i+1)];
            arr[(arr.length)-(i+1)]=temp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        reverseArray(arr);
    }
}
