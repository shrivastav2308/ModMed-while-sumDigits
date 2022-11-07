public class sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int a, int b){
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int frsta = a/10;
        int lasta = a%10;
        int frstb = b/10;
        int lastb = b%10;
        if(str1.length()==2 && str2.length()==2) {
            if(frsta == frstb || frsta == lastb || lasta == frstb || lasta == lastb) return true;
        }
        return false;
    }
}
