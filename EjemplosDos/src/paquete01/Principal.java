/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.*;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String DireccionEmpresa;

        double[] misnotas;
        double promedios;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        nombreEmpresa = DatoTrabajo.obtenerEmpresa();
        DireccionEmpresa = DatoTrabajo.obtenerDireccion();
        misnotas = DatoAcademico.obtenerNotas(4);
        promedios = DatoFinal.obtenerPromedio(misnotas);

        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciuadad: %s\n"
                + "Empresa: %s\n"
                + "Direccion: %s\n"
                + "Promedio: %s\n",
                nombre,
                apellidoRetornado,
                ciudad, nombreEmpresa, DireccionEmpresa,promedios);

    }

}
