package com.wang.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService

public class CollectionWS {

    @WebMethod

    public List<String> rtnMethod() {

       List<String> testList = new ArrayList<String>();

       testList.add("abc");

       testList.add("efg");

       testList.add("111");

       return testList;

    }
}