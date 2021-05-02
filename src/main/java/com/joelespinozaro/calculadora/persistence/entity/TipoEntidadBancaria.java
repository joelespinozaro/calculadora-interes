package com.joelespinozaro.calculadora.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_entidad_bancaria")
public class TipoEntidadBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_entidad_bancaria")
    private Integer idTipoEntidadBancaria;

    private String descripcion;

    @OneToMany(mappedBy = "tipoEntidadBancaria")
    private List<EntidadBancaria> entidadesBancarias;

    public List<EntidadBancaria> getEntidadesBancarias() {
        return entidadesBancarias;
    }

    public void setEntidadesBancarias(List<EntidadBancaria> entidadesBancarias) {
        this.entidadesBancarias = entidadesBancarias;
    }

    public Integer getIdTipoEntidadBancaria() {
        return idTipoEntidadBancaria;
    }

    public void setIdTipoEntidadBancaria(Integer idTipoEntidadBancaria) {
        this.idTipoEntidadBancaria = idTipoEntidadBancaria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
