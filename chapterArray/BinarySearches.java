public class BinarySearches {
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return 1;
            }else{
                if(arr[mid]>key){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return 0 ;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int key=2;
        int result=binarySearch(arr,key);
        if(result==1){
            System.out.println(key+" Found");
        }else{
            System.out.println("Key not found");
        }
    }
}
