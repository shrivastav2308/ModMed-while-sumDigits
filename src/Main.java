public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(2));
    }
    public static int sumDigits(int num) {
        if(num < 10) return -1;
        int sum = 0;
        while(num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}