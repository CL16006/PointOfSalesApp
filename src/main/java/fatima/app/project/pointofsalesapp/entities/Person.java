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
@Table(name = "person", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
    @NamedQuery(name = "Person.findByIdpersona", query = "SELECT p FROM Person p WHERE p.idpersona = :idpersona"),
    @NamedQuery(name = "Person.findByPrimerNombre", query = "SELECT p FROM Person p WHERE p.primerNombre = :primerNombre"),
    @NamedQuery(name = "Person.findBySegundoNombre", query = "SELECT p FROM Person p WHERE p.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Person.findByPrimerApellido", query = "SELECT p FROM Person p WHERE p.primerApellido = :primerApellido"),
    @NamedQuery(name = "Person.findBySegundoApellido", query = "SELECT p FROM Person p WHERE p.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "Person.findByTelefono", query = "SELECT p FROM Person p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Person.findByCelular", query = "SELECT p FROM Person p WHERE p.celular = :celular"),
    @NamedQuery(name = "Person.findByDireccion", query = "SELECT p FROM Person p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Person.findByIsss", query = "SELECT p FROM Person p WHERE p.isss = :isss"),
    @NamedQuery(name = "Person.findByDui", query = "SELECT p FROM Person p WHERE p.dui = :dui"),
    @NamedQuery(name = "Person.findByNit", query = "SELECT p FROM Person p WHERE p.nit = :nit"),
    @NamedQuery(name = "Person.findByCodigo", query = "SELECT p FROM Person p WHERE p.codigo = :codigo")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpersona", nullable = false)
    private Integer idpersona;
    @Column(name = "primer_nombre", length = 50)
    private String primerNombre;
    @Column(name = "segundo_nombre", length = 100)
    private String segundoNombre;
    @Column(name = "primer_apellido", length = 50)
    private String primerApellido;
    @Column(name = "segundo_apellido", length = 50)
    private String segundoApellido;
    @Column(name = "telefono", length = 45)
    private String telefono;
    @Column(name = "celular", length = 45)
    private String celular;
    @Column(name = "direccion", length = 45)
    private String direccion;
    @Column(name = "isss", length = 45)
    private String isss;
    @Column(name = "dui", length = 45)
    private String dui;
    @Column(name = "nit", length = 45)
    private String nit;
    @Column(name = "codigo", length = 45)
    private String codigo;

    public Person() {
    }

    public Person(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIsss() {
        return isss;
    }

    public void setIsss(String isss) {
        this.isss = isss;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.Person[ idpersona=" + idpersona + " ]";
    }
    
}
