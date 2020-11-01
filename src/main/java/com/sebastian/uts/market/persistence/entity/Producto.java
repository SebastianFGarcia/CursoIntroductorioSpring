package com.sebastian.uts.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer IdProducto;
    @Column(name = "nombre")
    private String Nombre;
    @Column(name = "id_categoria")
    private Integer IdCategoria;
    @Column(name = "codigo_barras")
    private String CodigoBarras;
    @Column(name = "precio_venta")
    private Double PrecioVenta;
    @Column(name = "cantidad_stock")
    private Integer CantidadStock;
    @Column(name = "estado")
    private Boolean Estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;


    public Integer getIdProducto() {
        return this.IdProducto;
    }

    public void setIdProducto(Integer IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getIdCategoria() {
        return this.IdCategoria;
    }

    public void setIdCategoria(Integer IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getCodigoBarras() {
        return this.CodigoBarras;
    }

    public void setCodigoBarras(String CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }

    public Double getPrecioVenta() {
        return this.PrecioVenta;
    }

    public void setPrecioVenta(Double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public Integer getCantidadStock() {
        return this.CantidadStock;
    }

    public void setCantidadStock(Integer CantidadStock) {
        this.CantidadStock = CantidadStock;
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
            " IdProducto='" + getIdProducto() + "'" +
            ", Nombre='" + getNombre() + "'" +
            ", IdCategoria='" + getIdCategoria() + "'" +
            ", CodigoBarras='" + getCodigoBarras() + "'" +
            ", PrecioVenta='" + getPrecioVenta() + "'" +
            ", CantidadStock='" + getCantidadStock() + "'" +
            ", Estado='" + isEstado() + "'" +
            "}";
    }
    
   
}
