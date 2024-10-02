package org.example;

import org.example.Modelos.*;

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
        System.out.println("ingrese  marca vehiculo asegurado:");
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


        System.out.println("detalles del vehiculo asegurado "+vehiculo);

        Vehiculo vehiculo1=new Vehiculo("toyota","prado","2024","gris","33456234","FGH987","campero","particular","camilo diaz","3473419","24 febrero 2024","24 febrero 2025","suramericana","777777","completa","nuevo");

        System.out.println("detalles del vehiculo asegurado "+vehiculo1);

        // Accidente

        Accidente accidente = new Accidente();
        System.out.println("ingrese  numero de poliza del vehiculo accidentado:");
        accidente.setNumeroPoliza(leerteclado.nextLine());

        System.out.println("ingrese  fecha accidente");
        accidente.setFechaAccidente(leerteclado.nextLine());

        System.out.println("ingrese  hora accidente:");
        accidente.setHoraAccidente(leerteclado.nextLine());

        System.out.println("ingrese  lugar accidente:");
        accidente.setLugarAccidente(leerteclado.nextLine());

        System.out.println("ingrese  descripciòn del accidente:");
        accidente.setDescripcion(leerteclado.nextLine());

        System.out.println("ingrese el tipo del accidente:");
        accidente.setTipoAccidente(leerteclado.nextLine());

        System.out.println("ingrese  los daños propios:");
        accidente.setDañosPropios(leerteclado.nextLine());

        System.out.println("ingrese  los daños a terceros:");
        accidente.setDañosTerceros(leerteclado.nextLine());

        System.out.println("ingrese  el nombre del conductor:");
        accidente.setNombreConductor(leerteclado.nextLine());

        System.out.println("ingrese  el numero de identificacion del conductor:");
        accidente.setNumeroIdentificacionConductor(leerteclado.nextLine());

        System.out.println("ingrese los testigos del accidente:");
        accidente.setTestigos(leerteclado.nextLine());

        System.out.println("ingrese el informe polocial:");
        accidente.setInformePolicial(leerteclado.nextLine());

        System.out.println("ingrese el estado del vehiculo:");
        accidente.setEstadoDelVehiculo(leerteclado.nextLine());

        System.out.println("ingrese  la reclamaciòn al seguro:");
        accidente.setReclamacion(leerteclado.nextLine());

        System.out.println("ingrese comentarios adicionales del accidente:");
        accidente.setComentariosAdicionales(leerteclado.nextLine());


        System.out.println("detalles del accidente "+accidente);

        Accidente accidente1 = new Accidente("44444","24 septiembre de 2024","8:25 am","avenida las palmas","el carro se quedó sin frenos y se choco contra la montaña","heridos y daños materiales","el vehiculo","se llevo 2 luminarias del alumbrado publico","abelardo Diaz Vasquez","98432678","julio días y javier perez","el conductor perdio el control del vehiculo al quedarse sin frenos","perdida total","se inicio el proceso de reclamación","se presto asistencia al conductor y se remolco a los patios el vehiculo");
        System.out.println("detalles del accidente "+accidente1);

        // Aseguradora

        Aseguradora aseguradora = new Aseguradora();
        System.out.println("ingrese  el nombre de la aseguradora:");
        aseguradora.setNombre(leerteclado.nextLine());

        System.out.println("ingrese  la dirección de la aseguradora:");
        aseguradora.setDireccion(leerteclado.nextLine());

        System.out.println("ingrese telefono de la aseguradora:");
        aseguradora.setTelefono(leerteclado.nextLine());

        System.out.println("ingrese  el correo electrónico de la aseguradora:");
        aseguradora.setEmail(leerteclado.nextLine());

        System.out.println("ingrese  el sitio web de la aseguradora:");
        aseguradora.setSitioWeb(leerteclado.nextLine());

        System.out.println("ingrese el número de la licencia de la aseguradora:");
        aseguradora.setNumeroLicencia(leerteclado.nextLine());

        System.out.println("ingrese  la fecha de fundación de la aseguradora:");
        aseguradora.setFechaFundacion(leerteclado.nextLine());

        System.out.println("ingrese  el pais de origen de la aseguradora:");
        aseguradora.setPais(leerteclado.nextLine());

        System.out.println("ingrese  la ciudad de origen de la aseguradora:");
        aseguradora.setCiudad(leerteclado.nextLine());

        System.out.println("ingrese  el tipo de la aseguradora (privada o pública):");
        aseguradora.setTipoAseguradora(leerteclado.nextLine());

        leerteclado.nextLine();
        System.out.println("ingrese el monto del capital social de la aseguradora:");
        aseguradora.setCapitalSocial(leerteclado.nextDouble());
        leerteclado.nextLine();

        System.out.println("ingrese el nombre del representante legal de la aseguradora:");
        aseguradora.setNombreRepresentante(leerteclado.nextLine());

        System.out.println("ingrese  el telefono del representante legal:");
        aseguradora.setTelefonoRepresentante(leerteclado.nextLine());

        System.out.println("ingrese el correo electrónico del representante legal:");
        aseguradora.setEmailRepresentante(leerteclado.nextLine());

        System.out.println("detalles de la aseguradora "+aseguradora);

        Aseguradora aseguradora1 = new Aseguradora("seguros bolivar","carrera 7 numero 134 40 piso 8","6015678970","clientes@segurosbolivar.com","www.segurosbolivar.com","789045678","08 de febrero de 1960","colombia","Bogotá","privada","vehiculos,hogar,empresarial y gobierno",1000000000,"camilo fuentes","6013452167","camilofuentes@segurosbolivar.com");

        System.out.println("detalles de la aseguradora "+aseguradora1);

        //beneficiario

        Beneficiario beneficiario = new Beneficiario();

        System.out.println("ingrese  Primer nombre del beneficiario:");
        beneficiario.setPrimerNombre(leerteclado.nextLine());

        System.out.println("ingrese  Segundo nombre del beneficiario:");
        beneficiario.setSegundoNombre(leerteclado.nextLine());

        System.out.println("ingrese  primer apellido del beneficiario:");
        beneficiario.setPrimerApellido(leerteclado.nextLine());

        System.out.println("ingrese  Segundo apellido del beneficiario:");
        beneficiario.setSegundoApellido(leerteclado.nextLine());

        System.out.println("ingrese  estado civil del beneficiario:");
        beneficiario.setEstadoCivil(leerteclado.nextLine());

        System.out.println("ingrese  ocupacion del beneficiario:");
        beneficiario.setOcupacion(leerteclado.nextLine());

        System.out.println("ingrese  nacionalidad del beneficiario:");
        beneficiario.setNacionalidad(leerteclado.nextLine());

        System.out.println("ingrese  direccion del beneficiario:");
        beneficiario.setDireccion(leerteclado.nextLine());

        System.out.println("ingrese  ciudad del beneficiario:");
        beneficiario.setCiudad(leerteclado.nextLine());

        System.out.println("ingrese  departamento del beneficiario:");
        beneficiario.setDepartamento(leerteclado.nextLine());

        System.out.println("ingrese  telefono del beneficiario:");
        beneficiario.setTelefono(leerteclado.nextLine());

        leerteclado.nextLine();

        System.out.println("ingrese el valor maximo a pagar al beneficiario:");
        beneficiario.setValorMaximo(leerteclado.nextInt());

        leerteclado.nextLine();

        System.out.println("ingrese  numero poliza del beneficiario:");
        beneficiario.setNumeroPoliza(leerteclado.nextLine());

        System.out.println("ingrese  tipo poliza del beneficiario:");
        beneficiario.setTipoPoliza(leerteclado.nextLine());

        leerteclado.nextLine();

        System.out.println("el beneficiario tiene otras aseguradoras true o false:");
        beneficiario.setTieneOtrasAseguradoras(leerteclado.nextBoolean());

        leerteclado.nextLine();


        System.out.println("detalles del beneficiario "+beneficiario);

        Beneficiario beneficiario1 = new Beneficiario("camila","francisca","perez","henao","casada","ingeniera","colombiana","calle 20 sur 49 a 34","envigado","antioquia","3114567890",80000000,"21304567","vehiculo",true);

        System.out.println("detalles del benefifiario "+beneficiario1);














    }

}