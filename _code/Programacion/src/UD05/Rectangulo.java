package UD05;

class Rectangulo {

    // Atributos de clase
    private static int numRectangulos; // Número total de rectangulos creados
    public static final String NOMBREFIGURA = "Rectángulo"; // Nombre de la clase
    public static final double PI = 3.1416; // Constante PI            

    // Atributos de objeto
    private String nombre;// Nombre del rectángulo
    public double x1, y1;// Vértice inferior izquierdo
    public double x2, y2;// Vértice superior derecho

    // Método obtenerNombre
    public String obtenerNombre() {
        return nombre;
    }

    // Método establecerNombre
    public void establecerNombre(String nom) {
        nombre = nom;
    }

    // Método CalcularSuperficie
    public double CalcularSuperficie() {
        double area, base, altura;
        // Cálculo de la base
        base = x2 - x1;
        // Cálculo de la altura
        altura = y2 - y1;
        // Cálculo del área
        area = base * altura;
        // Devolución del valor de retorno
        return area;
    }

    // Método CalcularPerimetro
    public double CalcularPerimetro() {
        double perimetro, base, altura;
        // Cálculo de la base
        base = x2 - x1;
        // Cálculo de la altura
        altura = y2 - y1;
        // Cálculo del perímetro
        perimetro = 2 * base + 2 * altura;
        // Devolución del valor de retorno
        return perimetro;
    }

    // Método desplazar
    public void desplazar(double X, double Y) {
        // Desplazamiento en el eje X
        x1 = x1 + X;
        x2 = x2 + X;
        // Desplazamiento en el eje X
        y1 = y1 + Y;
        y2 = y2 + Y;
    }

    // Método obtenerNumRectangulos
    public static int obtenerNumRectangulos() {
        return numRectangulos;
    }
    
    public static void main(String[] args) {
        Rectangulo r1, r2;
        r1 = new Rectangulo();
        r2 = new Rectangulo();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 10;
        r1.y2 = 10;
        r1.establecerNombre("rectangulo1");
        System.out.printf("PRUEBA DE USO DE LA CLASE " + Rectangulo.NOMBREFIGURA + "\n");
        System.out.printf("------------------------------------\n\n");
        System.out.printf("r1.x1: %4.2f\nr1.y1: %4.2f\n", r1.x1, r1.y1);
        System.out.printf("r1.x2: %4.2f\nr1.y2: %4.2f\n", r1.x2, r1.y2);
        System.out.printf("Perimetro: %4.2f\nSuperficie: % 4.2f\n",
                r1.CalcularPerimetro(), r1.CalcularSuperficie());
        System.out.printf("Desplazamos X=3, Y=3\n");
        r1.desplazar(3, 3);
        System.out.printf("r1.x1: %4.2f\nr1.y1: %4.2f\n", r1.x1, r1.y1);
        System.out.printf("r1.x2: %4.2f\nr1.y2: %4.2f\n", r1.x2, r1.y2);
    }
}