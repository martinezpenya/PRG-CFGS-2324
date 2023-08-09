package UD08._03_Ejemplo_2_2_1;

class Rectangulo {

    private Punto vertice1;
    private Punto vertice2;

    /*
     * Un constructor sin parámetros (para sustituir al constructor por defecto)
     * que haga que los valores iniciales de las esquinas del rectángulo sean
     * (0,0) y (1,1).
     */
    public Rectangulo() {
        this.vertice1 = new Punto(0, 0);
        this.vertice2 = new Punto(1, 1);
    }

    /*
     * Un constructor con cuatro parámetros, `x1`, `y1`, `x2`, `y2`, que cree un
     * rectángulo con los vértices (`x1`, `y1`) y (`x2`, `y2`).
     */
    public Rectangulo(double x1, double y1, double x2, double y2) {
        this.vertice1 = new Punto(x1, y1);
        this.vertice2 = new Punto(x2, y2);
    }

    /*
     * Un constructor con dos parámetros, `punto1`, `punto2`, que rellene los
     * valores iniciales de los atributos del rectángulo con los valores
     * proporcionados a través de los parámetros.
     *
     * versión 1: no recomendada public Rectangulo(Punto vertice1, Punto
     * vertice2) { this.vertice1 = vertice1; this.vertice2 = vertice2; }
     *
     * versión 2: sin constructor de copia. public Rectangulo(Punto vertice1,
     * Punto vertice2) { this.vertice1 = new Punto(vertice1.getX(),
     * vertice1.getY()); this.vertice2 = new Punto(vertice2.getX(),
     * vertice2.getY()); }
     */
    //versión 3: opción recomendada
    public Rectangulo(Punto vertice1, Punto vertice2) {
        this.vertice1 = new Punto(vertice1);
        this.vertice2 = new Punto(vertice2);
    }

    /*
     * Un constructor con dos parámetros, `base` y `altura`, que cree un
     * rectángulo donde el vértice inferior derecho esté ubicado en la posición
     * (0,0) y que tenga una base y una altura tal y como indican los dos
     * parámetros proporcionados.
     */
    public Rectangulo(double base, double altura) {
        this.vertice1 = new Punto(0, 0);
        this.vertice2 = new Punto(base, altura);
    }

    /*
     * Un constructor copia.
     */
    public Rectangulo(Rectangulo r) {
        this.vertice1 = new Punto(r.obtenerVertice1());
        this.vertice2 = new Punto(r.obtenerVertice2());
    }

    public double calcularSuperficie() {
        double area, base, altura; // Variables locales
        base = vertice2.getX() - vertice1.getX(); // Antes era x2 - x1
        altura = vertice2.getY() - vertice1.getY(); // Antes era y2 - y1
        area = base * altura;
        return area;
    }

    public double CalcularPerimetro() {
        double perimetro, base, altura; // Variables locales
        base = vertice2.getX() - vertice1.getX(); // Antes era x2 - x1
        altura = vertice2.getY() - vertice1.getY(); // Antes era y2 - y1
        perimetro = 2 * base + 2 * altura;
        return perimetro;
    }

    public Punto obtenerVertice1() {
        Punto p;
        p = new Punto(this.vertice1); // Uso del constructor copia
        return p;
    }

    public Punto obtenerVertice2() {
        Punto p;
        p = new Punto(this.vertice2); // Uso del constructor copia
        return p;
    }

    public static void main(String[] args) {
        Punto puntoA = new Punto(0, 0);
        Punto puntoB = new Punto(5, 5);

        Rectangulo rectA = new Rectangulo(puntoA, puntoB);
        System.out.println("Perímetro del rectanculo A: " + rectA.CalcularPerimetro());

        puntoA.setX(4);
        puntoA.setY(4);

        Rectangulo rectB = new Rectangulo(puntoA, puntoB);
        System.out.println("Creo un nuevo rectangulo, pero NO cambia el Perímetro del anterior");
        System.out.println("Perímetro del rectanculo A: " + rectA.CalcularPerimetro());
        System.out.println("Perímetro del rectanculo B: " + rectB.CalcularPerimetro());

    }
}
