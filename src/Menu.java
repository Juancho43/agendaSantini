public class Menu {
    private boolean salir = false;
    private int opcion = 0;
    private Consola c = new Consola();
    private Agenda a = new Agenda();
    public void Menu(){
        while (!this.salir) {
            System.out.println("Menú");
            System.out.println("1) Agendar persona");
            System.out.println("2) Buscar persona por DNI");
            System.out.println("3) Listar todas las pesonas");
            System.out.println("4) Cerrar");
            opcion = c.leerInt("Ingrese una opción:");
            seleccionarOpcion(this.opcion);
        }
    }
    public void seleccionarOpcion(int opcion){
        switch (opcion){
            case 1:
                this.agendarPersona();
                break;
            case 2:
                this.buscarPorDni();
                break;
            case 3:
                this.listarTodasLasPersonas();
                break;
            case 4:
                System.out.println("salir");
                this.salir = true;
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    public void agendarPersona(){
        System.out.println("Agendar persona");
        String nombre = c.leerString("Ingrese nombre: ");
        String apellido = c.leerString("Ingrese apellido: ");
        int dni = c.leerInt("Ingrese dni: ");
        String fechaNacimiento = c.leerString("Ingrese fecha nacimiento: ");
        Persona contacto = new Persona(nombre,apellido,dni,fechaNacimiento);
        a.agendarContacto(contacto);
    }
    private  void buscarPorDni(){
        int dni = c.leerInt("Ingrese dni: ");
        a.buscarDni(dni);
    }
    private  void listarTodasLasPersonas(){
        a.listarContactos();

    }
}
