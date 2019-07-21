package com.app.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.listener.MyJobListener;
import com.app.processor.Processor;
import com.app.reader.Reader;
import com.app.writer.Writer;
@Configuration
public class BatchConfig {

	//3.job Construction
	@Autowired
	private JobBuilderFactory jf;
	@Bean
	public Job j1()
	{
		System.out.println("THIS IS JOB J1 METHOD");
		return jf.get("j1").incrementer(new RunIdIncrementer()).listener(listener()).start(s1()).build();
		
	}
	@Bean
	public MyJobListener listener()
	{
		System.out.println("THIS IS JOB LISTENER METHOD");
		return new MyJobListener();
	}
//2.step Construction
	@Autowired
	private StepBuilderFactory sf;
	public Step s1()
	{
		System.out.println("THIS IS JOB S1 METHOD");
		return sf.get("s1").<String,String>chunk(1).reader(reader()).processor(process()).writer(write()).build();
	}
	//1.Item Reader,Writer and Processor beans
	@Bean
	public Reader reader()
	{
		System.out.println("THIS IS JOB READER METHOD");
		return new Reader();
	}
	@Bean
	public Processor process()
	{
		System.out.println("THIS IS JOB PROCESS METHOD");
		return new Processor();
	}
	public Writer write()
	{
		System.out.println("THIS IS JOB WRITE METHOD");
		return new Writer();
	}
}
