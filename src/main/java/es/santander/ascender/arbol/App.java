package es.santander.ascender.arbol;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       // Crear árbol con 4 como raíz
       Arbol  arbol = new Arbol (4);

       // Agregar nodos
       arbol.agregarNodo(arbol.raiz, 3, true);         // 3 como hijo izquierdo de 4
       arbol.agregarNodo(arbol.raiz, 9, false);        // 9 como hijo derecho de 4

       Nodo nodo3 = arbol.raiz.izquierda;
       arbol.agregarNodo(nodo3, 1, true);             // 1 como hijo izquierdo de 3

       Nodo nodo9 = arbol.raiz.derecha;
       arbol.agregarNodo(nodo9, 8, true);             // 8 como hijo izquierdo de 9
       arbol.agregarNodo(nodo9, 12, false);           // 12 como hijo derecho de 9

       // Imprimir recorrido en orden
       System.out.print("Recorrido inorden: ");
       arbol.recorridoInorden(arbol.raiz);
   }
    }
 
