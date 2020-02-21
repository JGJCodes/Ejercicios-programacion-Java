package listas_dobles;

public class ListasDobles {

    NodoDoble Inicio, Final, Recorrer;

    public ListasDobles() {
    }

    public void InsertarInicio(int dato) {
        if (Inicio == null) {
            NodoDoble Q = new NodoDoble();
            Inicio = Final = Q;
            Q.info = dato;
        } else {
            NodoDoble Q = new NodoDoble();
            Q.ligader = Inicio;
            Inicio.ligaizq = Q;
            Inicio = Q;
            Q.info = dato;
        }
    }

    public void InsertarFinal(int dato) {
        if (Inicio == null) {
            NodoDoble Q = new NodoDoble();
            Inicio = Final = Q;
            Q.info = dato;
        } else {
            NodoDoble Q = new NodoDoble();
            Q.ligaizq = Final;
            Final.ligader = Q;
            Final = Q;
            Q.info = dato;
        }
    }

    public void InsertarAntes(int dato, int auxdato) {
        if (Inicio == null) {
            NodoDoble Q = new NodoDoble();
            Inicio = Final = Q;
            Q.info = dato;
        } else {
            if (Inicio.info == auxdato) {
                NodoDoble Q = new NodoDoble();
                Q.ligader = Inicio;
                Inicio.ligaizq = Q;
                Inicio = Q;
                Q.info = dato;
            } else {
                Recorrer = Inicio;
                while (Recorrer != null) {
                    if (Recorrer.info == auxdato) {
                        NodoDoble Q = new NodoDoble();
                        Q.ligader = Recorrer;
                        Q.ligaizq = Recorrer.ligaizq;
                        Recorrer.ligaizq = Q;
                        Recorrer = Q.ligaizq;
                        Recorrer.ligader = Q;
                        Q.info = dato;
                        break;
                    } else {
                        Recorrer = Recorrer.ligader;
                    }
                }
            }
        }
    }

    public void InsertarDespues(int dato, int auxdato) {
        if (Inicio == null) {
            NodoDoble Q = new NodoDoble();
            Inicio = Final = Q;
            Q.info = dato;
        } else {
            if (Final.info == auxdato) {
                NodoDoble Q = new NodoDoble();
                Q.ligaizq = Final;
                Final.ligader = Q;
                Final = Q;
                Q.info = dato;
            } else {
                Recorrer = Inicio;
                while (Recorrer != null) {
                    if (Recorrer.info == auxdato) {
                        NodoDoble Q = new NodoDoble();
                        Q.ligaizq = Recorrer;
                        Q.ligader = Recorrer.ligader;
                        Recorrer.ligader = Q;
                        Recorrer = Q.ligader;
                        Recorrer.ligaizq = Q;
                        Q.info = dato;
                        break;
                    } else {
                        Recorrer = Recorrer.ligader;
                    }
                }
            }
        }
    }

    public void EliminarPrimero() {
        if (Inicio == null) {
            System.out.print("La lista esta vacia\n");
        } else {
            if (Inicio == Final) {
                Inicio = Final = null;
            } else {
                Inicio = Inicio.ligader;
                Inicio.ligaizq = null;
            }
        }
    }

    public void EliminarUltimo() {
        if (Inicio == null) {
            System.out.print("La lista esta vacia\n");
        } else {
            if (Inicio == Final) {
                Inicio = Final = null;
            } else {
                Final = Final.ligaizq;
                Final.ligader = null;
            }
        }
    }

    public void Busca(int dato) {
        if (Inicio == null) {
            System.out.print("\nLa lista esta vacia");
        } else {
            Recorrer = Inicio;
            while (Recorrer != null) {
                if (Recorrer.info == dato) {
                    System.out.print("\n" + dato + " Si se encuentra en la Lista");
                    break;
                } else {
                    Recorrer = Recorrer.ligader;
                    if (Recorrer == null) {
                        System.out.print("\n" + dato + " No se encuentra en la Lista");
                    }
                }
            }
        }
    }

    public void ImprimeListaDobleIzqDer() {
        if (Inicio == null) {
            System.out.print("La lista esta vacia");
        } else {
            Recorrer = Inicio;
            while (Recorrer != null) {
                System.out.print(Recorrer.info + "  ");
                Recorrer = Recorrer.ligader;
            }
        }
    }

    public void ImprimeListaDobleDerIzq() {
        if (Inicio == null) {
            System.out.print("La lista esta vacia");
        } else {
            Recorrer = Final;
            while (Recorrer != null) {
                System.out.print(Recorrer.info + "  ");
                Recorrer = Recorrer.ligaizq;
            }
        }
    }
}