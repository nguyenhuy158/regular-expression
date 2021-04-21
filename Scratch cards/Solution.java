import java.util.regex.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        // String input = "0000-1234-2345-3456";
        String input = "000-1234-2345-3456";
        String regex = "\\b\\d{4}-\\d{4}-\\d{4}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        try {
            boolean isFind = matcher.find();
            if (isFind) {
                System.out.println("Congratulation!!!");
            } else {
                System.out.println("Input not Scratch cards.");
            }
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}