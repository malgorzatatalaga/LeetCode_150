public class MultiplicationTable {
    public static int[][] multiplicationTable(int n) {
        int[][] multiplicationTable = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n; a++) {
                multiplicationTable[i - 1][a - 1] = i * a;
            }
        }
        for (int[] x : multiplicationTable) {
            System.out.println(" ");
            for (int y : x) {
                System.out.print(y);
            }

        }
        return multiplicationTable;
    }
}
