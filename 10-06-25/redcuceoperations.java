import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=4){
            if(n%2==0){
                System.out.print(2);
            }
            else{
                System.out.print(3);
            }
        }
        else{
            System.out.print(n-1);
        }
        
    }
}