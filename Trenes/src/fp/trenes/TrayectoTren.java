package fp.trenes;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TrayectoTren implements Comparable<TrayectoTren>, TrayectoTrenInterfaz{

	private String codigo, nombre;
	private List<String> estaciones;
	private List<LocalTime> horasSalida, horasLlegada;
	private TipoTren tipo;
	public LocalTime horaSalida;
	public LocalTime horaLlegada;
	public Duration duracionTrayecto;
	

	

	public TrayectoTren(String codigo, String nombre, List<String> estaciones
			, TipoTren tipo, LocalTime horaLlegada, LocalTime horaSalida, List<LocalTime> horasLlegada, List<LocalTime> horasSalida) {
	super();
	//begin checkers
	this.checkCodigo(codigo);
	this.checkHoraLlegadaUltimaEstacion(horasLlegada);
	this.checkHoraSalidaPrimeraEstacion(horasSalida);
	this.checkHoraSalidaComparaEstaciones(horasSalida, horasLlegada);
	//end checkers
	
	this.codigo = codigo;
	this.nombre = nombre;
	this.estaciones = estaciones;
	this.tipo = tipo;
	horasSalida.add(horaSalida);
	horasSalida.add(null);
	horasLlegada.add(null);
	horasLlegada.add(horaLlegada);
	this.horasLlegada = horasLlegada;
	this.horasSalida = horasSalida;
	this.duracionTrayecto = Duration.between(horaLlegada, horaLlegada);
	this.horaLlegada=horaLlegada;
	this.horaSalida=horaSalida;
}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List<String> estaciones) {
		this.estaciones = estaciones;
	}

	public List<LocalTime> getHorasSalida() {
		return horasSalida;
	}

	public void setHorasSalida(List<LocalTime> horasSalida) {
		this.horasSalida = horasSalida;
	}

	public List<LocalTime> getHorasLlegada() {
		return horasLlegada;
	}

	public void setHorasLlegada(List<LocalTime> horasLlegada) {
		this.horasLlegada = horasLlegada;
	}

	public TipoTren getTipo() {
		return tipo;
	}

	public void setTipo(TipoTren tipo) {
		this.tipo = tipo;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public LocalTime getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(LocalTime horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
/**
 * Representación como cadena: El nombre del trayecto, seguido de un guion, el tipo de tren, seguido del
código del tren entre paréntesis, y después, por cada estación, el nombre de la estación, un tabulador, la
hora de llegada a la estación, un tabulador y la hora de salida; para la de origen la hora de llegada se dejará
en blanco, así como la hora de salida en la de destino. Por ejemplo:
Sevilla-Madrid-AV_CITY (02471)
SEVILLA-SANTA JUSTA 07:00
CORDOBA 07:45 07:50
...
MADRID-PUERTA DE ATOCHA 10:02

 */
	



	@Override
	public int compareTo(TrayectoTren t) {
		int numIgualdad = 0;
		int result = this.getNombre().toLowerCase().compareTo(t.getNombre().toLowerCase());
		if (result==numIgualdad) {
			result = this.getHoraSalida().compareTo(t.horaSalida);
		}
		if (result==numIgualdad) {
			result = this.getCodigo().compareTo(t.getCodigo());
		}
		
		return result;
	}
	/*
	 * Representación como cadena: El nombre del trayecto, 
	 * seguido de un guion, el tipo de tren, seguido del código
	 *  del tren entre paréntesis, y después, por cada estación, 
	 *  el nombre de la estación, un tabulador, la hora de llegada a la estación,
	 *   un tabulador y la hora de salida; para la de origen la hora de 
	 * llegada se dejará en blanco, así como la hora de salida en la de destino. Por ejemplo: 
	 */
	@Override
public String toString() {
	String cabecera = getNombre()+"-"+getTipo()+"("+getCodigo()+")\n";
	String stationsHours = "";
	String horasLlegadas = "";
	String horasSalidas = "";
	for (int i = 0; i < getEstaciones().size()-1; i++) {
		stationsHours += estaciones.get(i)+"--";
		if (getHorasLlegada().size()-1>=i) {
			stationsHours+=getHorasLlegada().get(i).toString()+"--";
		}else {
			stationsHours += "---";
		}
		if (getHorasSalida().size()-1>=i) {
			stationsHours+=getHorasSalida().get(i).toString()+"\n";
		}else {
			stationsHours = "---";
		}
	}
	return cabecera+stationsHours;
}



	@Override
	public LocalTime getHoraSalida(String estacion) {
		// TODO Auto-generated method stub
		int falloBusqueda = -1;
		
		int indiceEstacionBuscada = getEstaciones().indexOf(estacion);
		LocalTime result = null;
		int indiceUltimaEstacion = getEstaciones().size()-1;
		if (indiceEstacionBuscada!=falloBusqueda || indiceEstacionBuscada!=indiceUltimaEstacion) {
			result = getHorasSalida().get(indiceEstacionBuscada);
		}
		return result;
	}
	@Override
	public LocalTime getHoraLlegada(String estacion) {
		int falloBusqueda = -1;
		int indiceEstacionBuscada = getEstaciones().indexOf(estacion);
		int indicePrimeraEstacion = 0;
		return (indiceEstacionBuscada!=falloBusqueda 
				|| indiceEstacionBuscada != indicePrimeraEstacion)?
						getHorasLlegada().
						get(indiceEstacionBuscada):null;
	}
	
	@Override
	public void anadirEstacionIntermedia(int posicion, String estacion, LocalTime horaLlegada, LocalTime horaSalida) {
		// TODO Auto-generated method stub
		checkPosicionEstacion(posicion);
		estaciones.add(posicion, estacion);
		horasLlegada.add(posicion, horaLlegada);
		horasSalida.add(posicion, horaSalida);
	}
	

	@Override
	public void eliminarEstacionIntermedia(String estacion) {
		Integer indiceEstacion = estaciones.indexOf(estacion);
		Integer primeraEstacion = 0;
		Integer indiceNoExiste = -1;
		Integer ultimaEstacion = estaciones.size()-1;
		if(indiceEstacion == primeraEstacion 
				|| indiceEstacion == ultimaEstacion
				|| indiceEstacion==indiceNoExiste) {
			throw new IllegalArgumentException();
		}
		estaciones.remove(indiceEstacion);
		horasLlegada.remove(indiceEstacion);
		horasSalida.remove(indiceEstacion);
		
	}


	
	@Override
	public void checkCodigo(String codigo) {
		// TODO Auto-generated method stub
		if(codigo.length()!=5) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void checkHoraSalidaPrimeraEstacion(List<LocalTime> horasSalidas) {
		// TODO Auto-generated method stub
		if(horasSalidas.get(0)==null) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void checkHoraLlegadaUltimaEstacion(List<LocalTime> horasLlegadas) {
		// TODO Auto-generated method stub
		
		if(horasLlegadas.get(horasLlegadas.size()-1)==null) {
			throw new IllegalArgumentException();
		}
	}



	@Override
	public void checkHoraSalidaComparaEstaciones(List<LocalTime> horasSalidas, List<LocalTime> horasLlegadas) {
		// TODO Auto-generated method stub
		if (horasSalidas.get(0).isAfter(horasLlegadas.get(horasLlegadas.size()-1))) {
			throw new IllegalArgumentException();
		}
	}



	@Override
	public void checkPosicionEstacion(int posicion) {
		// TODO Auto-generated method stub
		int estacionMinima = 1;
		int estacionMaxima = estaciones.size()-1;
		if (posicion<estacionMaxima || posicion> estacionMaxima) {
			throw new IllegalArgumentException();
		}
	}



	@Override
	public boolean horaSalidaAnteriorLlegada(LocalTime horaSalida, LocalTime horallegada) {
		// TODO Auto-generated method stub
		return horaSalida.isBefore(horallegada);
	}	
	
	//implements methods from interface	
}
