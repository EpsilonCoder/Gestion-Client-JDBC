package com.agence.dao;

public class IClient {

	public static String InsererClientQuery() {
		return "INSERT INTO client(prenom , nom , tel) VALUES(?,?,?)";
	}

	public static String afficherQuery() {
		return "SELECT * FROM client";
	}

	public static String afficherQueryById(int id) {
		return "SELECT * FROM client WHERE id = " + id;
	}

	public static String supprimer(int id) {
		return "DELETE FROM client WHERE id = " + id;
	}

	public static String updateClient(int id) {
		return "Update client Set prenom =? , nom =? , tel =? WHERE  id = " + id;
	}

}
