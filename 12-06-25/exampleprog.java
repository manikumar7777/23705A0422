//fittingtilesinroom.prog
public class Main{
    public static void main(String [] args){
        System.out.print(noofWays(5));
        int n=0;
        //function 
    }
    public static int noofWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        return noofWays(n-1)+noofWays(n-2);
    }
}
