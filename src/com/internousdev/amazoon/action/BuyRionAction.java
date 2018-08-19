package com.internousdev.amazoon.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amazoon.dao.BuyAnimalDAO;
import com.internousdev.amazoon.dto.BuyAnimalDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyRionAction extends ActionSupport implements SessionAware {

	private String id;
	private String animalName;
	private String animalPrice;
	public Map<String, Object> session;
	private BuyAnimalDAO buyAnimalDAO = new BuyAnimalDAO();
	List<BuyAnimalDTO> buyAnimalDtoList = new ArrayList<BuyAnimalDTO>();

	public String execute() throws SQLException {

		buyAnimalDtoList = buyAnimalDAO.getBuyAnimalInfo();

		session.put("rionId", buyAnimalDtoList.get(0).getId());
		session.put("rionName", buyAnimalDtoList.get(0).getAnimalName());
		session.put("rionStrong", buyAnimalDtoList.get(0).getAnimalStrong());
		session.put("rionPrice", buyAnimalDtoList.get(0).getAnimalPrice());
		session.put("rionCount", 1);

		String result = SUCCESS;

		return result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public String getAnimalPrice() {
		return animalPrice;
	}

	public void setAnimalPrice(String animalPrice) {
		this.animalPrice = animalPrice;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public BuyAnimalDAO getBuyAnimalDAO() {
		return buyAnimalDAO;
	}

	public void setBuyAnimalDAO(BuyAnimalDAO buyAnimalDAO) {
		this.buyAnimalDAO = buyAnimalDAO;
	}

	public List<BuyAnimalDTO> getBuyAnimalDtoList() {
		return buyAnimalDtoList;
	}

	public void setBuyAnimalDtoList(List<BuyAnimalDTO> buyAnimalDtoList) {
		this.buyAnimalDtoList = buyAnimalDtoList;
	}

}