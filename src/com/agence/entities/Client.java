package com.agence.entities;

public class Client {
	
	private int id;
	private String prenom;
	private String nom;
	private String tel;
	
	public Client(int id, String prenom, String nom, String tel) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.tel = tel;
	}


	public Client(String prenom, String nom, String tel) {	
		this.prenom = prenom;
		this.nom = nom;
		this.tel = tel;
	}
    
	public int getId() {
		return id;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
