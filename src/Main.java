public class Main {
    public static void main(String[] args) {
        //Creamos Empleado y 2 herencias 1 Vendedor y otra Repartidor.
        Empleado empleado = new Empleado("Paolo", "Valdivia", 41, 1100000);
        Vendedor vendedor = new Vendedor("Monze", "Valdivia", 38, 1100000, "01/01/2005");
        Repartidor repartidor = new Repartidor("Santino", "Monjes", 21, 1100000, "Noche");


        //Mostramos datos
        empleado.usuarioEmpleado();
        System.out.println(" Salario con asignacion: $" + empleado.calcularSalario() + "\n");
        vendedor.usuarioEmpleado();
        System.out.println(" Salario con asignacion: $" + vendedor.calcularSalario() + "\n");
        repartidor.usuarioEmpleado();
        System.out.println(" Salario con asignacion: $" + repartidor.calcularSalario() + "\n");
    }
}