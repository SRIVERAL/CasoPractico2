package main;

public class PruebaPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Santiago", (byte) 46, 'M', "16454758", true);
		
		String persona = p1.toString();
		
		System.out.println("--> " + persona);
		
		p1.pintar();
		
		System.out.println(" ");
		
		Empleado e2 = new Empleado("Silvia", (byte) 42, 'F', "67017273", true, "1234", 877000);
		
		String empleado = e2.toString();
		
		System.out.println("--> " + empleado);
		
		e2.pintar();
		

	}

}
