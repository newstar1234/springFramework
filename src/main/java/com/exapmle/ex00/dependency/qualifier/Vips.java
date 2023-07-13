package com.exapmle.ex00.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips") @Primary 
public class Vips implements Restaurant {

	@Override
	public boolean saladbar() {
		// TODO Auto-generated method stub
		return false;
	}

}
