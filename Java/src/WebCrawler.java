import java.io.*;
import java.net.*;

public class WebCrawler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://en.wikipedia.org/wiki/Data_science");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");
			connection.connect();
			
			System.out.println("Response Code: " + connection.getResponseCode());
			System.out.println("Content Type: " + connection.getContentType());
			System.out.println("Content Length: " + connection.getContentLength());
			
			InputStreamReader inputStream = new InputStreamReader((InputStream) connection.getContent());
			BufferedReader br = new BufferedReader(inputStream);
			StringBuilder buffer = new StringBuilder();
			String line;
			
			do {
				line = br.readLine();
				buffer.append(line + "\n");
			} while (line != null);
			
			System.out.println(buffer.toString());
			
		} catch (MalformedURLException ex) {
			System.out.println("Malformed URL Error: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("IO Exception: " + ex.getMessage());
		}
	}

}
