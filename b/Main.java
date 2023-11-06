package b;

import b.Desarrollador;
import b.Iniciativa;
import b.IniciativaFactory;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static List<Desarrollador> employeeList = new ArrayList<>();
    public static void main(String[] args) {
        IniciativaFactory employeeFactory = new IniciativaFactory();
        employeeList = employeeFactory.getAllDesarrolladores();
//TODO
//1. Enumere todas las iniciativas distintas de manera descente.
        IniciativaFactory iniciativaFactory = new IniciativaFactory();

        List<Desarrollador> desarrolladores = iniciativaFactory.getAllDesarrolladores();

List<Iniciativa> todaslasIniciativas = desarrolladores.stream()
        .flatMap(desarrollador -> desarrollador.getIniciativas().stream())
        .distinct().collect(Collectors.toList());

todaslasIniciativas.sort((ini1 ,ini2 )->ini2.getNombre().compareTo(ini1.getNombre()));
for(Iniciativa iniciativa : todaslasIniciativas){
    System.out.println(iniciativa.getNombre());
}
        System.out.println("<<<<<<<<<<<Esta es la 2nda pregunta>>>>>>>>>");

//2. Imprima el nombre completo de cualquier desarrollador cuyo nombre comience con "A".
        List<String> Desarrollador= Arrays.asList("Bethy Alvarez", "Ana Castillo" ,"Pablo Castro", " Julisa Vivanco", "Anabel Requena", "Marco Serrano","Erick Taquiri", "Ronald Baltazar", "Diego Sanchez"," Carmen Calle");
        Desarrollador.stream().filter(nombre->nombre.startsWith("A")).forEach(System.out::println);

//3. Liste todos los desarrolladores que se unieron en el año 2023 (el año se extraerá del código del desarrollador, es decir, los primeros 4 caracteres)
        System.out.println("<<<<<<<<<<<<Esta es la 3ra pregunta>>>>>>>>>>>>");

        int añoActual = 2023;
        System.out.println("Desarrolladores que se unieron en el año 2023:");
        for (Desarrollador desarrollador : employeeList) {

            int añoUnión = Integer.parseInt(desarrollador.getCodigo().substring(0, 4));
            if (añoUnión == añoActual) {
                System.out.println(desarrollador.getNombres() + " se unió en el año " + añoActual);
            }
        }
//4. Ordene los desarrolladores según el nombre; y luego ordene por salario.
        employeeList = employeeFactory.getAllDesarrolladores();
        System.out.println("<<<<<<<<<<<<Esta es la 4ta pregunta>>>>>>>>>>>>");

        for (Desarrollador desarrollador : employeeList) {
            System.out.println("Nombre: " + desarrollador.getNombres() + " " + desarrollador.getApellidos());
            System.out.println("Salario: " + desarrollador.getSalario());
            System.out.println("----");
        }

        //5. Imprima los nombres de todos los desarrolladores con el tercer salario más alto. (Generalícelo para el enésimo salario más alto).
        /*List<Desarrollador> copiaDesarrolladores = new ArrayList<>(employeeList);


        Collections.sort(copiaDesarrolladores, Comparator.comparingInt(Desarrollador::getSalario).reversed());


        int nSalarioMasAlto = 3;


        if (nSalarioMasAlto <= copiaDesarrolladores.size()) {

            int salarioDeseado = copiaDesarrolladores.get(nSalarioMasAlto - 1).getSalario();


            System.out.println("Desarrolladores con el " + nSalarioMasAlto + "° salario más alto (" + salarioDeseado + "):");
            for (Desarrollador desarrollador : employeeList) {
                if (desarrollador.getSalario() == salarioDeseado) {
                    System.out.println(desarrollador.getNombres());
                }
            }
        } else {
            System.out.println("No hay suficientes desarrolladores para obtener el " + nSalarioMasAlto + "° salario más alto.");
        }*/
//6. Imprimir salario mínimo.	//6. Imprimir salario mínimo.
        int salarioMinimo = Integer.MAX_VALUE;

        for (Desarrollador desarrollador : employeeList) {
            if (desarrollador.getSalario() < salarioMinimo) {
                salarioMinimo = desarrollador.getSalario();
            }
        }
//7. Imprima la lista de todos los desarrolladores con salario mínimo.	//7. Imprima la lista de todos los desarrolladores con salario mínimo.
        salarioMinimo = Integer.MAX_VALUE;

        for (Desarrollador desarrollador : employeeList) {
            if (desarrollador.getSalario() < salarioMinimo) {
                salarioMinimo = desarrollador.getSalario();
            }
        }
        System.out.println("Desarrolladores con salario mínimo (" + salarioMinimo + "):");
        for (Desarrollador desarrollador : employeeList) {
            if (desarrollador.getSalario() == salarioMinimo) {
                System.out.println(desarrollador);
            }
        }


//8. Liste a todas las personas que trabajan en más de 2 proyectos.	//8. Liste a todas las personas que trabajan en más de 2 proyectos.
        Map<Desarrollador, Integer> proyectosPorDesarrollador = new HashMap<>();


        for (Desarrollador desarrollador : employeeList) {
            proyectosPorDesarrollador.put(desarrollador, desarrollador.getIniciativas().size());
        }


        System.out.println("Personas que trabajan en más de 2 proyectos:");
        for (Map.Entry<Desarrollador, Integer> entry : proyectosPorDesarrollador.entrySet()) {
            if (entry.getValue() > 2) {
                System.out.println(entry.getKey().getNombres() + " trabaja en " + entry.getValue() + " proyectos.");
            }
        }


//9. Conteo del total de laptops asignadas a los desarrolladores.	//9. Conteo del total de laptops asignadas a los desarrolladores.
        int totalLaptopsAsignadas = 0;
        for (Desarrollador desarrollador : employeeList) {
            totalLaptopsAsignadas += desarrollador.getTotalLaptopsAsignados();
        }
        System.out.println("Total de laptops asignadas a los desarrolladores: " + totalLaptopsAsignadas);
//10. Recuento de todas las iniciativas con Luis Carrillo Lopez.
        long contadorIniciativasLuisCarrilloLopez = employeeList.stream()
                .flatMap(desarrollador -> desarrollador.getIniciativas().stream())
                .filter(iniciativa -> iniciativa.getNombreProjectManager().equals("Luis Carrillo Lopez"))
                .count();
        System.out.println("Número de iniciativas con Luis Carrillo Lopez: " + contadorIniciativasLuisCarrilloLopez);

//11. Lista de todas las personas que trabajan con Luis Carrillo Lopez.
        String nombreLuisito = "Luis Carrillo Lopez";
        List<Desarrollador> personasQueTrabajanConLuisCarrillo= employeeList.stream()
                .filter(desarrollador -> desarrollador.getIniciativas().stream()
                        .anyMatch(iniciativa -> iniciativa.getNombreProjectManager().equals(nombreLuisito)))
                .toList();
        System.out.println("Personas que trabajan con Luis Carrillo Lopez:");
        personasQueTrabajanConLuisCarrillo.forEach(desarrollador -> System.out.println(desarrollador.getNombres()));

//12. Cree un mapa basado en estos datos, el key debe ser el año de incorporación y el valor debe ser la lista de todos los desarrolladores que se incorporaron en ese año en particular.

        List<Desarrollador> desarrolladors = new IniciativaFactory().getAllDesarrolladores();
        Map<Integer, List<Desarrollador>> desarrolladoresPorAño = desarrolladores.stream()
                .collect(Collectors.groupingBy(d -> Integer.parseInt(d.getCodigo().substring(0, 4))));

        desarrolladoresPorAño.forEach((año, listaDesarrolladores) -> {
            System.out.println("Año: " + año);
            listaDesarrolladores.forEach(desarrollador -> System.out.println("  - " + desarrollador.getNombres() + " " + desarrollador.getApellidos()));
        });

//14. Cree un mapa basado en estos datos, el key debe ser el año deincorporación y el valor debe ser el recuento de personas que se unieron en ese añoen particular.
        Map<Integer, Long> conteoPorAño = desarrolladores.stream()
                .collect(Collectors.groupingBy(d -> Integer.parseInt(d.getCodigo().substring(0, 4)), Collectors.counting()));

        conteoPorAño.forEach((anio, cantidad) -> {
            System.out.println("Año: " + anio + ", Cantidad: " + cantidad);
        });
    }
}