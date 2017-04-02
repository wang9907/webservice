package com.wang.ws;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService
public class MTOMSimple {

	@WebMethod
	public void echoData(Holder<byte[]> data) {

		OutputStream os = null;

		ByteArrayInputStream bin = null;

		try {

			bin = new ByteArrayInputStream(data.value);

			if (data.value != null)

				os = new FileOutputStream("E:\\项目数据\\upload\\jaxwsProject\\echodata.jpg");

			byte[] bytes = new byte[1024];

			int c;

			while ((c = bin.read(bytes)) != -1) {

				os.write(bytes, 0, c);

			}

			os.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (os != null) {

					os.close();

					os = null;

				}

			} catch (Exception e) {

			}

			try {

				if (bin != null) {

					bin.close();

					bin = null;

				}

			} catch (Exception e) {

			}

		}

	}

}