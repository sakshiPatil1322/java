public class IsPallindrome {
    public static boolean isPallindrome(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        if (str.equals(str1)) return true;
        else return false;
    }

    public static void main(String []args){
        System.out.println(isPallindrome("aabcaa"));
    }
}
