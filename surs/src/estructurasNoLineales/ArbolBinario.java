package estructurasNoLineales;

public class ArbolBinario {

    private NodoABinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public boolean vacio() {
        return this.raiz == null;
    }

    public void construir(NodoABinario raiz) {
        this.raiz = raiz;
    }
}
