package Retorno;

public class main{

    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Area do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Area do trapezio: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Area do Losango: " + areaLosango);        
    }
}
