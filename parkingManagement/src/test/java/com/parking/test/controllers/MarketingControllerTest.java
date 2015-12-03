package com.parking.test.controllers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.parking.Controller.MarketingController;
import com.parking.Model.Services.Contract.MarketingService;
import com.parking.common.NewsletterPromotionalRequest;
import com.parking.test.model.services.MarketingServiceMockImp;

public class MarketingControllerTest {

	MarketingService markserv = null;
	MarketingController markcontr = null;
	NewsletterPromotionalRequest promotion = null;

	@Before
	public void setUp() throws Exception {

		markserv = new MarketingServiceMockImp();
		markcontr = new MarketingController(markserv);
		promotion = new NewsletterPromotionalRequest();
	}

	@After
	public void tearDown() throws Exception {

		markserv = null;
		markcontr = null;
		promotion = null;

	}

	@Test
	public void testPromotionalnewsletterFailure() {

		ResponseEntity<String> rs = markcontr.promotionalnewsletter(promotion);
		assertEquals(HttpStatus.BAD_REQUEST, rs.getStatusCode());

	}

	@Test
	public void testPromotionalnewsletterSuccess() {

		promotion.setMailbody("free hot dogs");
		promotion.setRecipients("rsant144@fiu.edu");
		promotion.setSubject("ad");
		ResponseEntity<String> rs = markcontr.promotionalnewsletter(promotion);
		assertEquals(HttpStatus.OK, rs.getStatusCode());
	}

	@Test
	public void testValidatePromotionalEmailParams() {

		promotion.setMailbody("free hot dogs");
		promotion.setRecipients("rsant144@fiu.edu");
		promotion.setSubject("ad");
		ResponseEntity<String> rs = markcontr.promotionalnewsletter(promotion);
		assertEquals(HttpStatus.OK, rs.getStatusCode());

	}

}
