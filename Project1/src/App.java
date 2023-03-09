
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
    
        String buscar = "w3schools";
        Pattern pattern = Pattern.compile(buscar, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        boolean matchFound = matcher.find();

        if(matchFound) {
        System.out.println("Match found");
        } else {
        System.out.println("Match not found");
        }
}

}
