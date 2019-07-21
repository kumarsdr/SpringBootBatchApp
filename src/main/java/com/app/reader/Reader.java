package com.app.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {
	private String[] arr= {"Hello_How_Are_You","Welcome_To_Institute","Oxford"};
	private int count=0;

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("From_Reader");
		if(count>arr.length)
		{
			return arr[count++];
		}else
		{
			count=0;
		}
		return null;
	}

}
