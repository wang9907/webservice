package com.wang.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

public class CollectionWSPollingClient {

	public static void main(String[] args) throws Exception {

		CollectionWSService service = new CollectionWSService();

		CollectionWS port = service.getCollectionWSPort();

		Response<RtnMethodResponse> rtnMethodAsync = port.rtnMethodAsync();

		while (!rtnMethodAsync.isDone()) {

			System.out.println("is not done");

		}

		List<String> rtnList = new ArrayList<String>();

		try {

			RtnMethodResponse collectionResponse = rtnMethodAsync.get();

			rtnList = collectionResponse.getReturn();

			System.out.println("return size======" + rtnList.size());

			for (String str : rtnList) {

				System.out.println("output=====" + str);

			}

		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

}