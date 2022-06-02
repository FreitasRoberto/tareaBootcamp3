import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Persona Per=new Persona(28,687264869,"Roberto");
        System.out.println("/n--------DATOS DE LA PERSONA------"
                + "/n Edad: "+Per.getEdad()
                + "/n Telefono: "+Per.getTelefono()
                + "/n Nombre: "+Per.getNombre());

        Persona Persona = new Persona();
        Scanner Person= new Scanner(System.in);
        int Edad, Telefono;
        String Nombre;
        System.out.print("Ingrese su edad: ");
        Edad = Person.nextInt();
        Persona.setEdad(Edad);
        System.out.print("Ingrese su telefono: ");
        Telefono = Person.nextInt();
        Persona.setTelefono(Telefono);
        System.out.print("Ingrese su nombre: ");
        Nombre = Person.next();
        Persona.setNombre(Nombre);

    }

}