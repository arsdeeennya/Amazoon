package com.internousdev.amazoon.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amazoon.dao.AnimalInfoDAO;
import com.internousdev.amazoon.dto.AnimalInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	AnimalInfoDAO animalInfoDAO = new AnimalInfoDAO();
	List<AnimalInfoDTO> animalInfoDtoList = new ArrayList<AnimalInfoDTO>();

	public String execute() throws SQLException {

		if (!session.containsKey("logined")) {
			session.put("logined", 0);
		}


		animalInfoDtoList = animalInfoDAO.getBuyAnimalInfo();


		session.put("rionName", animalInfoDtoList.get(0).getAnimalName());
		session.put("rionPrice", animalInfoDtoList.get(0).getAnimalPrice());
		session.put("rionStrong", animalInfoDtoList.get(0).getAnimalStrong());
		session.put("crocoName", animalInfoDtoList.get(1).getAnimalName());
		session.put("crocoPrice", animalInfoDtoList.get(1).getAnimalPrice());
		session.put("crocoStrong", animalInfoDtoList.get(1).getAnimalStrong());
		session.put("birdName", animalInfoDtoList.get(2).getAnimalName());
		session.put("birdPrice", animalInfoDtoList.get(2).getAnimalPrice());
		session.put("birdStrong", animalInfoDtoList.get(2).getAnimalStrong());

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
