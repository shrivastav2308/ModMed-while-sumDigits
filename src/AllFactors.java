public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number) {
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Invalid Value");
        }
    }
}
