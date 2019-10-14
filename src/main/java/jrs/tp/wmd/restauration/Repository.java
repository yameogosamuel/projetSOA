package jrs.tp.wmd.restauration;
import java.util.HashMap;
import java.util.Map;
public class Repository {
		
	private static Map<Long, Repas> repas= new HashMap<>();
	private static Map<Long, Client> clients = new HashMap<>();

	public static Map<Long, Client> getClient() {
		return clients;
	}
	
	public static Map<Long, Repas> getRepas() {
		return repas;
}}
