public class NumberFun{
    public static long findNextSquare(long sq){
        long root = (long) Math.sqrt(sq);
        if(root * root != sq){
            return -1;
        }
        long nextRoot = root + 1;
        return nextRoot * nextRoot;
    }
    public static void main(String[] args) {
        long input1 = 121;
        System.out.println("Kuadrat sempurna berikutnya setelah " + input1 + " adalah: " + findNextSquare(input1));
        long input2 = 625;
        System.out.println("Kuadrat sempurna berikutnya setelah " + input2 + " adalah: " + findNextSquare(input2));
        long input3 = 114;
        System.out.println("Kuadrat sempurna berikutnya setelah " + input3 + " adalah: " + findNextSquare(input3));
    }
}