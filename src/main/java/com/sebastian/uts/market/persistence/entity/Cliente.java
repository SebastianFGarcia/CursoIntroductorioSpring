package com.sebastian.uts.market.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "id")
    private String IdCliente;
    @Column(name = "nombre")
    private String Nombre;
    @Column(name = "apellidos")
    private String Apellidos;
    @Column(name = "celular")
    private Long Celular;
    @Column(name = "direccion")
    private String Direccion;
    @Column(name = "correo_electronico")
    private String CorreoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


    public String getIdCliente() {
        return this.IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return this.Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Long getCelular() {
        return this.Celular;
    }

    public void setCelular(Long Celular) {
        this.Celular = Celular;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreoElectronico() {
        return this.CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    @Override
    public String toString() {
        return "{" +
            " IdCliente='" + getIdCliente() + "'" +
            ", Nombre='" + getNombre() + "'" +
            ", Apellidos='" + getApellidos() + "'" +
            ", Celular='" + getCelular() + "'" +
            ", Direccion='" + getDireccion() + "'" +
            ", CorreoElectronico='" + getCorreoElectronico() + "'" +
            "}";
    }
   

}
