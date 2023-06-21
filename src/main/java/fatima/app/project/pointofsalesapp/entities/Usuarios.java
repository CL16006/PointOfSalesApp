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
@Table(name = "usuarios", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByIdusuarios", query = "SELECT u FROM Usuarios u WHERE u.idusuarios = :idusuarios"),
    @NamedQuery(name = "Usuarios.findByCorreo", query = "SELECT u FROM Usuarios u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuarios.findByPass", query = "SELECT u FROM Usuarios u WHERE u.pass = :pass"),
    @NamedQuery(name = "Usuarios.findByEstado", query = "SELECT u FROM Usuarios u WHERE u.estado = :estado"),
    @NamedQuery(name = "Usuarios.findByIdRol", query = "SELECT u FROM Usuarios u WHERE u.idRol = :idRol"),
    @NamedQuery(name = "Usuarios.findByIdPersona", query = "SELECT u FROM Usuarios u WHERE u.idPersona = :idPersona"),
    @NamedQuery(name = "Usuarios.findByValidarCorreo", query = "SELECT u FROM Usuarios u WHERE u.validarCorreo = :validarCorreo")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuarios", nullable = false)
    private Integer idusuarios;
    @Basic(optional = false)
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;
    @Basic(optional = false)
    @Column(name = "pass", nullable = false, length = 45)
    private String pass;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "id_rol")
    private Integer idRol;
    @Column(name = "id_persona")
    private Integer idPersona;
    @Column(name = "validar_correo")
    private Integer validarCorreo;

    public Usuarios() {
    }

    public Usuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public Usuarios(Integer idusuarios, String correo, String pass) {
        this.idusuarios = idusuarios;
        this.correo = correo;
        this.pass = pass;
    }

    public Integer getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getValidarCorreo() {
        return validarCorreo;
    }

    public void setValidarCorreo(Integer validarCorreo) {
        this.validarCorreo = validarCorreo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarios != null ? idusuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idusuarios == null && other.idusuarios != null) || (this.idusuarios != null && !this.idusuarios.equals(other.idusuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.Usuarios[ idusuarios=" + idusuarios + " ]";
    }
    
}
