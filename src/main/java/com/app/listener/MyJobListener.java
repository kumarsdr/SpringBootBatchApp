package com.app.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		
		System.out.println("started**************");
		System.out.println("THIS IS BEFORE EXECUTION");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		
		System.out.println("end.."+jobExecution.getStatus().toString());
		System.out.println("AFTER EXECUTION");
	}

}
