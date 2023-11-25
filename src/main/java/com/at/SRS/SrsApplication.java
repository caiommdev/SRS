package com.at.SRS;

import com.at.SRS.Mailer.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SrsApplication {

	@Autowired
	private SRS srs;

	public static void main(String[] args) {
		SpringApplication.run(SrsApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerSRSSystem(){
		srs.Execute();
	}
}
