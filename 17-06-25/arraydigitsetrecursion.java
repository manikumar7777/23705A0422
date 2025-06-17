import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        ArrayList<Integer> res = new ArrayList<>();
        getCom(n, 0, res);
    }

    public static void getCom(int[] n, int index, ArrayList<Integer> res) {
        if (index == n.length) {
            if (res.isEmpty()) {
                System.out.println("emptyset");
            } else {
                System.out.println(res);
            }
            return;
        }

        res.add(n[index]);
        getCom(n, index + 1, res);
        res.remove(res.size() - 1);
        getCom(n, index + 1, res);
    }
}
