import java.util.*;
// public class HOMEWORK {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<2*n-2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class HOMEWORK {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             char ch=(char)('A'+n-i-1);
//             for(int j=0;j<=i;j++){
//                 System.out.print(ch+" ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class HOMEWORK {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i;j++){
//                 System.out.print((char)('A'+j));
//             }
//             System.out.println();
//         }
//     }
// }

// public class HOMEWORK {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             char ch=(char)('A'+i);
//             for(int j=0;j<=i;j++){
//                 System.out.print(ch);
//             }
//             System.out.println();
//         }
//     }
// }

public class HOMEWORK {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            for(int l=i-1;l>=0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}