import java.util.Scanner;

public class Consola {
    private final Scanner sc;

    public Consola(){
        this.sc = new Scanner(System.in);
    }
    public String leerString(String msg){
        System.out.println(msg);
        return this.sc.next();

    }
    public int leerInt(String msg){
        System.out.println(msg);
        return this.sc.nextInt();
    }
    public Float leerFloat(String msg){
        System.out.println(msg);
        return this.sc.nextFloat();
    }
    public Boolean leerBoolean(String msg){
        System.out.println(msg);
        return this.sc.nextBoolean();
    }


}
