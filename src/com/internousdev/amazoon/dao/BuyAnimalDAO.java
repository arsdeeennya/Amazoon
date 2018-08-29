package com.internousdev.amazoon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.amazoon.dto.BuyAnimalDTO;
import com.internousdev.amazoon.util.DBConnector;

public class BuyAnimalDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	public List<BuyAnimalDTO> getBuyAnimalInfo(String animalId) {
		List<BuyAnimalDTO> buyAnimalDtoList = new ArrayList<BuyAnimalDTO>();

		String sql = "select * from animal_info_transaction where id = ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, animalId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				BuyAnimalDTO buyAnimalDTO = new BuyAnimalDTO();
				buyAnimalDTO.setId(resultSet.getInt("id"));
				buyAnimalDTO.setAnimalName(resultSet.getString("animal_name"));
				buyAnimalDTO.setAnimalStrong(resultSet.getInt("animal_strong"));
				buyAnimalDTO.setAnimalPrice(resultSet.getString("animal_price"));

				buyAnimalDtoList.add(buyAnimalDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buyAnimalDtoList;
	}
}