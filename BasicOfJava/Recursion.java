class Recursion {
    public static void binaryString(int n, String str, int privious) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, str + "0", 0);
        if (privious == 0) {
            binaryString(n - 1, str + "1", 1);
        }
    }

    public static int tilingWays(int n) {
        if (n == 0 || n == 1)
            return 1;
        // Horizontal choice + Verticle choice = total ways of tiling n tiles
        return tilingWays(n - 2) + tilingWays(n - 1);
    }

    public static void possiblePosition(String arr[][], int row) {
        if (row == arr.length) {
            System.out.println("----------------");
            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[i][k]+" ");
                }
                System.out.println();
            }
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            arr[row][j] = "Q";
            possiblePosition(arr, row + 1);
            arr[row][j] = "X";
        }
    }

    public static void main(String args[]) {
        // binaryString(3,"" , 0);
        // System.out.println(tilingWays(8));
        String arr[][]=new String[2][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]="X";
            }
        }
        possiblePosition(arr,0);
    }
}