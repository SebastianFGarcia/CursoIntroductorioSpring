package com.sebastian.uts.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;
    @Column(name = "cantidad")
    private Integer Cantidad;
    @Column(name = "total")
    private Double Total;
    @Column(name = "estado")
    private Boolean Estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public CompraProductoPK getId() {
        return this.id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return this.Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getTotal() {
        return this.Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Boolean isEstado() {
        return this.Estado;
    }

    public Boolean getEstado() {
        return this.Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", Cantidad='" + getCantidad() + "'" +
            ", Total='" + getTotal() + "'" +
            ", Estado='" + isEstado() + "'" +
            "}";
    }
   
    
}
