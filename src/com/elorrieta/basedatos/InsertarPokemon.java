package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPokemon {

	public static void main(String[] args) {

		String sql = "INSERT INTO pokemon (nombre, numero, precio, brillante) VALUES (?, ?, ?, ?) ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			String nombre;
			int id;
			double price = 0;
			String salir = "";
			// TODO pedir datos por consola
			// TODO arreglar precio

			System.out.println("Introduce nombre Pokemon: ");
			nombre = sc.nextLine();
			pst.setString(1, nombre);

			System.out.println("Introduce numero: ");
			String numero = sc.nextLine();
			pst.setString(2, numero);

			System.out.println("Introduce un precio: ");
			float precio = Float.parseFloat(sc.nextLine());
			pst.setFloat(3, precio);

			System.out.println("¿El Pokemos es brillante? S-Si o N-No");
			String brillante = sc.nextLine();
			boolean isBrillante = false;
			if ("s".equalsIgnoreCase(brillante) || "si".equalsIgnoreCase(brillante)) {
				isBrillante = true;
			}
			pst.setBoolean(4, isBrillante);
			pst.executeUpdate();
			System.out.println("Pokemon añadido");

//			while (!"s".equalsIgnoreCase(salir)) {
//				System.out.println("Dime nombre: ");
//				nombre = sc.nextLine();
//
//				System.out.println("Dime id. ");
//				id = Integer.parseInt(sc.nextLine());
//
//				System.out.println("Intorduce precio");
//				price = Double.parseDouble(sc.nextLine());
//
//				System.out.println("Persona insertada");
//
//				System.out.println("¿Quieres salir?");
//				salir = sc.nextLine();

//			pst.setInt(1, 5);
//			pst.setString(2, "Charizard");
//			pst.setFloat(4, 250.75f);
//			pst.setString(3, "Ch_25");
//			pst.setBoolean(5, false);
//			pst.executeUpdate();
//			System.out.println("Pokemon añadido");

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
