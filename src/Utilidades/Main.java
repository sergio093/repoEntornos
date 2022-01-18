
package Utilidades;
 /** 
 * Este código esta unido a CuentaCorriente y es el que le da todas las instrucciones para cada situacion
 * @author Sergio
 * @version 1.0
 * @since 28/11/2021
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Esta parte del código se encarga de recoger los datos introducidos por el usuario
 */
public class Main implements Maininterface {
	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
/**
 * @param args Se establece la información de la cuenta, se introduce double saldoActual, int opcion y se le dan 
 * las intrucciones de los tres procesos que puede hacer (ingresar, retirar y finalizar) y el saldo de 
 * nuestra cuenta después de relizar las operaciones
 */
	public static void main(String[] args) {
		CuentaCorrienteinterface cuenta1;
		CuentaCorrienteinterface cuenta2;
		double saldoActual;
		int opcion = 0;
		cuenta1 = new CuentaCorriente("Juan López", "1000-2365-85-123456789", 2500, 0);
		cuenta2 = new CuentaCorriente("Pablo López", "1000-3256-58-987654321", 1600, 0); 
		visualizarDatosCuenta(cuenta1, cuenta2, "Buenos dias");
		do {
			try {
				System.out.println("MENÚ DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("¿Cuánto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("¿Cuátno desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecución");
				} else {
					System.err.println("Opción errónea");
				}
/*               switch(opcion){
                case 1:
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                    break;
                case 2:
                    System.out.println("¿Cuátno desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                    break;
                case 3:
                    System.out.println("Finalizamos la ejecución");
            }
*/
			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} while (opcion != 3);
		saldoActual = cuenta1.getSaldo();
		System.out.println("El saldo actual es: " + saldoActual);
	}
/**
 * 
 * @param cuenta1
 * @param cuenta2
 * @param mensaje
 */
public static void visualizarDatosCuenta(CuentaCorrienteinterface cuenta1, CuentaCorrienteinterface cuenta2, String mensaje) {
	System.out.println("Datos clientes");
	System.out.println(cuenta1.toString());
	System.out.println(cuenta2.toString());
}
/**
 * Esta parte del código se utiliza para actuar en el caso de que los parámetros que introduzca el usuario sean incorrectos
 * y por lo tanto que diera una resouesta errónea aunque el código funcione bien
 * 
 * @param cuenta1 , Cuenta con los datos del anterior main que va a utilizar
 * @param cantidad , cantidad que vamos a ingresar o retirar de nuestra cuenta
 * @param opcion , Se establecen las opciones que se pueden dar si se ingresa una cantidad en negativo o se retira
 *  más cantidad del saldo que tiene la cuenta
 */
	public static void operativa_cuenta(CuentaCorrienteinterface cuenta1, float cantidad, int opcion) {
		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al ingresar");
			}
		}
	}
public static BufferedReader getDato() {
	return dato;
}
public static void setDato(BufferedReader dato) {
	Main.dato = dato;
}
}