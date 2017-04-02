package com.wang.ws;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class HelloAsyncCallBackClient {
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloService();
        Hello port = service.getHelloPort();
        port.sayAsync("Mk", new AsyncHandler<SayResponse>() {
            public void handleResponse(Response<SayResponse> res) {
                try {
                    SayResponse response = null;
                    response = res.get();
                    String message = response.getReturn();
                    System.out.println(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread.sleep(1000);
    }
}