//sorted or not prog
class Main{
    public static void main(String [] args){
        int[] num={1,2,3,4,5,6};
        int flag=0;
        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                flag=1;
            }
        }
        System.out.println(flag);
    }
}
//if fl;ag=0 sorted
//if flag=1 not sorted
       