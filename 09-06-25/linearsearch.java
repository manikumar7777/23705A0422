public class Main{
    public static void main(String [] args){
        int[] num={18,19,3,2,1,8,9};
        int index=-1;
        int target=9;
        for(int i=0;i<num.length;i++){
            if(target == num[i]){
                index=i;
            }
        }
        System.out.println(index==-1 ? "element not found" : "element found at index" + index);
    }
}