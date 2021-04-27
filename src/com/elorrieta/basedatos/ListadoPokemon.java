package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListadoPokemon {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT  id, nombre, numero, precio, brillante FROM pokemon  ; ");

		) {

			while (rs.next()) {// rs es el conjunto de datos que se obtiene de

				String nombre = rs.getString("nombre");
				int id = rs.getInt("id");
				String numero = rs.getString("numero");
				double precio = rs.getDouble("precio");
				boolean brillante = rs.getBoolean("brillante");
//				int brillante = rs.getInt("brillante"); para que aparezca segun la tabla SQLite 0 o 1

				System.out.println(id + " - " + nombre + "-" + numero + " " + precio + " " + brillante);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
