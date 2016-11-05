package com.hans.indicadores.model;

import java.util.ArrayList;

/**
 * Created by Felipe (04-11-2016).
 */
/*
{"version":"1.4.0","autor":"mindicador.cl","fecha":"2016-11-05T11:00:00.000Z","uf":{"codigo":"uf","nombre":"Unidad de fomento (UF)","unidad_medida":"Pesos","fecha":"2016-11-05T04:00:00.000Z","valor":26269.98},"ivp":{"codigo":"ivp","nombre":"Indice de valor promedio (IVP)","unidad_medida":"Pesos","fecha":"2016-11-05T04:00:00.000Z","valor":27319.1},"dolar":{"codigo":"dolar","nombre":"Dólar observado","unidad_medida":"Pesos","fecha":"2016-11-04T04:00:00.000Z","valor":650.72},"dolar_intercambio":{"codigo":"dolar_intercambio","nombre":"Dólar acuerdo","unidad_medida":"Pesos","fecha":"2014-11-13T05:00:00.000Z","valor":758.87},"euro":{"codigo":"euro","nombre":"Euro","unidad_medida":"Pesos","fecha":"2016-11-04T04:00:00.000Z","valor":722.62},"ipc":{"codigo":"ipc","nombre":"Indice de Precios al Consumidor (IPC)","unidad_medida":"Porcentaje","fecha":"2016-09-01T04:00:00.000Z","valor":0.2},"utm":{"codigo":"utm","nombre":"Unidad Tributaria Mensual (UTM)","unidad_medida":"Pesos","fecha":"2016-11-01T04:00:00.000Z","valor":46091},"imacec":{"codigo":"imacec","nombre":"Imacec","unidad_medida":"Porcentaje","fecha":"2016-08-01T04:00:00.000Z","valor":2.5},"tpm":{"codigo":"tpm","nombre":"Tasa Política Monetaria (TPM)","unidad_medida":"Porcentaje","fecha":"2016-11-04T04:00:00.000Z","valor":3.5},"libra_cobre":{"codigo":"libra_cobre","nombre":"Libra de Cobre","unidad_medida":"Dólar","fecha":"2016-11-04T04:00:00.000Z","valor":2.23},"tasa_desempleo":{"codigo":"tasa_desempleo","nombre":"Tasa de desempleo","unidad_medida":"Porcentaje","fecha":"2016-09-01T04:00:00.000Z","valor":6.8}}
 */
public class IndicadoresResponse {

    private String version;
    private String autor;
    private String fecha;
    private Indicador uf;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Indicador getUf() {
        return uf;
    }

    public void setUf(Indicador uf) {
        this.uf = uf;
    }

    /*private ArrayList<Indicador> uf;

    public ArrayList<Indicador> getUf() {
        return uf;
    }

    public void setUf(ArrayList<Indicador> uf) {
        this.uf = uf;
    }*/
}
