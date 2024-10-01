package org.example.Modelos;

public class Beneficiario {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String estadoCivil;
    private String ocupacion;
    private String nacionalidad;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String telefono;
    private Integer valorMaximo;
    private String numeroPoliza;
    private String tipoPoliza;
    private boolean tieneOtrasAseguradoras;

    public Beneficiario() {
    }

    public Beneficiario(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String estadoCivil, String ocupacion, String nacionalidad, String direccion, String ciudad, String departamento, String telefono, Integer valorMaximo, String numeroPoliza, String tipoPoliza, boolean tieneOtrasAseguradoras) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.telefono = telefono;
        this.valorMaximo = valorMaximo;
        this.numeroPoliza = numeroPoliza;
        this.tipoPoliza = tipoPoliza;
        this.tieneOtrasAseguradoras = tieneOtrasAseguradoras;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(Integer valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public boolean isTieneOtrasAseguradoras() {
        return tieneOtrasAseguradoras;
    }

    public void setTieneOtrasAseguradoras(boolean tieneOtrasAseguradoras) {
        this.tieneOtrasAseguradoras = tieneOtrasAseguradoras;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", valorMaximo=" + valorMaximo +
                ", numeroPoliza='" + numeroPoliza + '\'' +
                ", tipoPoliza='" + tipoPoliza + '\'' +
                ", tieneOtrasAseguradoras=" + tieneOtrasAseguradoras +
                '}';
    }
}
