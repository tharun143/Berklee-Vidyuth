package berklee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.UUID;
 
@SuppressWarnings("unused")
public class sendSms {
	public static String sendSms(int n) {
		try {
			// Construct data
			String message;
			String uID = UUID.randomUUID().toString();
			String s = uID.substring(0, 7);
			String m1 = "Namah Shivaya,\nWe have recieved a courier on your behalf.\nPlease collect the courier at the courier office.\n And your Unique ID is: "+s;
			String m2 = "Namah Shivaya,\nThis is to remaind you that We had recieved a courier on your behalf long ago.\nplease collect your courier at the office ASAP.\n";
			String apiKey = "apikey=" + "cr+2TRFLYds-IkeXjMttJUCRhwzuSXFeKT00yfSj87";
			if(n==1) {
				message = "&message=" + m1;
			}
			else{
				message = "&message=" + m2;
			}
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + "919491137036";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			System.out.println("SMS sent");
			return s;
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	}
//	public static void main(String[] argv) {
//		String p = sendSms();
//		System.out.println(p);
//	}
}