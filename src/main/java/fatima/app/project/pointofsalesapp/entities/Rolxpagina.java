/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatima.app.project.pointofsalesapp.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 *
 * @author ftmca
 */
@Entity
@Table(name = "rolxpagina", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "Rolxpagina.findAll", query = "SELECT r FROM Rolxpagina r"),
    @NamedQuery(name = "Rolxpagina.findByIdrolxpagina", query = "SELECT r FROM Rolxpagina r WHERE r.idrolxpagina = :idrolxpagina"),
    @NamedQuery(name = "Rolxpagina.findByIdRoles", query = "SELECT r FROM Rolxpagina r WHERE r.idRoles = :idRoles"),
    @NamedQuery(name = "Rolxpagina.findByPagina", query = "SELECT r FROM Rolxpagina r WHERE r.pagina = :pagina"),
    @NamedQuery(name = "Rolxpagina.findByMenupadre", query = "SELECT r FROM Rolxpagina r WHERE r.menupadre = :menupadre")})
public class Rolxpagina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrolxpagina", nullable = false)
    private Integer idrolxpagina;
    @Column(name = "id_roles", length = 45)
    private String idRoles;
    @Column(name = "pagina", length = 45)
    private String pagina;
    @Column(name = "menupadre")
    private Integer menupadre;

    public Rolxpagina() {
    }

    public Rolxpagina(Integer idrolxpagina) {
        this.idrolxpagina = idrolxpagina;
    }

    public Integer getIdrolxpagina() {
        return idrolxpagina;
    }

    public void setIdrolxpagina(Integer idrolxpagina) {
        this.idrolxpagina = idrolxpagina;
    }

    public String getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(String idRoles) {
        this.idRoles = idRoles;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public Integer getMenupadre() {
        return menupadre;
    }

    public void setMenupadre(Integer menupadre) {
        this.menupadre = menupadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrolxpagina != null ? idrolxpagina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolxpagina)) {
            return false;
        }
        Rolxpagina other = (Rolxpagina) object;
        if ((this.idrolxpagina == null && other.idrolxpagina != null) || (this.idrolxpagina != null && !this.idrolxpagina.equals(other.idrolxpagina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.Rolxpagina[ idrolxpagina=" + idrolxpagina + " ]";
    }
    
}
