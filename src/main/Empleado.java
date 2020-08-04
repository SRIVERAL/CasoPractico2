package main;

public class Empleado extends Persona{

	protected String idPersonal;
	protected float  sueldo;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(Empleado emp) {
		super(emp);
	}

	public Empleado(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idPersonal, float sueldo) {
		super(nombre, edad, sexo, dni, bCasado);
		this.idPersonal = idPersonal;
		this.sueldo = sueldo;
	}
	
	public String getIdPersonal() {
		return idPersonal;
	}
	
	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}
	
	public float getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Empleado [" + "idPersonal=" + idPersonal + ", sueldo=" + sueldo + "]";
	}
	
	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		super.pintar(); 
		System.out.println( "Empleado [" + "idPersonal=" + idPersonal + ", sueldo=" + sueldo + "]" );
	}
	
	
	
	
	
	
	
	
	
	
}
