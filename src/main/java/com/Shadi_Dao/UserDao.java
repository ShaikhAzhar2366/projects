package com.Shadi_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Project_Connection.MyConnection;
import com.Shadi_Model.UserBean;

public class UserDao {
public void save(UserBean bean) {
	Connection connection = MyConnection.getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement("insert into user(age,name,gender,number,password,email,city,country) values(?,?,?,?,?,?,?,?)");
		//statement.setInt(1, bean.getId());
		statement.setInt(1, bean.getAge());
		statement.setString(2, bean.getName());
		statement.setString(3, bean.getGender());
		statement.setString(4, bean.getNumber());
		statement.setString(5, bean.getPassword());
		statement.setString(6, bean.getEmail());
		statement.setString(7, bean.getCity());
		statement.setString(8, bean.getCountry());
		int executeUpdate = statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public UserBean findbyUser(int id) {
	UserBean bean=new UserBean();
	Connection connection = MyConnection.getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement("select * from user where id=?");
		//statement.setInt(1, bean.getId());
		statement.setInt(1, id);
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			bean.setAge(resultSet.getInt(2));
			bean.setName(resultSet.getString(3));
			bean.setGender(resultSet.getString(4));
			bean.setNumber(resultSet.getString(5));
			bean.setPassword(resultSet.getString(6));
			bean.setEmail(resultSet.getString(7));
			bean.setCity(resultSet.getString(8));
			bean.setCountry(resultSet.getString(9));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return bean;	
}
public UserBean userDelete(int id) {
	UserBean bean=new UserBean();
	Connection connection = MyConnection.getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement("delete from user where id=?");
		statement.setInt(1, id);
		//ResultSet resultSet = statement.executeQuery();
		 int update = statement.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return bean;
	
}
public UserBean user_Update(UserBean bean) {
	//UserBean bean=new UserBean();
	Connection connection = MyConnection.getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement("update user set age=?,number=?,password=?,email=?,city=?,country=? where id=?");
		//statement.setInt(1, bean.getId());
		statement.setInt(1,bean.getAge());
		statement.setString(2,bean.getNumber());
		statement.setString(3, bean.getPassword());
		statement.setString(4, bean.getEmail());
		statement.setString(5, bean.getCity());
		statement.setString(6, bean.getCountry());
		statement.setInt(7, bean.getId());
		
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return bean;
	
}
}
