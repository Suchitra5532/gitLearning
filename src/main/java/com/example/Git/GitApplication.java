package com.example.Git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);

		System.out.println("Happy Birthday");
		System.out.println("commit 2");


	}

	public void disp()
	{
		System.out.println("Want to see the commit and Log");
	}

}
