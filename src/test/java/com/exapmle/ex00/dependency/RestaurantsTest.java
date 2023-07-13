package com.exapmle.ex00.dependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.exapmle.ex00.dependency.qualifier.Restaurant;
// 혼자 할 때 import가 안되어서 method 사용이 안되었음. 다시 혼자해보면서 확인 꼭 하기!

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class RestaurantsTest {
	@Autowired
	@Qualifier("outback")
	private Restaurant outback;
	
	@Autowired
	@Qualifier("vips")
	private Restaurant vips;

	@Autowired
	private Restaurant restaurant;

	
	@Test
	public void testQualifier() {
		log.info("=====================");
		log.info("outback: " + outback);
		log.info("outback steak price: " + outback.steak);
		log.info("saladbar : " + outback.saladbar());
		log.info("=====================");
		
		log.info("=====================");
		log.info("vips: " + vips);
		log.info("vips steak price: " + vips.steak);
		log.info("vips saladba : " + vips.saladbar());
		log.info("=====================");

		log.info("=====================");
		log.info("restaurant: " + restaurant);
		log.info("restaurant: " + Restaurant.steak);
		log.info("restaurant : " + restaurant.saladbar());
		log.info("=====================");
	}
}
