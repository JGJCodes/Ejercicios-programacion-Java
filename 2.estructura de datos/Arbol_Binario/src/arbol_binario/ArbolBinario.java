package arbol_binario;

public class ArbolBinario {

    NodoArbolBinario Raiz;
    int cantidad, altura, suma, dato;

    public ArbolBinario() {
        Raiz = null;
    }

    public void Insertar(int dato) {
        if (Existe(dato) == false) {
            NodoArbolBinario nuevo = new NodoArbolBinario();
            nuevo.info = dato;
            nuevo.ligaizq = null;
            nuevo.ligader = null;
            if (Raiz == null) {
                Raiz = nuevo;
            } else {
                NodoArbolBinario Anterior = null, Recorrer;
                Recorrer = Raiz;
                while (Recorrer != null) {
                    Anterior = Recorrer;
                    if (dato < Recorrer.info) {
                        Recorrer = Recorrer.ligaizq;
                    } else {
                        Recorrer = Recorrer.ligader;
                    }
                }
                if (dato < Anterior.info) {
                    Anterior.ligaizq = nuevo;
                } else {
                    Anterior.ligader = nuevo;
                }
            }
        }
    }

    public boolean Existe(int dato) {
        NodoArbolBinario Recorrer = Raiz;
        while (Recorrer != null) {
            if (dato == Recorrer.info) {
                return true;
            } else if (dato > Recorrer.info) {
                Recorrer = Recorrer.ligader;
            } else {
                Recorrer = Recorrer.ligaizq;
            }
        }
        return false;
    }

    public void EliminarNodo(int dato) {
        if (Raiz == null) {
            System.out.println("Arbol Vacio");
        } else {
            if (dato == Raiz.info) {
                Raiz = null;
            }
            NodoArbolBinario Anterior;
            NodoArbolBinario Recorrer = Raiz;
            while (Recorrer != null) {
                Anterior = Recorrer;
                if (dato < Recorrer.info) {
                    Recorrer = Recorrer.ligaizq;
                    if (Recorrer.info == dato) {
                        Anterior.ligaizq = null;
                        break;
                    }
                } else {
                    Recorrer = Recorrer.ligader;
                    if (Recorrer.info == dato) {
                        Anterior.ligader = null;
                        break;
                    }
                }
            }
        }
    }

    public void BuscarNodo(NodoArbolBinario Recorrer) {
        if (Raiz == null) {
            System.out.println("Arbol Vacio");
        } else {
            if (Recorrer != null) {
                if (Recorrer.info == dato) {
                    System.out.println(dato + " Si esta en el arbol");
                }
                BuscarNodo(Recorrer.ligaizq);
                BuscarNodo(Recorrer.ligader);
            }
        }
    }

    public void BuscarNodo(int dato) {
        this.dato = dato;
        BuscarNodo(Raiz);
    }

    public void SumarNodos(NodoArbolBinario Recorrer) {
        if (Recorrer != null) {
            suma = suma + Recorrer.info;
            SumarNodos(Recorrer.ligaizq);
            SumarNodos(Recorrer.ligader);
        }
    }

    public int SumarNodos() {
        suma = 0;
        SumarNodos(Raiz);
        return suma;
    }

    public void ProfundidadArbol(NodoArbolBinario Recorrer, int nivel) {
        if (Recorrer != null) {
            ProfundidadArbol(Recorrer.ligaizq, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            ProfundidadArbol(Recorrer.ligader, nivel + 1);
        }
    }

    public int ProfundidadArbol() {
        altura = 0;
        ProfundidadArbol(Raiz, 1);
        return altura;
    }

    public void CantidadNodos(NodoArbolBinario Recorrer) {
        if (Recorrer != null) {
            cantidad++;
            CantidadNodos(Recorrer.ligaizq);
            CantidadNodos(Recorrer.ligader);
        }
    }

    public int CantidadNodos() {
        cantidad = 0;
        CantidadNodos(Raiz);
        return cantidad;
    }

    public void CantidadNodosHoja(NodoArbolBinario Recorrer) {
        if (Recorrer != null) {
            if (Recorrer.ligaizq == null && Recorrer.ligader == null) {
                cantidad++;
            }
            CantidadNodosHoja(Recorrer.ligaizq);
            CantidadNodosHoja(Recorrer.ligader);
        }
    }

    public int CantidadNodosHoja() {
        cantidad = 0;
        CantidadNodosHoja(Raiz);
        return cantidad;
    }

    public void ImprimePreorden(NodoArbolBinario Recorrer) {
        if (Recorrer != null) {
            System.out.print(Recorrer.info + " ");
            ImprimePreorden(Recorrer.ligaizq);
            ImprimePreorden(Recorrer.ligader);
        }
    }

    public void ImprimePreorden() {
        ImprimePreorden(Raiz);
    }

    public void ImprimirInorden(NodoArbolBinario Recorrer) {
        if (Recorrer != null) {
            ImprimirInorden(Recorrer.ligaizq);
            System.out.print(Recorrer.info + " ");
            ImprimirInorden(Recorrer.ligader);
        }
    }

    public void ImprimirInorden() {
        ImprimirInorden(Raiz);
    }

    public void ImprimirPostorden(NodoArbolBinario Recorrer) {
        if (Recorrer != null) {
            ImprimirPostorden(Recorrer.ligaizq);
            ImprimirPostorden(Recorrer.ligader);
            System.out.print(Recorrer.info + " ");
        }
    }

    public void ImprimirPostorden() {
        ImprimirPostorden(Raiz);
    }
}