package com.ibm.wolfs.tracker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.wolfs.tracker.service.UrlService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlTrackerApplicationTests {
	private UrlService service;
	@Test
	public void contextLoads() {
	
	}
	
	@Test
	public void testtrackingLink() {
		try {
			service.trackingLink("https://www.ibm.com/br-pt/about?lnk=fab");
		} catch (Exception e) {
			System.out.println("Url Track Error for Tracking Link" + e);
		}
		
	
	}
	
	@Test
	public void testemptytrackingLink() {
		try {
			service.trackingLink("");
		} catch (Exception e) {
			System.out.println("Url Track Empty Error for Tracking Link" + e);
		}
		
	
	}
	
	@Test
	public void testwrongtrackingLink() {
		try {
			service.trackingLink("www.tt");
		} catch (Exception e) {
			System.out.println("Url Track Wrong Error for Tracking Link" + e);
		}
	}
	
	@Test
	public void testdoubletrackingLink() {
		try {
			service.trackingLink("https://www.ibm.com/br-pt/about?lnk=fab https://www.ibm.com/br-pt/about?lnk=fab");
		} catch (Exception e) {
			System.out.println("Url Track Double Error for Tracking Link" + e);
		}
	}
	
	
	
}
