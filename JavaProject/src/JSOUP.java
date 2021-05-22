
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Jsoup;

public class JSOUP {
public static void main(String[] args) {
	System.err.println("hhihi");
	
	final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36";
	try {
		Connection.Response loginResponse = Jsoup.connect("http://10.147.78.81:80")
		                                       // .data("Username", "PBISMaster")
		                                      //  .data("Password", "PBIS@dmin123")
		                                        .method(Method.GET)
		                                        .userAgent(USER_AGENT)
		                                        .execute();
	//	System.err.println("lll");
		System.out.println(loginResponse.parse());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
