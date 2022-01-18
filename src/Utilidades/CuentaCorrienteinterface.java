package Utilidades;

public interface CuentaCorrienteinterface {

	/**
	 * El usuario introduce el nombre
	 * @param nom Asigna el nombre
	 */
	void asignarNombre(String nom);

	/**
	 * El programa obtiene el nombre introducido por el usuario
	 * @return Devuelve el nombre
	 */
	String getNombre();

	/**
	 * El programa devuelve el saldo que tiene la cuenta
	 * @return Devuelve el saldo
	 */
	double getSaldo();

	/**
	 * El usuario introduce la cantidad que quiere ingresar y comprueba que esa cantidad pueda ser ingresada
	 * @param cantidad Asigna la cantidad a ingresar
	 * @throws Exception Comprueba que la cantidad no sea negativa
	 */
	void ingresar(double cantidad) throws Exception;

	/**
	 * El usuario introduce la cantidad que quiere retirar y comprueba que esa cantidad pueda ser retirada de la cuenta
	 * @param cantidad Asigna la cantidad a retirar
	 * @throws Exception Comprueba que la cuenta tenga el dinero que quiere retirar
	 */
	void retirar(double cantidad) throws Exception;

	/**
	 * @return Devuelve la cuenta
	 */
	String getCuenta();

	/**
	 * El programa obtiene las operaciones que se han realizado
	 * @param cuenta Comprueba los cambios en la cuenta
	 */
	void setCuenta(String cuenta);

	/**
	 * El programa hace los cambios según las operaciones que se han realizado
	 * @param saldo Comprueba los cambios en el saldo
	 */
	void setSaldo(double saldo);

	/**
	 * @return Devuelve el tipo de interés
	 */
	double getTipoInteres();

	/**
	 * Una vez el programa cambia los datos por las operaciones realizadas anteriormente se actualiza la cuenta 
	 * con su nuevo saldo y todos los posibles cambios
	 * @param tipoInteres Nos informa de el dinero que tenemos en cuenta después de realizar las operaciones
	 */
	void setTipoInteres(double tipoInteres);

	void setNombre(String nombre);

}