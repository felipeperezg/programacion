package lineal;
import estructurasNoLineales.NodoNArio;
public class ListaSimple {

    private NodoLineal primero;
    public int tama�o;

    public ListaSimple() {
        this.primero = null;
        this.tama�o = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(NodoNArio valor) {

        NodoLineal nuevo = new NodoLineal(valor);

        if (vacia()) {
            // agregamos el primer NodoLineal
            this.primero = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo NodoLineal
            NodoLineal aux = this.primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tama�o++;
    }
    
    public NodoNArio posicion (int index) {
    	if (vacia()) {
    		return null;
    	}else {
    		NodoLineal aux = this.primero;
    		for (int i=0; i<index; i++) {
    			aux=aux.siguiente;
    		}
    		return aux.valor;
    	}
    }
    
    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo NodoLineal
            NodoLineal aux = primero;
            NodoLineal NodoLinealAnterior = aux;

            while (aux.siguiente != null) {
                NodoLinealAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanz� en la lista hasta llegar al
            // �ltimo NodoLineal que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Le indico al NodoLineal anterior que no apunte m�s al NodoLineal a eliminar "aux".
                NodoLinealAnterior.siguiente = null;
            }

            // Decremento el tama�o
            this.tama�o--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            NodoLineal aux = this.primero;
            for(int i = 0; i<this.tama�o; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}