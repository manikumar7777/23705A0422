//max value finding in given array
class Main{
    public static void main(String [] args){
        int[] num={75,25,100,125};
        int max=num[0];
        for(int i=1;i<num.length;i++){
            int value=num[i];
            if(value>max){
                max=value;
            }
        }
        System.out.println(max);
    }
}