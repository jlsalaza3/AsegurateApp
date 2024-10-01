package org.example.Modelos;

public class Accidente {
    private String numeroPoliza;
    private String fechaAccidente;
    private String horaAccidente;
    private String lugarAccidente;
    private String descripcion;
    private String tipoAccidente;
    private String dañosPropios;
    private String dañosTerceros;
    private String nombreConductor;
    private String numeroIdentificacionConductor;
    private String testigos;
    private String informePolicial;
    private String estadoDelVehiculo;
    private String reclamacion;
    private String comentariosAdicionales;

    public Accidente() {
    }

    public Accidente(String numeroPoliza, String fechaAccidente, String horaAccidente, String lugarAccidente, String descripcion, String tipoAccidente, String dañosPropios, String dañosTerceros, String nombreConductor, String numeroIdentificacionConductor, String testigos, String informePolicial, String estadoDelVehiculo, String reclamacion, String comentariosAdicionales) {
        this.numeroPoliza = numeroPoliza;
        this.fechaAccidente = fechaAccidente;
        this.horaAccidente = horaAccidente;
        this.lugarAccidente = lugarAccidente;
        this.descripcion = descripcion;
        this.tipoAccidente = tipoAccidente;
        this.dañosPropios = dañosPropios;
        this.dañosTerceros = dañosTerceros;
        this.nombreConductor = nombreConductor;
        this.numeroIdentificacionConductor = numeroIdentificacionConductor;
        this.testigos = testigos;
        this.informePolicial = informePolicial;
        this.estadoDelVehiculo = estadoDelVehiculo;
        this.reclamacion = reclamacion;
        this.comentariosAdicionales = comentariosAdicionales;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(String fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(String horaAccidente) {
        this.horaAccidente = horaAccidente;
    }

    public String getLugarAccidente() {
        return lugarAccidente;
    }

    public void setLugarAccidente(String lugarAccidente) {
        this.lugarAccidente = lugarAccidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getDañosPropios() {
        return dañosPropios;
    }

    public void setDañosPropios(String dañosPropios) {
        this.dañosPropios = dañosPropios;
    }

    public String getDañosTerceros() {
        return dañosTerceros;
    }

    public void setDañosTerceros(String dañosTerceros) {
        this.dañosTerceros = dañosTerceros;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getNumeroIdentificacionConductor() {
        return numeroIdentificacionConductor;
    }

    public void setNumeroIdentificacionConductor(String numeroIdentificacionConductor) {
        this.numeroIdentificacionConductor = numeroIdentificacionConductor;
    }

    public String getTestigos() {
        return testigos;
    }

    public void setTestigos(String testigos) {
        this.testigos = testigos;
    }

    public String getInformePolicial() {
        return informePolicial;
    }

    public void setInformePolicial(String informePolicial) {
        this.informePolicial = informePolicial;
    }

    public String getEstadoDelVehiculo() {
        return estadoDelVehiculo;
    }

    public void setEstadoDelVehiculo(String estadoDelVehiculo) {
        this.estadoDelVehiculo = estadoDelVehiculo;
    }

    public String getReclamacion() {
        return reclamacion;
    }

    public void setReclamacion(String reclamacion) {
        this.reclamacion = reclamacion;
    }

    public String getComentariosAdicionales() {
        return comentariosAdicionales;
    }

    public void setComentariosAdicionales(String comentariosAdicionales) {
        this.comentariosAdicionales = comentariosAdicionales;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "numeroPoliza='" + numeroPoliza + '\'' +
                ", fechaAccidente='" + fechaAccidente + '\'' +
                ", horaAccidente='" + horaAccidente + '\'' +
                ", lugarAccidente='" + lugarAccidente + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", dañosPropios='" + dañosPropios + '\'' +
                ", dañosTerceros='" + dañosTerceros + '\'' +
                ", nombreConductor='" + nombreConductor + '\'' +
                ", numeroIdentificacionConductor='" + numeroIdentificacionConductor + '\'' +
                ", testigos='" + testigos + '\'' +
                ", informePolicial='" + informePolicial + '\'' +
                ", estadoDelVehiculo='" + estadoDelVehiculo + '\'' +
                ", reclamacion='" + reclamacion + '\'' +
                ", comentariosAdicionales='" + comentariosAdicionales + '\'' +
                '}';
    }
}
