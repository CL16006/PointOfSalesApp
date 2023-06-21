/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatima.app.project.pointofsalesapp.entities;

import jakarta.json.bind.annotation.JsonbTransient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;


/**
 *
 * @author ftmca
 */
@Entity
@Table(name = "ingreso", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ingreso.findAll", query = "SELECT i FROM Ingreso i"),
    @NamedQuery(name = "Ingreso.findByIdingreso", query = "SELECT i FROM Ingreso i WHERE i.idingreso = :idingreso"),
    @NamedQuery(name = "Ingreso.findByTipoComprobante", query = "SELECT i FROM Ingreso i WHERE i.tipoComprobante = :tipoComprobante"),
    @NamedQuery(name = "Ingreso.findBySerieComprobante", query = "SELECT i FROM Ingreso i WHERE i.serieComprobante = :serieComprobante"),
    @NamedQuery(name = "Ingreso.findByNumComprobante", query = "SELECT i FROM Ingreso i WHERE i.numComprobante = :numComprobante"),
    @NamedQuery(name = "Ingreso.findByFechaHora", query = "SELECT i FROM Ingreso i WHERE i.fechaHora = :fechaHora"),
    @NamedQuery(name = "Ingreso.findByImpuesto", query = "SELECT i FROM Ingreso i WHERE i.impuesto = :impuesto"),
    @NamedQuery(name = "Ingreso.findByTotalCompra", query = "SELECT i FROM Ingreso i WHERE i.totalCompra = :totalCompra"),
    @NamedQuery(name = "Ingreso.findByEstado", query = "SELECT i FROM Ingreso i WHERE i.estado = :estado")})
public class Ingreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idingreso", nullable = false)
    private Integer idingreso;
    @Basic(optional = false)
    @Column(name = "tipo_comprobante", nullable = false, length = 20)
    private String tipoComprobante;
    @Column(name = "serie_comprobante", length = 7)
    private String serieComprobante;
    @Basic(optional = false)
    @Column(name = "num_comprobante", nullable = false, length = 10)
    private String numComprobante;
    @Basic(optional = false)
    @Column(name = "fecha_hora", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "impuesto", nullable = false, precision = 4, scale = 2)
    private BigDecimal impuesto;
    @Basic(optional = false)
    @Column(name = "total_compra", nullable = false, precision = 11, scale = 2)
    private BigDecimal totalCompra;
    @Basic(optional = false)
    @Column(name = "estado", nullable = false, length = 20)
    private String estado;
    @JsonbTransient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idingreso")
    private List<DetalleIngreso> detalleIngresoList;
    @JoinColumn(name = "idproveedor", referencedColumnName = "idpersona", nullable = false)
    @ManyToOne(optional = false)
    private Persona idproveedor;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario idusuario;

    public Ingreso() {
    }

    public Ingreso(Integer idingreso) {
        this.idingreso = idingreso;
    }

    public Ingreso(Integer idingreso, String tipoComprobante, String numComprobante, Date fechaHora, BigDecimal impuesto, BigDecimal totalCompra, String estado) {
        this.idingreso = idingreso;
        this.tipoComprobante = tipoComprobante;
        this.numComprobante = numComprobante;
        this.fechaHora = fechaHora;
        this.impuesto = impuesto;
        this.totalCompra = totalCompra;
        this.estado = estado;
    }

    public Integer getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(Integer idingreso) {
        this.idingreso = idingreso;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public BigDecimal getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    public BigDecimal getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(BigDecimal totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetalleIngreso> getDetalleIngresoList() {
        return detalleIngresoList;
    }

    public void setDetalleIngresoList(List<DetalleIngreso> detalleIngresoList) {
        this.detalleIngresoList = detalleIngresoList;
    }

    public Persona getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Persona idproveedor) {
        this.idproveedor = idproveedor;
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
        hash += (idingreso != null ? idingreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingreso)) {
            return false;
        }
        Ingreso other = (Ingreso) object;
        if ((this.idingreso == null && other.idingreso != null) || (this.idingreso != null && !this.idingreso.equals(other.idingreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.Ingreso[ idingreso=" + idingreso + " ]";
    }
    
}
