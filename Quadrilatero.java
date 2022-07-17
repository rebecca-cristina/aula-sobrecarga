package projeto.intellij.novoprojetointellij.dados.aritimeticos.conversao.metodos.sobrecarga;

public class Quadrilatero {
    public static void area(double lado) {

        double totalAreaQuadrado = lado * lado;
        System.out.println("A área do quadrado com comprimento e largura de " + lado + " m, é de: " + totalAreaQuadrado + " m².");
    }

    public static void area(double medidaComprimento, double medidaLargura) {

        double totalAreaRetangulo = medidaComprimento * medidaLargura;
        System.out.println("A área do retângulo com comprimento de " + medidaComprimento + " m, e largura de " + medidaLargura + " m, é de: " + totalAreaRetangulo + " m².");

    }

    public static void area(double baseMenor, double baseMaior, double altura) {

        double totalAreaTrapezio = ((baseMenor + baseMaior) * altura) / 2;

        System.out.println("Um trapézio com base menor de " + baseMenor + " cm, base maior de " + baseMaior + " cm, e altura de " + altura + " cm, possui uma área de: " + totalAreaTrapezio + " cm².");
        }
    public static void area(float diagonalMaior, float diagonalMenor) {

        System.out.println("A área do losango com diagonal maior de " + diagonalMaior + " cm, e diagonal menor de " + diagonalMenor + " cm, é de: " + ((diagonalMaior * diagonalMenor) / 2) + " cm².");

    }

    }

