public class Persona {
    private int Edad, Telefono;
    private String Nombre;
    public Persona() {



}



    public Persona(int edad, int telefono, String nombre) {
        Edad = edad;
        Telefono = telefono;
        Nombre = nombre;

    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

}

