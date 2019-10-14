package jrs.tp.wmd.restauration;

import java.util.ArrayList;
import java.util.Map;
public class RepasManager {

private Map<Long, Repas> repas = Repository.getRepas();
public ArrayList<Repas> getRepas() {
return new ArrayList<Repas>(repas.values());
}
public Repas submitRepas(Repas rep) {
	rep= new Repas();
	repas.put(rep.getId(), rep);
	return rep;
}
public Repas getRepasDetails(long repasId) {
return repas.get(repasId);
}
public Repas getRepasForClient(long clientId) {
	return repas.get(clientId);
}

public Repas cancelRepas(long repasId) {
return repas.remove(repasId);
}
public Repas updateRepas(Repas rep) {
	repas.put(rep.getId(), rep);
	return rep;
}
}
