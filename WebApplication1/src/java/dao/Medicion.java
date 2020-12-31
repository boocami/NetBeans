/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Medicion {
    private int idMedicion;
    private Date fecha;
    private double estatura,peso,medidaCintura, PorcentajeGrasaFormula, imc, indiceGrasaInstrumento;
    private String foto;
    private String personausuario, personaentrenador;

    public Medicion() {
    }

    public Medicion(int idMedicion, Date fecha, double estatura, double peso, double medidaCintura, double PorcentajeGrasaFormula, double imc, double indiceGrasaInstrumento, String foto, String personausuario, String personaentrenador) {
        this.idMedicion = idMedicion;
        this.fecha = fecha;
        this.estatura = estatura;
        this.peso = peso;
        this.medidaCintura = medidaCintura;
        this.PorcentajeGrasaFormula = PorcentajeGrasaFormula;
        this.imc = imc;
        this.indiceGrasaInstrumento = indiceGrasaInstrumento;
        this.foto = foto;
        this.personausuario = personausuario;
        this.personaentrenador = personaentrenador;
    }

    public int getIdMedicion() {
        return idMedicion;
    }

    public void setIdMedicion(int idMedicion) {
        this.idMedicion = idMedicion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getPorcentajeGrasaFormula() {
        return PorcentajeGrasaFormula;
    }

    public void setPorcentajeGrasaFormula(double PorcentajeGrasaFormula) {
        this.PorcentajeGrasaFormula = PorcentajeGrasaFormula;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getIndiceGrasaInstrumento() {
        return indiceGrasaInstrumento;
    }

    public void setIndiceGrasaInstrumento(double indiceGrasaInstrumento) {
        this.indiceGrasaInstrumento = indiceGrasaInstrumento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPersonausuario() {
        return personausuario;
    }

    public void setPersonausuario(String personausuario) {
        this.personausuario = personausuario;
    }

    public String getPersonaentrenador() {
        return personaentrenador;
    }

    public void setPersonaentrenador(String personaentrenador) {
        this.personaentrenador = personaentrenador;
    }
    
    
}
