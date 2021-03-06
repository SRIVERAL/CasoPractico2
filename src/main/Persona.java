package main;

public class Persona {

	protected String  nombre;
	protected byte    edad;
	protected char    sexo;
	protected String  dni;
	protected boolean bCasado;
	
	public Persona() {
		super();
	}

	public Persona(Persona persona) {
		super();
		this.nombre = persona.nombre;
		this.edad = persona.edad;
		this.sexo = persona.sexo;
		this.dni = persona.dni;
		this.bCasado = persona.bCasado;		
	}
	
	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
		this.bCasado = bCasado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isbCasado() {
		return bCasado;
	}

	public void setbCasado(boolean bCasado) {
		this.bCasado = bCasado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (bCasado != other.bCasado)
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni + ", bCasado="
				+ bCasado + "]";
	}
	
	public void pintar() {
		System.out.println("Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni + ", bCasado="
				+ bCasado + "]");
	}

}
