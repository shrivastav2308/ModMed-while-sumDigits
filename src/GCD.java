public class GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10) return -1;
        for(int i=Math.min(first,second);i>=1;i--){
            if(first%i==0 && second%i==0) return i;
        }
        return -1;
    }
}
