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
@Table(name = "venta", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByIdventa", query = "SELECT v FROM Venta v WHERE v.idventa = :idventa"),
    @NamedQuery(name = "Venta.findByTipoComprobante", query = "SELECT v FROM Venta v WHERE v.tipoComprobante = :tipoComprobante"),
    @NamedQuery(name = "Venta.findBySerieComprobante", query = "SELECT v FROM Venta v WHERE v.serieComprobante = :serieComprobante"),
    @NamedQuery(name = "Venta.findByNumComprobante", query = "SELECT v FROM Venta v WHERE v.numComprobante = :numComprobante"),
    @NamedQuery(name = "Venta.findByFechaHora", query = "SELECT v FROM Venta v WHERE v.fechaHora = :fechaHora"),
    @NamedQuery(name = "Venta.findByImpuesto", query = "SELECT v FROM Venta v WHERE v.impuesto = :impuesto"),
    @NamedQuery(name = "Venta.findByTotalVenta", query = "SELECT v FROM Venta v WHERE v.totalVenta = :totalVenta"),
    @NamedQuery(name = "Venta.findByEstado", query = "SELECT v FROM Venta v WHERE v.estado = :estado")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idventa", nullable = false)
    private Integer idventa;
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
    @Column(name = "impuesto", precision = 4, scale = 2)
    private BigDecimal impuesto;
    @Column(name = "total_venta", precision = 11, scale = 2)
    private BigDecimal totalVenta;
    @Column(name = "estado", length = 20)
    private String estado;
    @JsonbTransient
    @JoinColumn(name = "idcliente", referencedColumnName = "idpersona", nullable = false)
    @ManyToOne(optional = false)
    private Persona idcliente;
    @JsonbTransient
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", nullable = false)
    @ManyToOne(optional = false)
    private Usuario idusuario;
    @JsonbTransient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idventa")
    private List<DetalleVenta> detalleVentaList;

    public Venta() {
    }

    public Venta(Integer idventa) {
        this.idventa = idventa;
    }

    public Venta(Integer idventa, String tipoComprobante, String numComprobante, Date fechaHora) {
        this.idventa = idventa;
        this.tipoComprobante = tipoComprobante;
        this.numComprobante = numComprobante;
        this.fechaHora = fechaHora;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
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

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Persona getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Persona idcliente) {
        this.idcliente = idcliente;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idventa != null ? idventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idventa == null && other.idventa != null) || (this.idventa != null && !this.idventa.equals(other.idventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.Venta[ idventa=" + idventa + " ]";
    }
    
}
