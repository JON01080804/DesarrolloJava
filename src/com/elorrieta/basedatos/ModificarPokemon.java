package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModificarPokemon {

	public static void main(String[] args) {

		String sql = "UPDATE pokemon SET precio = ?,  numero = ? WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			System.out.println("Indica el id a modificar: ");
			int id = Integer.parseInt(sc.nextLine());
			pst.setInt(3, id);

			System.out.println("Introduce el nuevo precio: ");
			float precio = Float.parseFloat(sc.nextLine());
			pst.setFloat(1, precio);

			System.out.println("Introduce el nuevo codigo: ");
			String numero = sc.nextLine();
			pst.setString(2, numero);

//			// sustituimos las '?' de la SQL por las variables
//			pst.setDouble(1, price);
//			pst.setInt(2, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			System.out.println("Hemos modificado " + filas + " filas");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
