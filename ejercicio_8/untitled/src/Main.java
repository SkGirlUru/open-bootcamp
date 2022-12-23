public class Main {

    public static void  main   (String[] args) {
        Persona persona = new Persona ();
        persona.setEdad("24");
        persona.setNombre("juan");
        persona.setTelefono("666 77 77 77");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());


    }



}
class Persona {
    private String edad;
    private String nombre;
    private String telefono;

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void  setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEdad(){
        return  this.edad;

    }
    public String getNombre(){
        return  this.nombre;

    }
    public String getTelefono(){
        return  this.telefono;

    }




}







