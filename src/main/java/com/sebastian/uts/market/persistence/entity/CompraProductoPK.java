package com.sebastian.uts.market.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompraProductoPK implements Serializable{
    
   
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Column(name = "id_compra")
    private Integer IdCompra;
    @Column(name = "id_producto")
    private Integer IdProducto;


    public Integer getIdCompra() {
        return this.IdCompra;
    }

    public void setIdCompra(Integer IdCompra) {
        this.IdCompra = IdCompra;
    }

    public Integer getIdProducto() {
        return this.IdProducto;
    }

    public void setIdProducto(Integer IdProducto) {
        this.IdProducto = IdProducto;
    }


    @Override
    public String toString() {
        return "{" +
            " IdCompra='" + getIdCompra() + "'" +
            ", IdProducto='" + getIdProducto() + "'" +
            "}";
    }

}
