package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPersona {

	public static void main(String[] args) {

		String sql = "INSERT INTO person (id, name, price) VALUES ( ?, ?, ?) ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			String nombre;
			int id;
			double price = 0;
			String salir = "";
			// TODO pedir datos por consola
			// TODO arreglar precio

			while (!"s".equalsIgnoreCase(salir)) {
				System.out.println("Dime nombre: ");
				nombre = sc.nextLine();

				System.out.println("Dime id. ");
				id = Integer.parseInt(sc.nextLine());

				System.out.println("Intorduce precio");
				price = Double.parseDouble(sc.nextLine());

				System.out.println("Persona insertada");

				System.out.println("¿Quieres salir?");
				salir = sc.nextLine();

				pst.setInt(1, id);
				pst.setString(2, nombre);
				pst.setDouble(3, price);
				pst.executeUpdate();
			}

//			// sustituimos las '?' de la SQL por las variables
//			pst.setInt(1, id);
//			pst.setString(2, nombre);
//			pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
//
////			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}