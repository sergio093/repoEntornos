package Utilidades;
/**
 * Este código hace la función de un cajero, en el cual puedes ingresar , retirar o finalizar 
 * dependiendo la operación que elijas realizar
 * 
 * @author Sergio
 * @version 1.0
 * @since 28/11/2021
 */
public class CuentaCorriente implements CuentaCorrienteinterface {
	private static final int ZERO = 0;
	/**
	 * Definimos el nombre 
	 */
	protected String nombre;
	/**
	 * Definimos la cuenta
	 */
	private String cuenta;
	/**
	 * Definimos el saldo
	 */
	private double saldo;
	/**
	 * Definimos el tipo de interés
	 */
	private double tipoInteres;
/**
 * Se introducen los valores String (nombre y cuenta) y los valores double (saldo y tipoInterés)
 */
	public CuentaCorriente() {
	}
/**
 * Se establece un nombre a los String y los double para que se interpreten de esa manera en el código
 * 
 * @param nom representa String nombre
 * @param cue representa String cuenta
 * @param sal representa double saldo
 * @param tipo representa double tipo
 */
	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}
/**
 * El usuario introduce el nombre
 * @param nom Asigna el nombre
 */
	@Override
	public void asignarNombre(String nom) {
		nombre = nom;
	}
/**
 * El programa obtiene el nombre introducido por el usuario
 * @return Devuelve el nombre
 */
	@Override
	public String getNombre() {
		return nombre;
	}
/**
 * El programa devuelve el saldo que tiene la cuenta
 * @return Devuelve el saldo
 */
	@Override
	public double getSaldo() {
		return saldo;
	}
/**
 * El usuario introduce la cantidad que quiere ingresar y comprueba que esa cantidad pueda ser ingresada
 * @param cantidad Asigna la cantidad a ingresar
 * @throws Exception Comprueba que la cantidad no sea negativa
 */
	@Override
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
/**
 * El usuario introduce la cantidad que quiere retirar y comprueba que esa cantidad pueda ser retirada de la cuenta
 * @param cantidad Asigna la cantidad a retirar
 * @throws Exception Comprueba que la cuenta tenga el dinero que quiere retirar
 */
	@Override
	public void retirar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
/**
 * @return Devuelve la cuenta
 */
	@Override
	public String getCuenta() {
		return cuenta;
	}
/**
 * El programa obtiene las operaciones que se han realizado
 * @param cuenta Comprueba los cambios en la cuenta
 */
	@Override
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * El programa hace los cambios según las operaciones que se han realizado
 * @param saldo Comprueba los cambios en el saldo
 */
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * @return Devuelve el tipo de interés
 */
	@Override
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * Una vez el programa cambia los datos por las operaciones realizadas anteriormente se actualiza la cuenta 
 * con su nuevo saldo y todos los posibles cambios
 * @param tipoInteres Nos informa de el dinero que tenemos en cuenta después de realizar las operaciones
 */
	@Override
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
public static int getZero() {
	return ZERO;
}
@Override
public void setNombre(String nombre) {
	this.nombre = nombre;
}
}
