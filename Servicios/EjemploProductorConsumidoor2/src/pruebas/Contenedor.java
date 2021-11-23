package pruebas;

/**
 * @(#)Contenedor.java
 * 
 *                     La sincronizaci�n que permite a Productor y Consumidor
 *                     operar correctamente, es decir, la que hace que
 *                     Consumidor espere hasta que haya un dato disponible, y
 *                     que productor no genere uno nuevo hasta que haya sido
 *                     consumido est� esta clase.
 * 
 *                     La sincronizaci�n se lleva a cabo pues usando los m�todos
 *                     wait() y notify()/notifiAll().
 * 
 *                     Es importante el manejo de la bandera para que no se este
 *                     pidiendo y almacenando el tiempo simultaneamente, ya que
 *                     podr�a generar resultados inesperados.
 * 
 *                     Por medio de 'synchronized' adquiere un bloqueo en el
 *                     objeto que se ejecuta el m�todo que impide que nadie m�s
 *                     inicie la ejecuci�n en ese objeto de otro m�todo que
 *                     tambi�n est� declarado como 'synchronized'. Cuando
 *                     comienza el m�todo put() se bloquea el objeto de tal
 *                     forma que si alguien intenta invocar el m�todo get() o
 *                     put() (ambos son synchronized) quedar� en espera hasta
 *                     que el bloqueo se libere (cuando termine la ejecuci�n del
 *                     m�todo). Este mecanismo garantiza que los objetos
 *                     compartidos mantienen la consistencia.
 * 
 *                     - Es responsabilidad del programador pensar y gestionar
 *                     los bloqueos. - Los m�todos synchronized son m�s costosos
 *                     en el sentido de que adquirir y liberarlos bloqueos
 *                     consume tiempo (este es el motivo por el que no est�n
 *                     sincronizados por defecto todos los m�todos).
 **/

public class Contenedor {
	private int dato; // Contiene el valor, que se almacena con put() y se devuelve con get()
	private boolean hayDato = false; // Flag (bandera) que indica si el objeto tiene el dato o no.

	// En este m�todo put() antes de almacenar el valor en la variable dato debe
	// asegurarse que el valor anterior ha sido consumido.
	public synchronized void put(int valor) {
		while (hayDato == true) { // Si todav�a hay valor se suspende la ejecuci�n del hilo mediante el m�todo
									// wait().
			try {
				/**
				 * Se suspende el hilo indefinidamente hasta que se le env�e una 'se�al' con el
				 * m�todo notify() o notifyAll() Cuando la se�alizaci�n mediante notify() lo
				 * produce el m�todo get(), el m�todo continua, asume que el dato ya fue
				 * consumido y posteriormente...
				 **/
				wait();
			} catch (InterruptedException e) {
			}
		}
		// Almacena el valor en dato y notifica que hay un dato disponible.
		dato = valor;
		hayDato = true;
		System.out.println(Thread.currentThread().getName() + ": " + dato);
		notifyAll();
	}

	// En este m�todo get() chequea si hay un dato disponible (no lo hay si hayDato
	// es falso)
	public synchronized int get() {
		while (hayDato == false) {
			try {
				/**
				 * Si no hay dato espera hasta que le avisen. Una vez notificado desde el m�todo
				 * put(), posteriormente...
				 **/
				wait();
			} catch (InterruptedException e) {
			}
		}
		// Cambia el valor de la bandera y devuelve el valor. Pero antes, notifica que
		// el dato ya ha sido consumido y que se puede almacenar otro.
		hayDato = false;
		System.out.println(Thread.currentThread().getName() + ": " + dato);
		notifyAll();
		return dato;
	}
}