package com.internousdev.amazoon.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amazoon.dao.AnimalInfoDAO;
import com.internousdev.amazoon.dao.MCategoryDAO;
import com.internousdev.amazoon.dto.AnimalInfoDTO;
import com.internousdev.amazoon.dto.MCategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	AnimalInfoDAO animalInfoDAO = new AnimalInfoDAO();
	List<AnimalInfoDTO> animalInfoDtoList = new ArrayList<AnimalInfoDTO>();
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();


	public String execute() throws SQLException {

		if (!session.containsKey("logined")) {
			session.put("logined", 0);
		}


		animalInfoDtoList = animalInfoDAO.getBuyAnimalInfo();

		session.put("rionId", animalInfoDtoList.get(0).getAnimalId());
		session.put("rionName", animalInfoDtoList.get(0).getAnimalName());
		session.put("rionPrice", animalInfoDtoList.get(0).getAnimalPrice());
		session.put("rionStrong", animalInfoDtoList.get(0).getAnimalStrong());
		session.put("crocoId", animalInfoDtoList.get(1).getAnimalId());
		session.put("crocoName", animalInfoDtoList.get(1).getAnimalName());
		session.put("crocoPrice", animalInfoDtoList.get(1).getAnimalPrice());
		session.put("crocoStrong", animalInfoDtoList.get(1).getAnimalStrong());
		session.put("birdId", animalInfoDtoList.get(2).getAnimalId());
		session.put("birdName", animalInfoDtoList.get(2).getAnimalName());
		session.put("birdPrice", animalInfoDtoList.get(2).getAnimalPrice());
		session.put("birdStrong", animalInfoDtoList.get(2).getAnimalStrong());
		session.put("bobId", animalInfoDtoList.get(3).getAnimalId());
		session.put("bobName", animalInfoDtoList.get(3).getAnimalName());
		session.put("bobPrice", animalInfoDtoList.get(3).getAnimalPrice());
		session.put("bobStrong", animalInfoDtoList.get(3).getAnimalStrong());

		if(!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}


		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public AnimalInfoDAO getAnimalInfoDAO() {
		return animalInfoDAO;
	}

	public void setAnimalInfoDAO(AnimalInfoDAO animalInfoDAO) {
		this.animalInfoDAO = animalInfoDAO;
	}

	public List<AnimalInfoDTO> getAnimalInfoDtoList() {
		return animalInfoDtoList;
	}

	public void setAnimalInfoDtoList(List<AnimalInfoDTO> animalInfoDtoList) {
		this.animalInfoDtoList = animalInfoDtoList;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}



}
