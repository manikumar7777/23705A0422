//find no.of digits in a given number
class Main{
    public static void main(String [] args){
        int num=4521;
        int count=0;
        while(num>0){
            int value=num/10;
            count=count+1;
            num=value;
        }
        System.out.println(count);
    }
}