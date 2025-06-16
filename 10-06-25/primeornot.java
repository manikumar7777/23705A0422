import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int factors=0;
    for(int i=1;i<=a;i++){
        if(a%i==0){
            factors++;
        }
    }
    System.out.println(factors==2 ? "it is prime" : "it is not prime"+factors);
    }
}