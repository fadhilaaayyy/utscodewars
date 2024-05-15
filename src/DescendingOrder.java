import java.util.Arrays;

public class DescendingOrder{
    public static int sortDecs(final int num){
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        StringBuilder resultBuilder = new StringBuilder(new String(digits));
        resultBuilder.reverse();
        return Integer.parseInt(resultBuilder.toString());
    }
    
    public static void main(String[] args) {
        System.out.println(sortDecs(42145));
        System.out.println(sortDecs(145263));
        System.out.println(sortDecs(123456789));
    }
}
