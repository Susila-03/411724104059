public class ReverseNumber {
    public static void main(String[] args) {
        int n=15;
        int r=0;
        while(n>0){
            int l=n%10;
            r=r*10+l;
            n/=10;
        }
        System.out.println(r);
    }
}
