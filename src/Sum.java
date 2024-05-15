 public class Sum{
     public static int GetSum(int a, int b){
         if (a == b){
             return a;
         } else if (a < b){
             int sum = 0;
             for (int i = a; i <= b; i++){
                 sum += i;
             }
             return sum;
         } else {
             int sum = 0;
             for (int i = b; i <= a; i++){
                 sum += i;
             }
             return sum;
         }
     }
     
     public static void main(String[] args) {
           System.out.println(GetSum(1, 0));
           System.out.println(GetSum(1, 2));
           System.out.println(GetSum(0, 1));
           System.out.println(GetSum(1, 1));
           System.out.println(GetSum(-1, 0));
           System.out.println(GetSum(-1, 2));
}
 }