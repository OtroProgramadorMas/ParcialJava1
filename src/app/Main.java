// Hay dos versiones del proyecto, esta es la buena
package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public static int cantidad;

    public static void main(String[] args) {
        // Ultimos digitos: Padecimiento (1-7), Habitos(1-2), Necesidades(1-5) 
        agregarPacientes("A", 17, "M", 55.6, 1.68, 4, 2, 5);
        agregarPacientes("B", 15, "M", 56.6, 1.70, 4, 1, 2);
        agregarPacientes("C", 19, "F", 56.6, 1.89, 5, 1, 3);

        agregarPacientes("D", 17, "M", 55.6, 1.68, 5, 1, 4);
        agregarPacientes("F", 15, "M", 56.6, 1.70, 3, 1, 5);
        agregarPacientes("H", 19, "F", 56.6, 1.89, 6, 1, 1);

        agregarPacientes("D", 17, "M", 55.6, 1.68, 6, 2, 5);
        agregarPacientes("F", 15, "M", 56.6, 1.70, 1, 1, 3);
        //agregarPacientes("H", 19, "F", 56.6, 1.89, 2, 1, 4);

        String opcion = "1";
        do {

            System.out.println("Sistema de gestion de Pacientes");
            System.out.println("A. Mostrar Pacientes");
            System.out.println("B. Agregar Pacientes");
            System.out.println("C. Confirmar enfermedad de familiares graves");
            System.out.println(" - - - - - - ");
            System.out.println("1. Promedio edad de pacientes, enfermedades cardiovasculares");
            System.out.println("2. Promedio edad de pacientes, diabetes");
            System.out.println("3. enfermedades respiratorias");
            System.out.println("4. % de pacientes fumadores");
            System.out.println("5. % de pacientes con sobrepeso");
            System.out.println("");
            System.out.println("6. % de pacientes con hipertension");
            System.out.println("7. Total pacientes con enfermedades cronicas");
            System.out.println("9. Pacientes con Hospitalizacion inmediata");
            System.out.println("");
            System.out.println("10. Pacientes con seguimiento medico trimestral");
            System.out.println("11. Total de pacientes con enfermedades en familiares");
            System.out.println("13. % de pacientes que realizan actividad fisica");
            System.out.println("14. % de pacientes con dieta especifica");
            System.out.println("");
            System.out.println("15. Pacientes con medicacion continua");
            System.out.println("17. Total de pacientes que requiren cirugia");
            System.out.println("18. Pacientes con alergias graves");
            System.out.println("0. Salir");
            opcion = sc.next();
            System.out.println("- - - - - - - - - - -");
            sc.nextLine();
            switch (opcion) {
                case "0":
                    System.out.println("\u001B[31mHa salido del ejercicio");
                    break;
                case "A":
                    mostrarPacientes(listaPacientes);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "B":
                    System.out.println("Sistema para agregar nuevos pacientes");
                    System.out.println(" Ingrese el nombre del paciente:");
                    String newName = sc.nextLine();
                    System.out.println(" Ingrese la edad del paciente:");
                    int edad = sc.nextInt();
                    System.out.println("Ingrese el genero del paciente (M/F)");
                    String genero = sc.next();
                    if (!"M".equals(genero) && !"F".equals(genero)) {
                        System.out.println("\u001B[Debe ingresar uno de los dos generos");
                        break;
                    }
                    System.out.println("Ingrese el peso:");
                    double peso = sc.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    double altura = sc.nextDouble();

                    System.out.println("Ingrese el numero de los siguiente padecimietos");
                    System.out.println("1. enfermedades cardiovasculares");
                    System.out.println("2. diabetes");
                    System.out.println("3. enfermedades respiratorias");
                    System.out.println("4. sobrepeso");
                    System.out.println("5. hipertension");
                    System.out.println("6. enfermedades cronicas");
                    System.out.println("7. ninguna");
                    int opcionPadecimiento = sc.nextInt();
                    System.out.println("");
                    System.out.println(". . . . . . . . . . .");
                    System.out.println("Ingrese el numero del habito que realiza ");
                    System.out.println("1. Fumar");
                    System.out.println("2. Actividad Fisica");
                    System.out.println("3. Dieta Vegana");
                    System.out.println("5. Ingesta de Multivitaminicos");
                    int opcionHabitos = sc.nextInt();
                    System.out.println("Ingrese el numero de la necesidad especial");
                    System.out.println("1. Hospitalizacion inmediata");
                    System.out.println("2. Seguimiento medico trimestral");
                    System.out.println("3. Dieta especifica");
                    System.out.println("4. Medicacion continua");
                    System.out.println("5. cirugia");
                    System.out.println("6. Ninguno");
                    int opcionNecesidad = sc.nextInt();
                    /*
                    System.out.println("Ingrese SI o NO, ¿algun familiar tiene enfermedades graves?");
                    String agregarPadecimientoF = sc.next();
                    if (agregarPadecimientoF != "SI" || agregarPadecimientoF != "NO") {
                        break;
                    }
                    if (agregarPadecimientoF == "SI") {
                        
                    }*/
                    if (true == agregarPacientes(genero, edad, genero, peso, altura, opcionPadecimiento, opcionHabitos, opcionNecesidad)) {
                        System.out.println("Paciente Agregado Exitosamente");
                    } else {
                        System.out.println("No se pudo agregar al paciente");
                    }

                    break;
                case "C":
                    System.out.println("Ingrese el nombre del paciente");
                    String name = sc.nextLine();
                    BuscarConfirmar(name);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "1":
                    PromedioEdad("enfermedades cardiovasculares");
                    System.out.println("");
                    System.out.println("");
                    break;
                case "2":
                    PromedioEdad("diabetes");
                    System.out.println("");
                    System.out.println("");
                    break;
                case "3":
                    PromedioEdad("enfermedades respiratorias");
                    System.out.println("");
                    System.out.println("");
                    break;
                case "4":
                    Porcentaje("Fumar", 2);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "5":
                    Porcentaje("sobrepeso", 1);
                    System.out.println("");
                    System.out.println("");
                    break;

                case "6":
                    Porcentaje("hipertension", 1);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "7":
                    Contar("enfermedades cronicas", 1);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "9":
                    BuscarNecesidad("Hospitalizacion inmediata");
                    System.out.println("");
                    System.out.println("");
                    break;
                case "10":
                    BuscarNecesidad("Seguimiento medico trimestral");
                    System.out.println("");
                    System.out.println("");

                case "11":
                    Contar("enfermedades familiares", 2);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "13":
                    Porcentaje("Actividad Fisica", 2);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "14":
                    Porcentaje("Actividad Fisica", 3);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "15":
                    Contar("Medicacion continua",3);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "17":
                    Contar("Cirugia", 3);
                    System.out.println("");
                    System.out.println("");
                    break;
                case "18":
                    Contar("alergias graves",1);
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != "0");
    }

    private static void mostrarPacientes(ArrayList<Paciente> listPacientes) {
        System.out.println("Lista de Pacientes: ");
        for (Paciente paciente : listPacientes) {
            System.out.println(paciente);
        }
    }

    private static boolean agregarPacientes(
            String nombre, int edad, String genero, double peso, double altura,
            int opcionPadecimiento,
            int opcionHabitos, int opcionNecesidad) {

        boolean resultado = false;
        Paciente newPaciente = new Paciente(nombre, edad, genero, peso, altura);

        newPaciente.asignarNombrePadecimiento(opcionPadecimiento);
        newPaciente.asignarHabitosDeVida(opcionHabitos);
        newPaciente.asignarNecesiadesEspeciales(opcionNecesidad);

        listaPacientes.add(newPaciente);
        return resultado = true;
    }

    private static void BuscarConfirmar(String Nombre) {
        for (Paciente paciente : listaPacientes) {
            if (paciente.getNombre().replaceAll("//s", " ").equalsIgnoreCase(Nombre)) {
                paciente.asignarEnfermedadFamilia();
                System.out.println("Estado actualizado");
                return;
            }
        }
        System.out.println("Estado no actualizado");
    }

    // 9, 10, 15 y 18
    public static void BuscarNecesidad(String Condicion) {
        System.out.println("Pacientes " + Condicion + ": ");
        for (Paciente Paciente : listaPacientes) {
            if (Paciente.getNecesidadesEspeciales().replaceAll("//s", " ").equalsIgnoreCase(Condicion)) {
                System.out.println(" * " + Paciente.getNombre());
            }
        }

    }

    // 1, 2, 3 
    //Solo enfermedades
    public static void PromedioEdad(String condicion) {
        int contador = 0;
        int edades = 1;
        for (Paciente paciente : listaPacientes) {
            if (paciente.getPadecimiento().equalsIgnoreCase(condicion)) {
                contador = contador + 1;
                edades = paciente.getEdad() + edades;
            }
        }

        if (contador > 0) {
            int promedio = edades / contador;
            System.out.println("El promedio de edad, de pacientes con " + condicion + " es: " + promedio);
        } else {
            System.out.println("No hay pacientes con dicha condicion");
        }

    }

    // 4, 5, 6
    public static void Porcentaje(String condicion, int opcion) {
        int contador = 0;
        int cantidad = 0;

        // Padecimiento
        if (opcion == 1) {
            for (Paciente Paciente : listaPacientes) {
                if (Paciente.getPadecimiento().replaceAll("//s", " ").equalsIgnoreCase(condicion)) {
                    cantidad = cantidad + 1;
                }
                contador = contador + 1;
            }

        } else if (opcion == 2) {
            for (Paciente Paciente : listaPacientes) {
                if (Paciente.getHabitosDeVida().replaceAll("//s", " ").equalsIgnoreCase(condicion)) {
                    cantidad = cantidad + 1;
                }
                contador = contador + 1;
            }
        } else if (opcion == 3) {
            for (Paciente Paciente : listaPacientes) {
                if (Paciente.getNecesidadesEspeciales().replaceAll("//s", " ").equalsIgnoreCase(condicion)) {
                    cantidad = cantidad + 1;
                }
                contador = contador + 1;
            }
        }

        if (cantidad > 1) {

            double porcentaje = (cantidad * 100) / contador;
            System.out.println("El porcenteje de pacientes que cumplen con " + condicion + " es: " + porcentaje + "%");
        } else {
            System.out.println("No hay pacientes que cumplan la condicion");
        }

    }

    // 17, 7 y 11
    public static void Contar(String condicion, int opcion) {

        int contador = 0;
        // Enfermedades Cronicas
        if (opcion == 1) {
            for (Paciente paciente : listaPacientes) {
                if (paciente.getPadecimiento().replaceAll("//s", " ").equalsIgnoreCase(condicion)) {
                    contador += 1;
                }
            }
        }
        if (opcion == 2) {
            for (Paciente paciente : listaPacientes) {
                if (paciente.isEnfermedadFamilia() == true) {
                    contador += 1;
                }
            }
            System.out.println("El numero de pacientes que cumplen con enfermedades familiares es: " + contador);
            return;
        }

        if (opcion == 3) {
            for (Paciente paciente : listaPacientes) {
                if (paciente.getNecesidadesEspeciales().replaceAll("//s", " ").equalsIgnoreCase(condicion)) {
                    contador += 1;
                }
            }
        }

        System.out.println("El numero de pacientes que cumplen con " + condicion + " es: " + contador);

    }
}
