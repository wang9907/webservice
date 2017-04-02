package com.wang.ws;

import java.awt.Image;
import java.io.File;

import javax.xml.ws.Holder;
import javax.xml.ws.soap.MTOMFeature;

public class MTOMSimplePollingClient {

	public static void testEcho(MTOMSimple port) throws Exception {

		byte[] bytes = AttachmentHelper.getImageBytes(getImage("carrier.jpg"),

		"image/jpeg");

		Holder<byte[]> image = new Holder<byte[]>(bytes);

		port.echoData(image);

		if (image.value != null)

			System.out.println("SOAP 1.1 testEcho() PASSED!");

		else

			System.out.println("SOAP 1.1 testEcho() FAILED!");

	}

	private static String getDataDir() {

		return "d:/";

	}

	private static Image getImage(String imageName) throws Exception {

		String location = getDataDir() + imageName;

		System.out.println("image location=====>" + location);

		return javax.imageio.ImageIO.read(new File(location));

	}

	public static void main(String[] args) {

		try {

			MTOMSimple port = new MTOMSimpleService()

			.getMTOMSimplePort(new MTOMFeature());

			if (port == null) {

				System.out.println("TEST FAILURE: Couldnt get port!");

				System.exit(-1);

			}

			// test echo

			testEcho(port);

		} catch (Exception ex) {

			System.out.println("SOAP 1.1 MtomApp FAILED!");

			ex.printStackTrace();

		}

	}
}