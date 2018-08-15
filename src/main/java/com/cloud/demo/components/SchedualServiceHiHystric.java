package com.cloud.demo.components;

import com.cloud.demo.services.SchedualServiceHi;

public class SchedualServiceHiHystric implements SchedualServiceHi{

	public String sayHiFromClientOne(String name) {
		return "sorry"+name;
	}
}
