
class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        try {
            if (array == null || index < 0 || index >= array.length) {
                throw new Exception();
            }
            int result = (int) Math.pow(array[index], 2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

}