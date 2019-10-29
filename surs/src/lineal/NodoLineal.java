package lineal;

import estructurasNoLineales.NodoNArio;

public class NodoLineal {
	
	 	public NodoNArio valor;
	 	public NodoLineal siguiente;

	    public NodoLineal(NodoNArio valor) {
	        this.valor = valor;
	        this.siguiente = null;
	    }

	    // toString() retorna el valor del nodo.
	    @Override
	    public String toString() {
	        return this.valor.toString();
	    }
}
