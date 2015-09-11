package wyy.HttpUt;


import java.util.List;
import java.util.concurrent.CountDownLatch;
 
///“Ï≤Ω«Î«Û
public class HttpAsyncUtils {
	
	 public static String sendGet(String url, String param) {
		return param;
		 
		 /*
		 CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
	        // Start the client
	        httpclient.start();
	 
	        // Execute 100 request in async
	        final HttpGet request = new HttpGet(
	                "http://xxxx");
	        request.setHeader("Connection", "close");
	        List<Future<HttpResponse>> respList = new LinkedList<Future<HttpResponse>>();
	        for (int i = 0; i < 50; i++) {
	            respList.add(httpclient.execute(request, null));
	        }

	        // Print response code
	        for (Future<HttpResponse> response : respList) {
	            response.get().getStatusLine();
	            // System.out.println(response.get().getStatusLine());
	        }

	        httpclient.close();
		 */
	 }

}
