package com.joelespinozaro.calculadora.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "recomendacion")
public class Recomendacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recomendacion")
    private Integer idRecomendacion;

    @Column(name = "id_asesor_financiero")
    private Integer idAsesorFinanciero;

    @Column(name = "id_entidad_bancaria")
    private Integer idEntidadBancaria;

    @ManyToOne
    @JoinColumn(name = "id_asesor_financiero", insertable = false, updatable = false)
    private AsesorFinanciero asesorFinanciero;

    @ManyToOne
    @JoinColumn(name = "id_entidad_bancaria", insertable = false, updatable = false)
    private EntidadBancaria entidadBancaria;

    public AsesorFinanciero getAsesorFinanciero() {
        return asesorFinanciero;
    }

    public void setAsesorFinanciero(AsesorFinanciero asesorFinanciero) {
        this.asesorFinanciero = asesorFinanciero;
    }

    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public Integer getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(Integer idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public Integer getIdAsesorFinanciero() {
        return idAsesorFinanciero;
    }

    public void setIdAsesorFinanciero(Integer idAsesorFinanciero) {
        this.idAsesorFinanciero = idAsesorFinanciero;
    }

    public Integer getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    public void setIdEntidadBancaria(Integer idEntidadBancaria) {
        this.idEntidadBancaria = idEntidadBancaria;
    }
}
