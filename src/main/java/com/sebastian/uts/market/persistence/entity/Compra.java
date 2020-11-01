package com.sebastian.uts.market.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer IdCompra;
    @Column(name = "id_cliente")
    private String IdCliente;
    @Column(name = "fecha")
    private LocalDateTime Fecha;
    @Column(name = "medio_pago")
    private String MedioPago;
    @Column(name = "comentario")
    private String Comentario;
    @Column(name = "estado")
    private String Estado;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false,updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<CompraProducto> productos;

    public Integer getIdCompra() {
        return this.IdCompra;
    }

    public void setIdCompra(Integer IdCompra) {
        this.IdCompra = IdCompra;
    }

    public String getIdCliente() {
        return this.IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public LocalDateTime getFecha() {
        return this.Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }

    public String getMedioPago() {
        return this.MedioPago;
    }

    public void setMedioPago(String MedioPago) {
        this.MedioPago = MedioPago;
    }

    public String getComentario() {
        return this.Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public String getEstado() {
        return this.Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "{" +
            " IdCompra='" + getIdCompra() + "'" +
            ", IdCliente='" + getIdCliente() + "'" +
            ", Fecha='" + getFecha() + "'" +
            ", MedioPago='" + getMedioPago() + "'" +
            ", Comentario='" + getComentario() + "'" +
            ", Estado='" + getEstado() + "'" +
            "}";
    }
   
    
}
