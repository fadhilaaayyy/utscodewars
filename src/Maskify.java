public class Maskify {
    
    public static String maskify(String str) {
        if (str.length() <= 4){
            return str;
        }
        String maskedPart = "#".repeat(str.length() - 4);
        String lastFourChars = str.substring(str.length() - 4);
        return maskedPart + lastFourChars;
    }
    
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println(maskify("12345"));
    }
}
