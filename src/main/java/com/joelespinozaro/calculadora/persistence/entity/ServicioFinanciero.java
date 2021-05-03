package com.joelespinozaro.calculadora.persistence.entity;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@Table(name = "servicio_financiero")
public class ServicioFinanciero {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_servicio_financiero")
    private Integer idServicioFinanciero;

    @Column(name = "id_recomendacion")
    private Integer idRecomendacion;

    @Column(name = "id_cliente")
    private Integer idCliente;

    private Double tasa;

    private Double capital;

    private Integer periodo;

    @Formula(value = "CASE WHEN interes=1 THEN capital*power((1 + tasa/100),periodo) WHEN interes=2 THEN capital*(1 + tasa/100) END")
    private Double capitalFinal;

    @ManyToOne
    @JoinColumn(name = "id_recomendacion", insertable = false, updatable = false)
    private Recomendacion recomendacion;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    public Recomendacion getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Recomendacion recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private Double interes;


    public Integer getIdServicioFinanciero() {
        return idServicioFinanciero;
    }

    public void setIdServicioFinanciero(Integer idServicioFinanciero) {
        this.idServicioFinanciero = idServicioFinanciero;
    }

    public Integer getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(Integer idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getcapitalFinal() {
        return capitalFinal;
    }
}
