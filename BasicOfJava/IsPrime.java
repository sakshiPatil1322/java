public class IsPrime {
    public static boolean isPrime(int i){
        int flag = 0;
        for(int j=2;j <= (i/2) ; j++){
            if(i%j == 0){
                flag++;
            }
        }
        if (flag != 0) return false;
        else return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(17));
    }
}
