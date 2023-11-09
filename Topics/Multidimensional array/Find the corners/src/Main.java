class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int rows = twoDimArray.length;
        int columns = twoDimArray[0].length;

        int topLeft = twoDimArray[0][0];
        int topRight = twoDimArray[0][columns - 1];
        int bottomLeft = twoDimArray[rows - 1][0];
        int bottomRight = twoDimArray[rows - 1][columns - 1];

        System.out.println(topLeft + " " + topRight);
        System.out.println(bottomLeft + " " + bottomRight);
    }
}