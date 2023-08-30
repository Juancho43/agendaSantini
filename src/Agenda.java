import java.util.ArrayList;
public class Agenda {
    ArrayList<Persona> contactos = new ArrayList<>();

    public void agendarContacto(Persona nuevaPersona){
        this.contactos.add(nuevaPersona);
    }
    public void buscarDni(int DNIbuscado){
        for (int i = 0; i <  contactos.size();i++){
            if (DNIbuscado == contactos.get(i).getDni()){
                System.out.println(contactos.get(i).toString());
            }else{
                System.out.println("No se encontraron registros");
            }
        }
    }
    
    public void listarContactos(){
        for (int i = 0; i< contactos.size();i++){
            System.out.println("-----------------");
            System.out.println(contactos.get(i));
        }
    }


}
