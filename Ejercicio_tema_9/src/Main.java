public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.nombre = "Maria";
        persona.edad = 34;
        persona.telefono = 654096821;


        System.out.println(persona.nombre);
        System.out.println(persona.edad);
        System.out.println(persona.telefono);



        Cliente cliente = new Cliente();

       cliente.nombre = "juan";
       cliente.edad = 34;
       cliente.telefono = 456656465;
       cliente.credito = 453;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Luis";
        trabajador.edad = 54;
        trabajador.telefono = 321565434;
        trabajador.salario = 6745;

        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);


    }


}

class Persona {
    String nombre;
    int edad;
    int telefono;

}

class Cliente extends Persona {
    int credito;

}
class Trabajador extends Persona {
    int salario;

}