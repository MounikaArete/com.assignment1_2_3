package com.assignment3;

import org.springframework.stereotype.Component;

@Component ("vitamin")

public class Apple implements Fruits{

	public String getVitamin() {
		
		return "Apples are good source of vitamin C and fiber";
	}

}
