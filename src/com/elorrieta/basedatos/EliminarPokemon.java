package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarPokemon {

	public static void main(String[] args) {

		String sql = "DELETE FROM pokemon WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {
			String delPok;
			do {

				System.out.println("Introduce el id del Pokemon a eliminar");
				int id = Integer.parseInt(sc.nextLine());
				pst.setInt(1, id);

				int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
				System.out.println("Hemos eliminado " + filas + " filas");
				System.out.println("¿Quieres seguir eliminando Pokemons: S-Si o N-No");
				delPok = sc.nextLine();
			} while ("s".equalsIgnoreCase(delPok) || "si".equalsIgnoreCase(delPok));
			System.out.println("Pokemon o Pokemons eliminado/s");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}