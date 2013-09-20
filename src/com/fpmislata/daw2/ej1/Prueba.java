package com.fpmislata.daw2.ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Prueba {

    public static void main(String[] args) {
        Map<String,Persona> mapPersonas = new HashMap<String,Persona>();
        List<Persona> personas = new ArrayList<Persona>();
        Persona persona1 = new Persona();

        persona1.setDni("53758419J");
        persona1.setNombre("Dani");
        persona1.setPrimerApellido("Rodriguez");
        persona1.setSexo(Sexo.HOMBRE);

        personas.add(persona1);

        Persona persona2 = new Persona();

        persona2.setDni("55555555E");
        persona2.setNombre("Esme");
        persona2.setPrimerApellido("Corral");
        persona2.setSexo(Sexo.MUJER);

        personas.add(persona2);

        Persona persona3 = new Persona();

        persona3.setDni("54444444M");
        persona3.setNombre("Alicia");
        persona3.setPrimerApellido("Lopez");
        persona3.setSexo(Sexo.MUJER);

        personas.add(persona3);

        /*System.out.println(personas.size());
        System.out.println("Introduce un DNI: ");
        Scanner sc = new Scanner(System.in);*/

        mapPersonas.put(persona3.getDni(),persona3);
        mapPersonas.put(persona1.getDni(),persona1);
        mapPersonas.put(persona2.getDni(),persona2);
        /*Persona personaBuscada = mapPersonas.get(sc.nextLine());*/
        
        Set<String> dnis = mapPersonas.keySet();
        
        for(String dni:dnis){
            Persona personaBuscada = mapPersonas.get(dni);
            System.out.println("Nombre: "+personaBuscada.nombreCompleto());
        } 
    }
}
