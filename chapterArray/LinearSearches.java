// import java.util.*;
public class LinearSearches {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,1,3,6};
        int key=2;
        int result=linearSearch(arr,key);
        if(result>=0){
            System.out.println(key+" Found at "+(result+1));
        }else{
            System.out.println("Key not found");
        }
    }
}