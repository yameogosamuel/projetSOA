package jrs.tp.wmd.payment.business;

import java.util.Date;

public class Compte {
	private String Num;
	private String Nom;
	private Date dateCreation;
	private double Solde;
	
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return Solde;
	}
	public void setSolde(double solde) {
		Solde = solde;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String num, String nom, Date dateCreation, double solde) {
		super();
		Num = num;
		Nom = nom;
		this.dateCreation = dateCreation;
		Solde = solde;
	}
	
	
}
