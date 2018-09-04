package com.internousdev.amazoon.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ThanksAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {

		String result = SUCCESS;

//		session.put("rionId", animalInfoDtoList.get(0).getAnimalId());

		session.remove("buyAnimalList");

		return SUCCESS;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}