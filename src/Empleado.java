//Implementamos una interface
public class Empleado implements Interface{
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;
    // No  necesita, metodo getters and setters, y constructor vacio.
    // Constructor con herencia
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    // Override al metodo calcularSalario
    public double calcularSalario() {
        if (edad > 40) {
            salario += 100000;
        }
        return salario;
    }

    @Override
    public void usuarioEmpleado() {
        System.out.println("*** Empleado ingresado:" +
         "\n Nombre: " + nombre +
         "\n Apellido: " + apellido  +
         "\n Edad: " + edad +
         "\n Salario: " + salario );
    }
}
