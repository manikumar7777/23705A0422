public class main{
    public static void main(String [] args){
        int n=7;
       for(int i=0;i<=n;i++){
           for(int j=0;j<2*n-1;j++){
               if(i+j==6 || j-i==6 || i==6 ){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
        System.out.println();
       }
    }
}