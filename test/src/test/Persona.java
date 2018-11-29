package test;
import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;
    
    public Persona() 
    {
        this.nombre = " ";
        this.edad = 0;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;    
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;    
    }
    public void print()
    {
    	boolean esMayor;
    	esMayor = this.esMayor();
        System.out.print("\nNombre: "+this.nombre+" - Edad : "+this.edad);
        System.out.print(" - Es mayor de edad: "+esMayor);
    }
    public boolean esMayor()
    {	
    	if(this.edad>18)
    		{
    			return true;
    		}
    	return false;
    }
    public static Persona getMayor(Persona personaUno,Persona personaDos)
    {
    	if(personaUno.edad>personaDos.edad)
    	{
    		return personaUno;
    	}
    	else
    		{
    			return personaDos;
    		}
    }
    public static void main(String[] args)
    {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona auxPersona = new Persona();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		p1.nombre = teclado.next();
		System.out.println("Ingrese la edad: ");
		p1.edad = teclado.nextInt();
		System.out.println("Ingrese el nombre: ");
		p2.nombre = teclado.next();
		System.out.println("Ingrese la edad: ");
		p2.edad = teclado.nextInt();
		p1.print();
		p2.print();
		auxPersona = getMayor(p1, p2);
		System.out.print("\nLa persona con mas edad es: "+auxPersona.nombre);
		teclado.close();
	}   
}