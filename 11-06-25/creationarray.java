import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(b));
    }
}