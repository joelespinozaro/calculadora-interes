package com.joelespinozaro.calculadora.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "asesor_financiero")
public class AsesorFinanciero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asesor_financiero")
    private Integer idAsesorFinanciero;

    private String nombres;

    private String telefono;

    public Integer getIdAsesorFinanciero() {
        return idAsesorFinanciero;
    }

    public void setIdAsesorFinanciero(Integer idAsesorFinanciero) {
        this.idAsesorFinanciero = idAsesorFinanciero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
