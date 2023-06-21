/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatima.app.project.pointofsalesapp.entities;

import jakarta.json.bind.annotation.JsonbTransient;
import java.io.Serializable;
import jakarta.persistence.*;


/**
 *
 * @author ftmca
 */
@Entity
@Table(name = "usuario_permiso", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "UsuarioPermiso.findAll", query = "SELECT u FROM UsuarioPermiso u"),
    @NamedQuery(name = "UsuarioPermiso.findByIdusuarioPermiso", query = "SELECT u FROM UsuarioPermiso u WHERE u.idusuarioPermiso = :idusuarioPermiso")})
public class UsuarioPermiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario_permiso", nullable = false)
    private Integer idusuarioPermiso;
    @JoinColumn(name = "idpermiso", referencedColumnName = "idpermiso", nullable = false)
    @ManyToOne(optional = false)
    @JsonbTransient
    private Permiso idpermiso;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", nullable = false)
    @ManyToOne(optional = false)
    private Usuario idusuario;

    public UsuarioPermiso() {
    }

    public UsuarioPermiso(Integer idusuarioPermiso) {
        this.idusuarioPermiso = idusuarioPermiso;
    }

    public Integer getIdusuarioPermiso() {
        return idusuarioPermiso;
    }

    public void setIdusuarioPermiso(Integer idusuarioPermiso) {
        this.idusuarioPermiso = idusuarioPermiso;
    }

    public Permiso getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(Permiso idpermiso) {
        this.idpermiso = idpermiso;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarioPermiso != null ? idusuarioPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPermiso)) {
            return false;
        }
        UsuarioPermiso other = (UsuarioPermiso) object;
        if ((this.idusuarioPermiso == null && other.idusuarioPermiso != null) || (this.idusuarioPermiso != null && !this.idusuarioPermiso.equals(other.idusuarioPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.UsuarioPermiso[ idusuarioPermiso=" + idusuarioPermiso + " ]";
    }
    
}
