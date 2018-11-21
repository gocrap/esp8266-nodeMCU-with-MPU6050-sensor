
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class first {

    public static void main(String[] args) throws MalformedURLException, IOException {

        BufferedReader br = null;

        try {

            URL url = new URL("http://192.168.1.51/");
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);
            } 
        	finally {

        		if (br != null) {
                br.close();
            }
        }
    }
}
