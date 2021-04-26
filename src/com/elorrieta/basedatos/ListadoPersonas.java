package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListadoPersonas {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT id, name, price FROM person ORDER BY price ASC ; ");

		) {

			while (rs.next()) {

				String nombre = rs.getString("name");
				int id = rs.getInt("id");
				double price = rs.getDouble("price");

				System.out.println(id + " - " + nombre + "-" + price);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
