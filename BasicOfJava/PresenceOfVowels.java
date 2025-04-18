public class PresenceOfVowels {
    public static boolean isVowels(String str){
        return str.contains("a") ||str.contains("e") ||str.contains("i") ||str.contains("o") ||str.contains("u"); 
    }
    public static void main (String args[]){
        System.out.println(isVowels("msjzgmfsdyhsdcaen"));
    }
}
