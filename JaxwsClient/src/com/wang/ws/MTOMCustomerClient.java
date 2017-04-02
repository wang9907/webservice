package com.wang.ws;

import java.net.URL;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.namespace.QName;

public class MTOMCustomerClient {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Customer customer = new Customer();

		String endPoint = "http://localhost:8080/JaxwsProject/ws/MTOMCustomerService?wsdl";
		try {

			QName qName = new QName("http://ws.wang.com/",

			"MTOMCustomerService");

			MTOMCustomerService customerService = new MTOMCustomerService(

			new URL(endPoint), qName);

			MTOMCustomer customerPort = customerService

			.getMTOMCustomerServicePort();

			customer.setId(101);

			customer.setName("mk");

			customer.setMyPhoto(new DataHandler(new FileDataSource(

			"D:\\carrier.jpg")));

			customerPort.uploadCustomerByName(customer);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}