package com.joelespinozaro.calculadora.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "entidad_bancaria")
public class EntidadBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entidad_bancaria")
    private Integer idEntidadBancaria;

    private String nombre;

    private String direccion;

    private String telefono;

    @Column(name = "id_tipo_entidad_bancaria")
    private Integer idTipoEntidadBancaria;

    @ManyToOne
    @JoinColumn(name = "id_tipo_entidad_bancaria", insertable = false, updatable = false)
    private TipoEntidadBancaria tipoEntidadBancaria;


    @OneToMany(mappedBy = "entidadBancaria")
    private List<Recomendacion> recomendaciones;

    public TipoEntidadBancaria getTipoEntidadBancaria() {
        return tipoEntidadBancaria;
    }

    public void setTipoEntidadBancaria(TipoEntidadBancaria tipoEntidadBancaria) {
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }

    public List<Recomendacion> getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(List<Recomendacion> recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Integer getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    public void setIdEntidadBancaria(Integer idEntidadBancaria) {
        this.idEntidadBancaria = idEntidadBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getIdTipoEntidadBancaria() {
        return idTipoEntidadBancaria;
    }

    public void setIdTipoEntidadBancaria(Integer idTipoEntidadBancaria) {
        this.idTipoEntidadBancaria = idTipoEntidadBancaria;
    }
}
