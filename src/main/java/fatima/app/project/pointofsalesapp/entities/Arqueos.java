/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatima.app.project.pointofsalesapp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ftmca
 */
@Entity
@Table(name = "arqueos", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "Arqueos.findAll", query = "SELECT a FROM Arqueos a"),
    @NamedQuery(name = "Arqueos.findByIdarqueo", query = "SELECT a FROM Arqueos a WHERE a.idarqueo = :idarqueo"),
    @NamedQuery(name = "Arqueos.findByIdusuario", query = "SELECT a FROM Arqueos a WHERE a.idusuario = :idusuario"),
    @NamedQuery(name = "Arqueos.findByIdresponsable", query = "SELECT a FROM Arqueos a WHERE a.idresponsable = :idresponsable"),
    @NamedQuery(name = "Arqueos.findByFecha", query = "SELECT a FROM Arqueos a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Arqueos.findByTotalVenta", query = "SELECT a FROM Arqueos a WHERE a.totalVenta = :totalVenta"),
    @NamedQuery(name = "Arqueos.findByTotalArqueo", query = "SELECT a FROM Arqueos a WHERE a.totalArqueo = :totalArqueo"),
    @NamedQuery(name = "Arqueos.findByDiferencia", query = "SELECT a FROM Arqueos a WHERE a.diferencia = :diferencia"),
    @NamedQuery(name = "Arqueos.findByCondicion", query = "SELECT a FROM Arqueos a WHERE a.condicion = :condicion")})
public class Arqueos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarqueo", nullable = false)
    private Integer idarqueo;
    @Column(name = "idusuario")
    private Integer idusuario;
    @Column(name = "idresponsable")
    private Integer idresponsable;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "total_venta")
    private Long totalVenta;
    @Column(name = "total_arqueo")
    private Long totalArqueo;
    @Column(name = "diferencia")
    private Long diferencia;
    @Column(name = "condicion")
    private Integer condicion;

    public Arqueos() {
    }

    public Arqueos(Integer idarqueo) {
        this.idarqueo = idarqueo;
    }

    public Integer getIdarqueo() {
        return idarqueo;
    }

    public void setIdarqueo(Integer idarqueo) {
        this.idarqueo = idarqueo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdresponsable() {
        return idresponsable;
    }

    public void setIdresponsable(Integer idresponsable) {
        this.idresponsable = idresponsable;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Long totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Long getTotalArqueo() {
        return totalArqueo;
    }

    public void setTotalArqueo(Long totalArqueo) {
        this.totalArqueo = totalArqueo;
    }

    public Long getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Long diferencia) {
        this.diferencia = diferencia;
    }

    public Integer getCondicion() {
        return condicion;
    }

    public void setCondicion(Integer condicion) {
        this.condicion = condicion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarqueo != null ? idarqueo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arqueos)) {
            return false;
        }
        Arqueos other = (Arqueos) object;
        if ((this.idarqueo == null && other.idarqueo != null) || (this.idarqueo != null && !this.idarqueo.equals(other.idarqueo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.Arqueos[ idarqueo=" + idarqueo + " ]";
    }
    
}
