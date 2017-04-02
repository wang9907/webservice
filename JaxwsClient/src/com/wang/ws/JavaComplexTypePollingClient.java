package com.wang.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

public class JavaComplexTypePollingClient {

    public static void main(String[] args) {

       JavaComplexTypeService service = new JavaComplexTypeService();

       JavaComplexType port = service.getJavaComplexTypePort();

       Response<GetPersonResponse> getPersonAsync = port.getPersonAsync();

       while (!getPersonAsync.isDone()) {

           System.out.println("is not done");

       }

       List<Person> rtnList = new ArrayList<Person>();

       try {

           GetPersonResponse getPersonResponse = getPersonAsync.get();

           rtnList = getPersonResponse.getReturn();

           System.out.println("return size======" + rtnList.size());

           for (Person p : rtnList) {

              System.out.println("person=====" + p.getName() + "  "

                     + p.getAge() + "  " + p.getGender());

           }

       } catch (Exception ex) {

           ex.printStackTrace();

       }

    }

}