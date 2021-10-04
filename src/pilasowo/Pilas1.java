package pilasowo;

public class Pilas1 {

    private Nodo1 Tope;

    public Pilas1() {
        this.Tope = null;
    }
    public Nodo1 getTope() {
        return Tope;
    }

    public void setTope(Nodo1 Tope) {
        this.Tope = Tope;
    }

    public boolean estaVacia() {
        if (this.Tope == null) {
            return true;
        } else {
            return false;
        }
    }

    //INSERTAINICIO
    Nodo1 Push(informacion1 x) {
        Nodo1 aux;
        if (this.Empty()) {
            this.Tope = new Nodo1(x);
        } else {
            aux = new Nodo1(x);
            aux.sigte = this.Tope;
            this.Tope = aux;

        }
        return Tope;
    }

    void imprime() {
        if (!this.Empty()) {
            Nodo1 aux;
            aux = this.Tope;
            while (aux != null) {
                System.out.println("|" + aux.elem.getX() + "|");
                System.out.println(" ↓");
                aux = aux.sigte;
            }
            System.out.println("//");
        } else {
            System.out.println("Lista Vacia");
        }
    }

    void Pop() {
        Nodo1 aux = this.Tope;
        if (this.Empty()) {
            this.Tope = null;
        } else if (this.Tope.sigte == null) {
            this.Tope = null;
        } else {
            this.Tope = this.Tope.sigte;
            aux = null;
        }
    }

    boolean Empty() {
        if (this.Tope == null) {
            return true;
        } else {
            return false;
        }
    }

    int Peek() {
        int valor = -1;
        if (!Empty()) {
            return this.Tope.elem.getInformacion();
        }
        return valor;
    }

    void Desencripta(Pilas1 p) {
        Pilas1 Paux = new Pilas1();
        int aux1 = 0;
        while (!(p.estaVacia())) {
            int e = p.Peek();
            System.out.println("");
            System.out.println(e);
            aux1 = e;
            informacion1 aux = new informacion1(aux1);
            Paux.Push(aux);
            p.Pop();
        }
        int aux = 0;
        while (!(Paux.estaVacia())) {
            int e = Paux.Peek();
            aux = e;
            informacion1 aux2 = new informacion1(aux);
            Paux.Push(aux2);
            Paux.Pop();
        }
    }
    void invertir(Pilas1 p){
     Pilas1 Paux = new Pilas1();
     int aux1 = 0;
        while (!(p.Empty())) {
            int e = p.Peek();
            System.out.println("");
            System.out.println(e);
            aux1 = e;
            informacion1 aux = new informacion1(aux1);
            Paux.Push(aux);
            p.Pop();
        }
        int aux = 0;
        while (!(Paux.Empty())) {
            int e = Paux.Peek();
            aux = e;
            informacion1 aux2 = new informacion1(aux);
            Paux.Push(aux2);
            Paux.Pop();
        }
    }
}
