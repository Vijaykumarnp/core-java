package com.xworkz.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.app.dto.BirthdayDTO;

public class BirthdayRepoImpl implements BirthdayRepo {

	@Override
	public boolean onSave(BirthdayDTO dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");

			PreparedStatement pr = com.prepareStatement("insert into birthday values(? ,? , ? , ? , ?)");

			pr.setInt(1, dto.getId());
			pr.setString(2, dto.getBirthdayGuy());
			pr.setString(3, dto.getDate());
			pr.setString(4, dto.getLocation());
			pr.setString(5, dto.getFoodType());
			int i = pr.executeUpdate();

			if (i != 0) {
				System.out.println("data added");

			} else {
				System.out.println("data not added");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean onUpdate(int id) {
		System.out.println("inside update method");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement st = co.createStatement();
			int i = st.executeUpdate("update birthday set location = '23-10-22' where id=1");
			if (i != 0) {
				System.out.println("updated");

			} else {
				System.out.println(" not updated");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean onDelete(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement st = con.createStatement();
			int i = st.executeUpdate("delete from birthday where id=id");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

}
