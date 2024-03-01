public class contract {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 8, 4, 5, 1, 7}; 

        System.out.println("Sum of Squares: " + sumOfSquares(array));

        System.out.println("Product of Elements: " + productOfElements(array));
    }

    public static int sumOfSquares(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num * num;
        }
        return sum;
    }
    public static int productOfElements(int[] array) {
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }
}
