public class SubstringExample {

    // Define the custom substring method
    public static String substring(String str, int si, int ei) {
        String substr = ""; // empty string
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(substring(str, 0, 5  )); // Output: Hello

        System.out.println(str.substring(0,5));
    }
}
