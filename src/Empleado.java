public class Empleado {
private int id;
private String Nombre;
private String Apellido;
private String Departamento;
private double Salario;
public Empleado() {
}
public Empleado(int id, String nombre, String apellido, String departamento, double salario) {
    this.id = id;
    Nombre = nombre;
    Apellido = apellido;
    Departamento = departamento;
    Salario = salario;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNombre() {
    return Nombre;
}
public void setNombre(String nombre) {
    Nombre = nombre;
}
public String getApellido() {
    return Apellido;
}
public void setApellido(String apellido) {
    Apellido = apellido;
}
public String getDepartamento() {
    return Departamento;
}
public void setDepartamento(String departamento) {
    Departamento = departamento;
}
public double getSalario() {
    return Salario;
}
public void setSalario(double salario) {
    Salario = salario;
}

}

