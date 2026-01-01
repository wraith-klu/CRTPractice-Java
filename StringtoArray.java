import java.util.Arrays;

public class StringtoArray {
    public static void main(String[] args) {
        String s = "137642582";
        char[] charArray = s.toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println(charArray.length);
    }
}
