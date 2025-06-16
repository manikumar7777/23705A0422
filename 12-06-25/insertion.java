class Main {
    public static void main(String [] args){
        int[] nums={4,6,8,9,20,15,12,11};
        int key=0;
        for(int i=1;i<nums.length;i++){
            key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
                
            }
            nums[j+1]=key;
            
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}