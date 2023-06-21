/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatima.app.project.pointofsalesapp.entities;

import jakarta.json.bind.annotation.JsonbTransient;
import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

/**
 *
 * @author ftmca
 */
@Entity
@Table(name = "usuario", catalog = "ashor", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"login"})})
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByTipoDocumento", query = "SELECT u FROM Usuario u WHERE u.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Usuario.findByNumDocumento", query = "SELECT u FROM Usuario u WHERE u.numDocumento = :numDocumento"),
    @NamedQuery(name = "Usuario.findByDireccion", query = "SELECT u FROM Usuario u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Usuario.findByTelefono", query = "SELECT u FROM Usuario u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByCargo", query = "SELECT u FROM Usuario u WHERE u.cargo = :cargo"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findByClave", query = "SELECT u FROM Usuario u WHERE u.clave = :clave"),
    @NamedQuery(name = "Usuario.findByImagen", query = "SELECT u FROM Usuario u WHERE u.imagen = :imagen"),
    @NamedQuery(name = "Usuario.findByCondicion", query = "SELECT u FROM Usuario u WHERE u.condicion = :condicion")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario", nullable = false)
    private Integer idusuario;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "tipo_documento", nullable = false, length = 20)
    private String tipoDocumento;
    @Basic(optional = false)
    @Column(name = "num_documento", nullable = false, length = 20)
    private String numDocumento;
    @Column(name = "direccion", length = 70)
    private String direccion;
    @Column(name = "telefono", length = 20)
    private String telefono;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "cargo", length = 20)
    private String cargo;
    @Basic(optional = false)
    @Column(name = "login", nullable = false, length = 20)
    private String login;
    @Basic(optional = false)
    @Column(name = "clave", nullable = false, length = 64)
    private String clave;
    @Basic(optional = false)
    @Column(name = "imagen", nullable = false, length = 50)
    private String imagen;
    @Basic(optional = false)
    @Column(name = "condicion", nullable = false)
    private short condicion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idusuario")
    private List<Venta> ventaList;
    @JsonbTransient
    @OneToMany(mappedBy = "idusuario")
    private List<Ingreso> ingresoList;
    @JsonbTransient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idusuario")
    private List<UsuarioPermiso> usuarioPermisoList;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String nombre, String tipoDocumento, String numDocumento, String login, String clave, String imagen, short condicion) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.login = login;
        this.clave = clave;
        this.imagen = imagen;
        this.condicion = condicion;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public short getCondicion() {
        return condicion;
    }

    public void setCondicion(short condicion) {
        this.condicion = condicion;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public List<Ingreso> getIngresoList() {
        return ingresoList;
    }

    public void setIngresoList(List<Ingreso> ingresoList) {
        this.ingresoList = ingresoList;
    }

    public List<UsuarioPermiso> getUsuarioPermisoList() {
        return usuarioPermisoList;
    }

    public void setUsuarioPermisoList(List<UsuarioPermiso> usuarioPermisoList) {
        this.usuarioPermisoList = usuarioPermisoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
