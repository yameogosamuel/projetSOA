package jrs.tp.wmd.restauration;


import java.util.ArrayList;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/Repas")
public class RepasRessource {
RepasManager repasmanager = new RepasManager();
@GET
@Consumes(MediaType.APPLICATION_JSON)
public ArrayList<Repas> getRepas() {
return repasmanager.getRepas();
}
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Repas submitRepas(Repas repas) {
return repasmanager.submitRepas(repas);
}
@PUT
@Path("/{RepasId}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Repas updateRepas(@PathParam("RepasId") long id, Repas repas) {
repas.setId(id);
return repasmanager.updateRepas(repas);
}
@GET
@Path("/{RepasId}")
@Consumes(MediaType.APPLICATION_JSON)
public Repas getRepasDetails(@PathParam("RepasId") long id) {
return repasmanager.getRepasDetails(id);
}
}