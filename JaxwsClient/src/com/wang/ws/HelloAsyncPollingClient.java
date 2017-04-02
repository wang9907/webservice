package com.wang.ws;

import javax.xml.ws.Response;

public class HelloAsyncPollingClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		HelloService service = new HelloService();
		Hello port = service.getHelloPort();
		//System.out.println(port.say("ÄãºÃ°¡"));
		Response<SayResponse> sayAsync = port.sayAsync("MK");
		while (!sayAsync.isDone()) {
			System.out.println("is not down");
		}
		try {
			SayResponse callNameResponse = sayAsync.get();
			String message = callNameResponse.getReturn();
			System.out.println(message);
		} catch (Exception ex) {
		}
	}

}