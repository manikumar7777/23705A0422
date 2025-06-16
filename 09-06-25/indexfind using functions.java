public class Main {
    public static void main(String[] args) {
        int[] numbers = {18, 19, 2, 3, 1, 8, 9};
        
        System.out.println(linearSearch(numbers, 9));  
        System.out.println(linearSearch(numbers, 8));  
    }

    public static int linearSearch(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
