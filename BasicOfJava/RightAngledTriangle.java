import java.util.*;
public class RightAngledTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || i==rows){
                    System.out.print("* ");
                }else{
                    if(j==1 || j==i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }      
            }
            System.out.println();
        }
    }
}
