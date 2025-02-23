package javapackage;

public class CapitalizeAlternate {
    public static String capt(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello world";
        String result = capt(input);
        System.out.println(result);
    }
}
