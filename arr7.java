public class arr7 {
    public static int max(int m, int n, int ops[][]) {
        int minR = m;
        int minC = n;

        for (int[] num : ops) {
            minR = Math.min(minR, num[0]);
            minC = Math.min(minC, num[1]);
        }

        return minR * minC;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int ops[][] = {{2, 2}, {3, 3}};
        int maxInt = max(m, n, ops);
        System.out.println(maxInt);
    }
}

