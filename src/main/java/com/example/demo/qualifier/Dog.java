package com.example.demo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Dog")
@Primary
public class Dog implements Animal{
	@Override
	public String characteristics()
	{
		return "Bark";
	}

}
