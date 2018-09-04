package com.internousdev.amazoon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.amazoon.util.DBConnector;
import com.internousdev.amazoon.util.DateUtil;

public class buyAnimalCompleteDAO {


	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "insert into user_buy_animal_transaction(animal_transaction_id,animal_name,"
			+ "animal_price,animal_strong,insert_date)values(?,?,?,?,?)";

	public void buyItemInfo(String item_transaction_id,String user_master_id,String total_price,
			String total_count,String pay)throws SQLException{


		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, total_price);
			preparedStatement.setString(3, total_count);
			preparedStatement.setString(4, user_master_id);
			preparedStatement.setString(5, pay);
			preparedStatement.setString(6, dateUtil.getDate());

			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();

		}finally{
			connection.close();
		}

	}


}
