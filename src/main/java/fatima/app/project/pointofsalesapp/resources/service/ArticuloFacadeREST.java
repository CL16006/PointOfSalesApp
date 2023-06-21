/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatima.app.project.pointofsalesapp.resources.service;

import fatima.app.project.pointofsalesapp.entities.Articulo;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author ftmca
 */
@jakarta.ejb.Stateless
@jakarta.ws.rs.Path("articulo")
public class ArticuloFacadeREST extends AbstractFacade<Articulo> {

    @PersistenceContext(unitName = "fatima.app.project_PointOfSalesApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public ArticuloFacadeREST() {
        super(Articulo.class);
    }

    @jakarta.ws.rs.POST
    @Override
    @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_XML, jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
    public void create(Articulo entity) {
        super.create(entity);
    }

    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("{id}")
    @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_XML, jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
    public void edit(@jakarta.ws.rs.PathParam("id") Integer id, Articulo entity) {
        super.edit(entity);
    }

    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("{id}")
    public void remove(@jakarta.ws.rs.PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("{id}")
    @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_XML, jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
    public Articulo find(@jakarta.ws.rs.PathParam("id") Integer id) {
        return super.find(id);
    }

    @jakarta.ws.rs.GET
    @Override
    @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_XML, jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<Articulo> findAll() {
        return super.findAll();
    }

    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("{from}/{to}")
    @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_XML, jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<Articulo> findRange(@jakarta.ws.rs.PathParam("from") Integer from, @jakarta.ws.rs.PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("count")
    @jakarta.ws.rs.Produces(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
