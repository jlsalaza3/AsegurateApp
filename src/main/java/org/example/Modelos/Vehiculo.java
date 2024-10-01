package org.example.Modelos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String anio;
    private String color;
    private String numeroVin;
    private String placa;
    private String tipoVehiculo;
    private String uso;
    private String nombrePropietario;
    private String numeroIdentificacionPropietario;
    private String fechaInicioPoliza;
    private String fechaFinPoliza;
    private String companiaAseguradora;
    private String numeroPoliza;
    private String cobertura;
    private String estado;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String anio, String color, String numeroVin, String placa, String tipoVehiculo, String uso, String nombrePropietario, String numeroIdentificacionPropietario, String fechaInicioPoliza, String fechaFinPoliza, String companiaAseguradora, String numeroPoliza, String cobertura, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.numeroVin = numeroVin;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.uso = uso;
        this.nombrePropietario = nombrePropietario;
        this.numeroIdentificacionPropietario = numeroIdentificacionPropietario;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaFinPoliza = fechaFinPoliza;
        this.companiaAseguradora = companiaAseguradora;
        this.numeroPoliza = numeroPoliza;
        this.cobertura = cobertura;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroVin() {
        return numeroVin;
    }

    public void setNumeroVin(String numeroVin) {
        this.numeroVin = numeroVin;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getNumeroIdentificacionPropietario() {
        return numeroIdentificacionPropietario;
    }

    public void setNumeroIdentificacionPropietario(String numeroIdentificacionPropietario) {
        this.numeroIdentificacionPropietario = numeroIdentificacionPropietario;
    }

    public String getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(String fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public String getFechaFinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechaFinPoliza(String fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public String getCompaniaAseguradora() {
        return companiaAseguradora;
    }

    public void setCompaniaAseguradora(String companiaAseguradora) {
        this.companiaAseguradora = companiaAseguradora;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", color='" + color + '\'' +
                ", numeroVin='" + numeroVin + '\'' +
                ", placa='" + placa + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", uso='" + uso + '\'' +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", numeroIdentificacionPropietario='" + numeroIdentificacionPropietario + '\'' +
                ", fechaInicioPoliza='" + fechaInicioPoliza + '\'' +
                ", fechaFinPoliza='" + fechaFinPoliza + '\'' +
                ", companiaAseguradora='" + companiaAseguradora + '\'' +
                ", numeroPoliza='" + numeroPoliza + '\'' +
                ", cobertura='" + cobertura + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
