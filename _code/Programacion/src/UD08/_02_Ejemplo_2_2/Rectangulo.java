package UD08._02_Ejemplo_2_2;

class Rectangulo {

    private Punto vertice1;
    private Punto vertice2;

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

    /*
     * Así no!
     *
     *public Punto obtenerVertice1mal() {
     *    return vertice1;
     *}
     *
     *public Punto obtenerVertice2mal() {
     *    return vertice2;
     *}  
     */
    
    //Mejor de este modo
    public Punto obtenerVertice1() {
        // Creación de un nuevo punto extrayendo sus atributos
        double x, y;
        Punto p;
        x = this.vertice1.getX();
        y = this.vertice1.getY();
        p = new Punto(x, y);
        return p;
    }

    //O mejor así:
    public Punto obtenerVertice2() {
        // Utilizando el constructor copia de Punto (si es que está definido)
        //Punto p;
        //p = new Punto(this.vertice2); // Uso del constructor copia
        //return p;

        //o más corto:
        return new Punto(this.vertice2);
    }

    public Rectangulo(Punto vertice1, Punto vertice2) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
    }

    public static void main(String[] args) {
        Punto puntoA = new Punto(0, 0);
        Punto puntoB = new Punto(5, 5);

        Rectangulo rectA = new Rectangulo(puntoA, puntoB);
        System.out.println("Perímetro del rectanculo A: " + rectA.CalcularPerimetro());//20

        puntoA.setX(4);
        puntoA.setY(4);

        Rectangulo rectB = new Rectangulo(puntoA, puntoB);
        System.out.println("Creo un nuevo rectangulo, pero cambia el Perímetro del anterior");
        System.out.println("Perímetro del rectanculo A: " + rectA.CalcularPerimetro());//20
        System.out.println("Perímetro del rectanculo B: " + rectB.CalcularPerimetro());//4

    }
}
