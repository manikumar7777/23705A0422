//if goodnum =if only contain either even or odd nums oterwise badnum 
public class Main{
    public static void main(String [] args){
        int num=1234;
        int evenCount=0;
        int oddCount=0;
        while(num > 0){
            if((num%10)%2==0){
                evenCount=evenCount+1;
            }
            else{
                oddCount+=1;
            }
            num=num/10;
        }
    int count=evenCount+oddCount;
    if(count==evenCount || count==oddCount){
        System.out.println("good num");
    }
    else{
         System.out.println("bad num");
    }
    }
}