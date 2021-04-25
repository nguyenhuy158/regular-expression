import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static String getUrl(String input) {
        String regex = "(http)s?://(www.)?\\w+(.\\w+)+";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static void main(String[] args) {
        File fi = new File("input.html");
        try {
            Scanner sc = new Scanner(fi);
            while (sc.hasNext()) {
                String url = getUrl(sc.nextLine());
                if (url != null) {
                    System.out.println(url);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}