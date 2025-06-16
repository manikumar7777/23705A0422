//how many even numbers in array
class Main{
    public static void main(String [] args){
        int[] num={1,2,4,3,6,8,9,10};
        int count=0;
        for(int i=0;i<num.length;i++){
            int value=num[i];
            if(value%2==0) count+=1;
        }
        System.out.println(count);
    }
}
       