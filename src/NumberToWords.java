public class NumberToWords {
    public static void main(String[] args) {
//        numToWords(586886);
//        System.out.println(reverse(586886));
//        System.out.println(getDigitCount(50000));
        numToWords(11);
    }
    public static void numToWords(int num) {
        int temp = reverse(num);
        for(int i = 0 ; i <= getDigitCount(num) ; i++) {
            if(temp == 0) System.out.print("Zero ");
            while (temp > 0) {
                int rem = temp % 10;
                switch (rem) {
//                    case 0:
//                        System.out.print("Zero ");
//                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;
                }
                temp = temp / 10;
            }
        }
        System.out.println();
    }
    public static int reverse(int number) {
        int revNum = 0;
        int num = number;
        int num1=0;
        if(number<0) num1 = -1*number;
        else num1=number;
        while(num1!=0) {
            revNum = revNum*10 + num1%10;
            num1 = num1/10;
        }
        return num < 0 ? -1 * revNum : revNum;
    }
    public static int getDigitCount(int num) {
        if(num == 0) return 1;
        if(num < 0) return -1;
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

// code not completed