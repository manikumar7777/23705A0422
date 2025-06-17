import java.util.*;
public class Main {
    public static void main(String[] args) {
        int bagWeight = 8;
        int selectedElement = 0;  
        int[] weights = {3, 2, 1, 4, 2};
        int[] profits = {10, 20, 2, 3, 60};

        System.out.println(napSack(bagWeight, selectedElement, weights, profits));
    }
    public static int napSack(int bagWeight, int selectedElement, int[] weights, int[] profits) {
        if (selectedElement >= weights.length || bagWeight == 0) {
            return 0;
        }
        int pick = 0;
        if (bagWeight >= weights[selectedElement]) {
            pick = profits[selectedElement] + napSack(bagWeight - weights[selectedElement], selectedElement + 1, weights, profits);
        }
        int notPick = napSack(bagWeight, selectedElement + 1, weights, profits);

        return Math.max(pick,notPick);
    }
}
