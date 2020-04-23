package fp.tipos.persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Persona implements Comparable<Persona>{
	
	private String dni, nombre, apellido1, apellido2;
	private LocalDate fechaNacimiento;
	
	public Persona() {
		super();
	}
	public Persona(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
	}
	public Persona(String parametros) {
		String [] splits = parametros.split(",");
		this.dni = splits[0];
		this.nombre = splits[1];
		this.apellido1 = splits[2];
		this.apellido2 = splits[3]; 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(splits[4].trim(), formatter);
		this.fechaNacimiento = fecha;
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido1 == null) ? 0 : apellido1.hashCode());
		result = prime * result + ((apellido2 == null) ? 0 : apellido2.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
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
		if (apellido1 == null) {
			if (other.apellido1 != null)
				return false;
		} else if (!apellido1.equals(other.apellido1))
			return false;
		if (apellido2 == null) {
			if (other.apellido2 != null)
				return false;
		} else if (!apellido2.equals(other.apellido2))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	@Override
	public int compareTo(Persona o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	public String getIniciales() {
		// TODO Auto-generated method stub
		return ""+getNombre().charAt(0)+getApellido1().charAt(0)+getApellido2().charAt(0);
	}
	


}
