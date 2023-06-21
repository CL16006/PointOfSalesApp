/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatima.app.project.pointofsalesapp.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;


/**
 *
 * @author ftmca
 */
@Entity
@Table(name = "failed_jobs", catalog = "ashor", schema = "")
@NamedQueries({
    @NamedQuery(name = "FailedJobs.findAll", query = "SELECT f FROM FailedJobs f"),
    @NamedQuery(name = "FailedJobs.findById", query = "SELECT f FROM FailedJobs f WHERE f.id = :id"),
    @NamedQuery(name = "FailedJobs.findByFailedAt", query = "SELECT f FROM FailedJobs f WHERE f.failedAt = :failedAt")})
public class FailedJobs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Lob
    @Column(name = "connection", nullable = false, length = 65535)
    private String connection;
    @Basic(optional = false)
    @Lob
    @Column(name = "queue", nullable = false, length = 65535)
    private String queue;
    @Basic(optional = false)
    @Lob
    @Column(name = "payload", nullable = false, length = 2147483647)
    private String payload;
    @Basic(optional = false)
    @Lob
    @Column(name = "exception", nullable = false, length = 2147483647)
    private String exception;
    @Basic(optional = false)
    @Column(name = "failed_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date failedAt;

    public FailedJobs() {
    }

    public FailedJobs(Long id) {
        this.id = id;
    }

    public FailedJobs(Long id, String connection, String queue, String payload, String exception, Date failedAt) {
        this.id = id;
        this.connection = connection;
        this.queue = queue;
        this.payload = payload;
        this.exception = exception;
        this.failedAt = failedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Date getFailedAt() {
        return failedAt;
    }

    public void setFailedAt(Date failedAt) {
        this.failedAt = failedAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FailedJobs)) {
            return false;
        }
        FailedJobs other = (FailedJobs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fatima.app.project.pointofsalesapp.entities.FailedJobs[ id=" + id + " ]";
    }
    
}
