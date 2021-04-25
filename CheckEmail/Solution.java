import java.util.regex.*;

public class Solution {
    public static boolean checkEmail(String input) {
        String regex = "^([\\w].+)@(\\w+).(\\w)+$";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "huyquaq@gmail.com";
        System.out.println(checkEmail(input));
    }
}