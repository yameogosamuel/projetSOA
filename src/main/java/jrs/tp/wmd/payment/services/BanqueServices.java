package jrs.tp.wmd.payment.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import jrs.tp.wmd.payment.business.Client;
import jrs.tp.wmd.payment.business.Compte;
import jrs.tp.wmd.payment.business.Password;



public class BanqueServices {
	private static Map<Long, Client> clients=new HashMap<>();
	private static Map<String, Compte> comptes=new HashMap<>();
	private static Map<String, Password> passwords=new HashMap<>();
	
	public String createCompte(String Num,String Nom, double solde){
		Compte acc=new Compte(Num, Nom, new Date(), solde);
		comptes.put(Num, acc);
		return Num;
	}
	public boolean payerFac(String Num, double mt){
		Compte acc=new Compte();
		acc=comptes.get(Num);
		double montant=acc.getSolde();
		montant-=mt;
		comptes.get(Num).setSolde(montant);
		return true;
	}
	public boolean authen(String lgn,String pwd){
		Collection<Password> lp= new ArrayList<Password>();
		lp= passwords.values();
		boolean test=false;
		for(Password p: lp){
			if(p.getLogin().equals(lgn)&&p.getPasswd().equals(pwd))
				test=true;
							}
			return test;
	}
	
	public Compte affCompte(String Num){
		Compte acc=new Compte();
		acc=comptes.get(Num);
		return acc;	
	}
	
	public Client createClient(long id,String Nom,String Prenom,String Contact,String login, String passwd){
		Password pwd=new Password(login,passwd);
		Client clt=new Client(id,Nom,Prenom, Contact, pwd);
		clients.put(id, clt);
		passwords.put(Nom, pwd);
		return clt;
	}
	public Collection<Password> listPass(){
		return passwords.values();	
	}
}
