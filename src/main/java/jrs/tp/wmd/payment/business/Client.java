package jrs.tp.wmd.payment.business;

public class Client {
	private long id;
	private String Nom;
	private String Prenom;
	private String Contact;
	private Password passwrd;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	
	public Password getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(Password passwrd) {
		this.passwrd = passwrd;
	}
	public Client() {
		super();	
	}
	public Client(long id, String nom, String prenom, String contact, Password passwrd) {
		super();
		this.id = id;
		Nom = nom;
		Prenom = prenom;
		Contact = contact;
		this.passwrd = passwrd;
	}
	
	
	
}
