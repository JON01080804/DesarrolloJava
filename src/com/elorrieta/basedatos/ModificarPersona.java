package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModificarPersona {

	public static void main(String[] args) {

		String sql = "UPDATE person SET price = ? WHERE id = ? ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// TODO pedir datos por consola

			int id = 56;
			Double price = 475.00;

			// sustituimos las '?' de la SQL por las variables
			pst.setDouble(1, price);
			pst.setInt(2, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			System.out.println("Hemos modificado " + filas + " filas");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}