package com.wang.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class JavaComplexType {

	@WebMethod
	public List<Person> getPerson() {

		List<Person> testList = new ArrayList<Person>();

		Person p = new Person();

		p.setName("abc");

		p.setAge(31);

		p.setGender("female");

		testList.add(p);

		p = new Person();

		p.setName("def");

		p.setAge(33);

		p.setGender("male");

		testList.add(p);

		p = new Person();

		p.setName("aaa");

		p.setAge(26);

		p.setGender("female");

		testList.add(p);

		return testList;

	}

}