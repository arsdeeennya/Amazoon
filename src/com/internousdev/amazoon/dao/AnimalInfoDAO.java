package com.internousdev.amazoon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.amazoon.dto.AnimalInfoDTO;
import com.internousdev.amazoon.util.DBConnector;

public class AnimalInfoDAO {

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();


	public List<AnimalInfoDTO> getBuyAnimalInfo() {

		List<AnimalInfoDTO> animalInfoDtoList = new ArrayList<AnimalInfoDTO>();
		String sql = "select * from animal_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				AnimalInfoDTO animalInfoDTO = new AnimalInfoDTO();
				animalInfoDTO.setAnimalId(resultSet.getInt("id"));
				animalInfoDTO.setAnimalName(resultSet.getString("animal_name"));
				animalInfoDTO.setAnimalPrice(resultSet.getInt("animal_price"));
				animalInfoDTO.setAnimalStrong(resultSet.getInt("animal_strong"));

				animalInfoDtoList.add(animalInfoDTO);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return animalInfoDtoList;
	}
}
