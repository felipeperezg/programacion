package estructurasNoLineales;

import lineal.ListaSimple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NodoABinario raiz = new NodoABinario("2");
		
		raiz.izq = new NodoABinario("7");
		raiz.der = new NodoABinario("2");
		
		raiz.izq.izq = new NodoABinario("2");
		raiz.izq.der = new NodoABinario("6");
		
		raiz.izq.der.izq = new NodoABinario("5");
		raiz.izq.der.der = new NodoABinario("11");
		
		raiz.der = new NodoABinario("5");
		raiz.der.der = new NodoABinario("9");
		raiz.der.der.izq = new NodoABinario("4");
		
		ArbolBinario arbol = new ArbolBinario();
		arbol.construir(raiz);
		
		
		NodoNArio raizN = new NodoNArio("5");
		raizN.nodos = new ListaSimple();
		raizN.nodos.agregar(new NodoNArio("7"));
		raizN.nodos.agregar(new NodoNArio("8"));
		raizN.nodos.agregar(new NodoNArio("9"));
		
		raizN.nodos.posicion(0).nodos.agregar(new NodoNArio("3"));
		raizN.nodos.posicion(0).nodos.agregar(new NodoNArio("4"));
		raizN.nodos.posicion(0).nodos.agregar(new NodoNArio("5"));
	}

}
