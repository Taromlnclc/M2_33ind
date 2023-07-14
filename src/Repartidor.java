public class Repartidor extends Empleado{
    private final String dispoHoraria;
    // No  necesita, metodo getters and setters, y constructor vacio.
    // Constructor con herencia
    public Repartidor(String nombre, String apellido, int edad, double salario, String dispoHoraria) {
        super(nombre, apellido, edad, salario);
        this.dispoHoraria = dispoHoraria;
    }
    // Override al metodo calcularSalario
    @Override
    public double calcularSalario() {
        if (edad < 30) {
            salario += 15000;
        }
        return super.calcularSalario();
    }
    @Override
    public void usuarioEmpleado() {
        super.usuarioEmpleado();
        System.out.println(" Horario disponible: " + dispoHoraria);
        System.out.println(" Tipo: Repartidor");
    }
}
