package es.santander.ascender.arbol;

public class Arbol {
    Nodo raiz;

     // Constructor
     public Arbol(int valorRaiz) {
        this.raiz = new Nodo(valorRaiz);
    }
    // Método para agregar nodos
    public void agregarNodo(Nodo nodo, int valor, boolean esIzquierda) {
        if (esIzquierda) {
            nodo.izquierda = new Nodo(valor);
        } else {
            nodo.derecha = new Nodo(valor);
        }
    }

       // Recorrido inorden (izquierda, raíz, derecha)
       public void recorridoInorden(Nodo nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            recorridoInorden(nodo.derecha);
        }
    }
    }

