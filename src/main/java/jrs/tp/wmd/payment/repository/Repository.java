package jrs.tp.wmd.payment.repository;

import java.util.HashMap;
import java.util.Map;

import jrs.tp.wmd.payment.business.Client;
import jrs.tp.wmd.payment.business.Compte;
import jrs.tp.wmd.payment.business.Password;



public class Repository {
	private static Map<Long, Client> clients=new HashMap<>();
	private static Map<String, Compte> comptes=new HashMap<>();
	private static Map<String, Password> passwords=new HashMap<>();
	
	public static Map<Long, Client> getClients() {
		return clients;
	}
	public static Map<String, Compte> getComptes() {
		return comptes;
	}
	public static Map<String, Password> getPasswords() {
		return passwords;
	}
	
}
