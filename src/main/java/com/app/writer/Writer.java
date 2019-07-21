package com.app.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception {
		System.out.println("Writer_Data_Is :"+items);
		System.out.println("THIS IS WRITER EXECUTION");
		
	}
	

}
