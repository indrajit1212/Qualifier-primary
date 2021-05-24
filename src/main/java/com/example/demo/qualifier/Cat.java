package com.example.demo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Cat")
public class Cat implements Animal{
	@Override
	public String characteristics()
	{
		return "Meow";	
		
	}
	

}
