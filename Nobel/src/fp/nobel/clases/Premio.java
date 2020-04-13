package fp.nobel.clases;

public class Premio {
	private Integer anyo;
	private Genero categoria;
	private String nombre;
	private String apellidos;
	private Integer anyoNacimiento;
	
	public Premio() {
		super();
	}

	public Premio(Integer anyo, Genero categoria, String nombre, String apellidos, Integer anyoNacimiento) {
		super();
		this.anyo = anyo;
		this.categoria = categoria;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anyoNacimiento = anyoNacimiento;
	}

	public Integer getAnyo() {
		return anyo;
	}

	public Genero getCategoria() {
		return categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Integer getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}

	public void setCategoria(Genero categoria) {
		this.categoria = categoria;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setAnyoNacimiento(Integer anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anyo == null) ? 0 : anyo.hashCode());
		result = prime * result + ((anyoNacimiento == null) ? 0 : anyoNacimiento.hashCode());
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
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
		Premio other = (Premio) obj;
		if (anyo == null) {
			if (other.anyo != null)
				return false;
		} else if (!anyo.equals(other.anyo))
			return false;
		if (anyoNacimiento == null) {
			if (other.anyoNacimiento != null)
				return false;
		} else if (!anyoNacimiento.equals(other.anyoNacimiento))
			return false;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
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
		return "Premio [anyo=" + anyo + ", categoria=" + categoria + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", anyoNacimiento=" + anyoNacimiento + "]";
	}
	
	
	
	
	
}
