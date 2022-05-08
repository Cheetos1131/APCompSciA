public class DBA8 {
    public static void main(String[] args) {
        int[] row = {2, 4, 6, 8};
        int[] col = {3, 6, 9};
        output(calcMagicMath(row, col));
    }
    /**
     * @param source 2D array of int type
     * @return 2D array printed row first
     */
    public static void output(int[][] source) {
        for(int i = 0; i < source.length; i++) {
            for(int j = 0; j < source[i].length; j++) {
                System.out.print(source[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * @param rowH row array
     * @param colH column array
     * @return product of rowH and colH in column major form
     */
    public static int[][] calcMagicMath(int[] rowH, int[] colH) {
        int[][] output = new int[rowH.length][colH.length];
        for(int i = 0; i < colH.length; i++) {
            for(int j = 0; j < rowH.length; j++) {
                output[j][i] = (colH[i] * rowH[j]);
            }
        }
        return output;
    }
}