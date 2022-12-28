public class Main {
    public static void main(String[] args) {

      
       Cliente cliente = new Cliente();
       Trabajador trabajador = new Trabajador();

       cliente.nombre = "juan";
       cliente.edad = 34;
       cliente.telefono = 456656465;
       cliente.credito = 453;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

       
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
