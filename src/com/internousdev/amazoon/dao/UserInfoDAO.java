package com.internousdev.amazoon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.amazoon.dto.UserInfoDTO;
import com.internousdev.amazoon.util.DBConnector;

public class UserInfoDAO {

	public UserInfoDTO getUserInfo(String loginId) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		String sql = "select * from login_user_transaction where login_id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {

				userInfoDTO.setLoginId(resultSet.getString("login_id"));
				userInfoDTO.setPassword(resultSet.getString("login_pass"));
				userInfoDTO.setUserName(resultSet.getString("user_name"));
				userInfoDTO.setInsertDate(resultSet.getString("insert_date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoDTO;
	}

}
