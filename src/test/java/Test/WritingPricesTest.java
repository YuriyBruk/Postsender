package Test;

import helpers.MailSender;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class WritingPricesTest extends BaseTest {
    @Test
    public void writingPrices() throws IOException, InterruptedException {
        sleep(2000);
        mainPage.getAllPrices();
        mainPage.getPricesToFile();
        ArrayList<String> file = new ArrayList<>();
        file.add("prices.txt");
        file.add("pom.xml");
        MailSender.mailFromfile( "emails.txt",
                   "FirstEmailTest", "This mail text body, file", file);

    }
}
