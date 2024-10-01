package org.example.Modelos;

public class Aseguradora {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String sitioWeb;
    private String numeroLicencia;
    private String fechaFundacion;
    private String pais;
    private String ciudad;
    private String tipoAseguradora;
    private String tiposSeguro;
    private double capitalSocial;
    private String nombreRepresentante;
    private String telefonoRepresentante;
    private String emailRepresentante;

    public Aseguradora() {
    }

    public Aseguradora(String nombre, String direccion, String telefono, String email, String sitioWeb, String numeroLicencia, String fechaFundacion, String pais, String ciudad, String tipoAseguradora, String tiposSeguro, double capitalSocial, String nombreRepresentante, String telefonoRepresentante, String emailRepresentante) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.sitioWeb = sitioWeb;
        this.numeroLicencia = numeroLicencia;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.ciudad = ciudad;
        this.tipoAseguradora = tipoAseguradora;
        this.tiposSeguro = tiposSeguro;
        this.capitalSocial = capitalSocial;
        this.nombreRepresentante = nombreRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
        this.emailRepresentante = emailRepresentante;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipoAseguradora() {
        return tipoAseguradora;
    }

    public void setTipoAseguradora(String tipoAseguradora) {
        this.tipoAseguradora = tipoAseguradora;
    }

    public String getTiposSeguro() {
        return tiposSeguro;
    }

    public void setTiposSeguro(String tiposSeguro) {
        this.tiposSeguro = tiposSeguro;
    }

    public double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getEmailRepresentante() {
        return emailRepresentante;
    }

    public void setEmailRepresentante(String emailRepresentante) {
        this.emailRepresentante = emailRepresentante;
    }

    @Override
    public String toString() {
        return "Aseguradora{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", sitioWeb='" + sitioWeb + '\'' +
                ", numeroLicencia='" + numeroLicencia + '\'' +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", tipoAseguradora='" + tipoAseguradora + '\'' +
                ", tiposSeguro='" + tiposSeguro + '\'' +
                ", capitalSocial=" + capitalSocial +
                ", nombreRepresentante='" + nombreRepresentante + '\'' +
                ", telefonoRepresentante='" + telefonoRepresentante + '\'' +
                ", emailRepresentante='" + emailRepresentante + '\'' +
                '}';
    }
}
