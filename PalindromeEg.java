import java.util.*;
class palindrome{
public boolean palindromecheck(String s){
    int n=s.length();
    for(int i=0;i<n/2;i++){
        if(s.charAt(i)!=s.charAt(n-1-i)){
            return false;
        }
    }
    return true;

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
       palindrome p=new palindrome();
       if(p.palindromecheck(s)){
        System.out.println(s+" is palindrome");
       }else{
        System.out.println(s+" Not palindrome");
       }
       
    }
}
