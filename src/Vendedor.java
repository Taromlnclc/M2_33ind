public class Vendedor extends Empleado{
    private final String fechaInicio;
    // No  necesita, metodo getters and setters, y constructor vacio.
    // Constructor con herencia
    public Vendedor(String nombre, String apellido, int edad, double salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }
    // Override al metodo calcularSalario
    @Override
    public double calcularSalario() {
        salario += 50000;
        return super.calcularSalario();
    }
    @Override
    public void usuarioEmpleado() {
        super.usuarioEmpleado();
        System.out.println(" Fecha Inicio: " + fechaInicio);
        System.out.println(" Tipo: Vendedor");
    }
}
