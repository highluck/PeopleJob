package com.peoplejob.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import com.peoplejob.library.EmailSender;

public class LibraryContainer {

	private TaskExecutor taskExecutor;
	private EmailSender emailSender;
	
	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}
	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}
	public EmailSender getEmailSender() {
		return emailSender;
	}
	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}
	
	
}
