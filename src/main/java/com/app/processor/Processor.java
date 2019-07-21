package com.app.processor;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String,String> {

	@Override
	public String process(String item) throws Exception {
		System.out.println("From_Processor");
		return "PROCESSED :"+item.toUpperCase();
	}
	

}
