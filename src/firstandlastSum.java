public class firstandlastSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(10253));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) return -1;
        if(number < 0) return number*2;
        String nStr = Integer.toString(number);
        int fd = Integer.parseInt(nStr.charAt(0)+"");
        int ld = number%10;
        return  fd+ld;
    }
}
