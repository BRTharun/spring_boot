package com.example.aopdemo;

import com.example.aopdemo.dao.AccountDao;
import com.example.aopdemo.dao.MembershipDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.transform.sax.SAXResult;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao theAccountDao, MembershipDao theMembershipDao) {
		return runner->{
			demoTheBeforeAdvice(theAccountDao,theMembershipDao);
		};
	}

	private void demoTheBeforeAdvice(AccountDao theAccountDao,MembershipDao theMembershipDao) {
		theAccountDao.addAccount();
		theMembershipDao.addSillyAccount();
	}
}
