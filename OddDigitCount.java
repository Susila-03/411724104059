public class OddDigitCount {

    public static void main(String[] args) {
        int n=25;
        int c=0;
        while(n>0){
            int d=n%10;
            if(d%2!=0){
                c++;
            }
            n/=10;
        }
         System.out.println(c);
    }
}