package com.internousdev.amazoon.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amazoon.dao.UserInfoDAO;
import com.internousdev.amazoon.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		userInfoDTO = userInfoDAO.getUserInfo(String.valueOf(session.get("login_user_id")));
		if (userInfoDTO != null) {
			session.put("loginId", userInfoDTO.getLoginId());
			session.put("password", userInfoDTO.getPassword());
			session.put("username", userInfoDTO.getUserName());
			session.put("insertDate", userInfoDTO.getInsertDate());


			result = SUCCESS;
		}
		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}