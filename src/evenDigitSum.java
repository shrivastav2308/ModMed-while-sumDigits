public class evenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(1542263580));
    }
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if(number<0) return -1;
        else {
            while(number!=0) {
                int num = number%10;
                int rem = number/10;
                number = rem;
                if(num%2==0) sum =  sum+num;
            }
        }
        return sum;
    }
}
