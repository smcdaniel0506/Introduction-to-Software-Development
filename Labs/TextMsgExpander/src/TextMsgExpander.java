
import java.util.Scanner;

package textmsgexpander;

public class TextMsgExpander {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String bff = "best friend forever";
        String idk = "i don't know";
        String jk = "just kidding";
        String tmi = "too much information";
        String ttyl = "talk to you later";
        /**
         * *
         * BFF -- best friend forever IDK -- I don't know JK -- just kidding TMI
         * -- too much information TTYL -- talk to you later
         */
        System.out.println("Enter text: ");
        String user_input = scnr.nextLine();
        String replaced_input = user_input;

        System.out.println("You entered: " + user_input);

        if (user_input.contains("BFF")) {
            user_input = user_input.replace("BFF", bff);
            System.out.println("Replaced \"BFF\" with " + bff);
        }
        if (user_input.contains("IDK")) {
            user_input = user_input.replace("IDK", idk);
            System.out.println("Replaced \"IDK\" with " + idk);
        }
        if (user_input.contains("JK")) {
            user_input = user_input.replace("JK", jk);
            System.out.println("Replaced \"JK\" with " + jk);
        }
        if (user_input.contains("TMI")) {
            user_input = user_input.replace("TMI", tmi);
            System.out.println("Replaced \"TMI\" with " + tmi);
        }
        if (user_input.contains("TTYL")) {
            user_input = user_input.replace("TTYL", ttyl);
            System.out.println("Replaced \"TTYL\" with " + ttyl);
        } 
        else {
            System.out.println("Unknown");
        }
           System.out.println("Expanded: " + user_input);
        /**
         * Replaced "IDK" with "I don't know". Replaced "TTYL" with "talk to you
         * later" Expanded: I don't know how that happened. talk to you later.
         */
    }

}
