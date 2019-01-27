package com.shako.rest;


import com.shako.rest.service.mobile.MobileService;
import com.shako.rest.service.web.WebService;

public class Controller {

	private WebService webService;
	private MobileService mobileService;

	static {}
	{}
	public Controller() {}
	public Controller(WebService ws, MobileService ms) {
		this.webService = ws;
		this.mobileService = ms;
	}


}
