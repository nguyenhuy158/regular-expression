import java.util.regex.*;
import java.util.*;

class Solution {

    public static boolean isUserName(String input) {
        String regex = "\\b[a-zA-z_]\\w{3,11}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        try {
            boolean isFind = matcher.find();
            if (isFind && matcher.group(0).length() == input.length()) {
                return true;
            }

            return false;
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        // String input = "1huy";
        String input = "1 huyh";
        // String input = "hyquaq";
        if (isUserName(input)) {
            System.out.println("Congratulation!!!");
        } else {
            System.out.println("Input not matcher Username.");
        }
    }
}