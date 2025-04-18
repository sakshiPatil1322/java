import java.lang.*;

public class ReverseString{
    public static String reverce(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        return str1;
    }

public static void main(String[] args){
    System.out.println(reverce("abcd"));
}
}