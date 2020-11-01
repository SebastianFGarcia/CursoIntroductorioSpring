package com.sebastian.uts.market.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer IdCategoria;
    @Column(name = "descripcion")
    private String Descripcion;
    @Column(name = "estado")
    private Boolean Estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;


    public Integer getIdCategoria() {
        return this.IdCategoria;
    }

    public void setIdCategoria(Integer IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
            " IdCategoria='" + getIdCategoria() + "'" +
            ", Descripcion='" + getDescripcion() + "'" +
            ", Estado='" + isEstado() + "'" +
            "}";
    }

}
