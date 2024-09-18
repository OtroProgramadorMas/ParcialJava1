package app;

public class Paciente {

    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;
    private String padecimiento;
    private String habitosDeVida;
    private String necesidadesEspeciales;
    private boolean enfermedadFamilia;

    public Paciente(String nombre, int edad, String genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        enfermedadFamilia = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public String getHabitosDeVida() {
        return habitosDeVida;
    }

    public String getNecesidadesEspeciales() {
        return necesidadesEspeciales;
    }

    public boolean isEnfermedadFamilia() {
        return enfermedadFamilia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nEdad:" + edad + " / Genero: " + genero + " / Peso: " + peso + " / Altura: " + altura
                + "\nPadecimiento: " + padecimiento
                + "\nHabitos De Vida: " + habitosDeVida
                + "\nNecesidades Especiales " + necesidadesEspeciales
                + "\nEnfermedades familiares: " + enfermedadFamilia
                + "\n. . . . . . . . . . . . . . ";
    }

    public void asignarHabitosDeVida(int opcion) {
        try {
            switch (opcion) {
                case 1 ->
                    habitosDeVida = "Fumar";
                case 2 ->
                    habitosDeVida = "Actividad Fisica";
                default ->
                    habitosDeVida = null;
            }
        } catch (Exception e) {
            System.out.println("No se pudo asignar los Habitos Saludables");
        }
    }

    public void asignarNecesiadesEspeciales(int opcion) {
        try {
            switch (opcion) {
                case 1 ->
                    necesidadesEspeciales = "Hospitalizacion inmediata";
                case 2 ->
                    necesidadesEspeciales = "Seguimiento medico trimestral";
                case 3 ->
                    necesidadesEspeciales = "Dieta especifica";
                case 4 ->
                    necesidadesEspeciales = "Medicacion continua";
                case 5 ->
                    necesidadesEspeciales = "Cirugia";
                default ->
                    necesidadesEspeciales = null;
            }
        } catch (Exception e) {
            System.out.println("No se pudo asignar la necesidades especiales");
        }

    }

    public void asignarNombrePadecimiento(int opcion) {
        try {
            switch (opcion) {
                case 1 ->
                    padecimiento = "enfermedades cardiovasculares";
                case 2 ->
                    padecimiento = "diabetes";
                case 3 ->
                    padecimiento = "enfermedades respiratorias";
                case 4 ->
                    padecimiento = "sobrepeso";
                case 5 ->
                    padecimiento = "hipertension";
                case 6 ->
                    padecimiento = "enfermedades cronicas";
                case 7 ->
                    padecimiento = "alergias graves";
                default ->
                    padecimiento = null;
            }
        } catch (Exception e) {
            System.out.println("No se puedo asignar el padecimiento");
        }
    }

    public void asignarEnfermedadFamilia() {
        if (enfermedadFamilia == false) {
            enfermedadFamilia = true;
        } else {
            System.out.println("Ya asignado");
        }
    }

}
