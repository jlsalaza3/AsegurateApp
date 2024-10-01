package org.example;

import org.example.Modelos.Asegurado;
import org.example.Modelos.Vehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerteclado= new Scanner(System.in);

        Asegurado asegurado = new Asegurado();
        System.out.println("ingrese  Primer nombre:");
        asegurado.setPrimerNombre(leerteclado.nextLine());

        System.out.println("ingrese  Segundo nombre:");
        asegurado.setSegundoNombre(leerteclado.nextLine());

        System.out.println("ingrese  primer apellido:");
        asegurado.setPrimerApellido(leerteclado.nextLine());

        System.out.println("ingrese  Segundo apellido:");
        asegurado.setSegundoApellido(leerteclado.nextLine());

        System.out.println("ingrese  estado civil:");
        asegurado.setEstadoCivil(leerteclado.nextLine());

        System.out.println("ingrese  ocupacion:");
        asegurado.setOcupacion(leerteclado.nextLine());

        System.out.println("ingrese  nacionalidad:");
        asegurado.setNacionalidad(leerteclado.nextLine());

        System.out.println("ingrese  direccion:");
        asegurado.setDireccion(leerteclado.nextLine());

        System.out.println("ingrese  ciudad:");
        asegurado.setCiudad(leerteclado.nextLine());

        System.out.println("ingrese  departamento:");
        asegurado.setDepartamento(leerteclado.nextLine());

        System.out.println("ingrese  telefono:");
        asegurado.setTelefono(leerteclado.nextLine());

        leerteclado.nextLine();

        System.out.println("tiene descuento true o false:");
        asegurado.setTieneDescuento(leerteclado.nextBoolean());

        leerteclado.nextLine();

        System.out.println("ingrese  numero poliza:");
        asegurado.setNumeroPoliza(leerteclado.nextLine());

        System.out.println("ingrese  tipo poliza:");
        asegurado.setTipoPoliza(leerteclado.nextLine());

        leerteclado.nextLine();

        System.out.println("tiene otras aseguradoras true o false:");
        asegurado.setTieneOtrasAseguradoras(leerteclado.nextBoolean());

        leerteclado.nextLine();


        System.out.println("detalles del asegurado"+asegurado);

        Asegurado asegurado1=new Asegurado("camilo","alberto","trujillo","gomez","soltero","administrador","colombiano","calle 20 sur","envigado","antioquia","3330894",true,"3344556","vehiculos",true);
        System.out.println("detalles del asegurado"+asegurado1);

        //  vehiculos

        Vehiculo vehiculo = new Vehiculo();
        System.out.println("ingrese  marca vehiculo:");
        vehiculo.setMarca(leerteclado.nextLine());

        System.out.println("ingrese  modelo:");
        vehiculo.setModelo(leerteclado.nextLine());

        System.out.println("ingrese  año vehiculo:");
        vehiculo.setAnio(leerteclado.nextLine());

        System.out.println("ingrese color:");
        vehiculo.setColor(leerteclado.nextLine());

        System.out.println("ingrese  numero VIN:");
        vehiculo.setNumeroVin(leerteclado.nextLine());

        System.out.println("ingrese  placa:");
        vehiculo.setPlaca(leerteclado.nextLine());

        System.out.println("ingrese  tipo vehiculo:");
        vehiculo.setTipoVehiculo(leerteclado.nextLine());

        System.out.println("ingrese  uso vehiculo:");
        vehiculo.setUso(leerteclado.nextLine());

        System.out.println("ingrese  nombre propietario:");
        vehiculo.setNombrePropietario(leerteclado.nextLine());

        System.out.println("ingrese  numero identificacion propietario:");
        vehiculo.setNumeroIdentificacionPropietario(leerteclado.nextLine());

        System.out.println("ingrese  fecha inicio poliza:");
        vehiculo.setFechaInicioPoliza(leerteclado.nextLine());


        System.out.println("ingrese fecha fin poliza:");
        vehiculo.setFechaFinPoliza(leerteclado.nextLine());


        System.out.println("ingrese  compañia aseguradora:");
        vehiculo.setCompaniaAseguradora(leerteclado.nextLine());

        System.out.println("ingrese  numero poliza:");
        vehiculo.setNumeroPoliza(leerteclado.nextLine());


        System.out.println("ingrese valor cobertura");
        vehiculo.setCobertura(leerteclado.nextLine());

        System.out.println("ingrese estado vehiculo nuevo o usado");
        vehiculo.setEstado(leerteclado.nextLine());

        leerteclado.nextLine();


        System.out.println("detalles del vehiculo asegurado"+vehiculo);

        Vehiculo vehiculo1=new Vehiculo("toyota","prado","2024","gris","33456234","FGH987","campero","particular","camilo diaz","3473419","24 febrero 2024","24 febrero 2025","suramericana","777777","completa","nuevo");

        System.out.println("detalles del vehiculo asegurado"+vehiculo1);











    }

}