public class App {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] a = {2, 3, 18, 21, 22};
        int[] b = {1, 3, 6, 19, 27, 30};
        int[] c = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }

        System.out.println("Elements in c are:");
        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l] + " ");
        }
    }
}
