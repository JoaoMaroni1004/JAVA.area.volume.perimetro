import java.util.Scanner;

public class Area {
    static Scanner scan = new Scanner(System.in);
    public static void opcaoArea(){
        System.out.println("Escolha a forma geometrica para calcular a área");
        System.out.println("[1].Quadrado");
        System.out.println("[2].Retangulo");
        System.out.println("[3].Circunferência");
        System.out.println("[4].Losango");
        System.out.println("[5].Triangulo");
        System.out.println("[6].Trapézio");
        System.out.print("Opção: ");

        int areaOpcao = scan.nextInt();
        switch (areaOpcao){
            case 1: calculaAreaQuadrado(); break;
            case 2: calcularAreaRetangulo(); break;
            case 3: calcularAreaCircunferencia(); break;
            case 4: calcularAreaLosango(); break;
            case 5: calcularAreaTriangulo(); break;
            case 6: calcularAreaTrapezio(); ;break;
            default: System.out.println("Não é possivel calcular"); break;
        }
    }
    public static void calculaAreaQuadrado(){
        System.out.print("Digite o valor dos lados do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2.0);
        System.out.println("A área do quadrado é: " + area + " M2");
    }
    public static void calcularAreaRetangulo(){
        System.out.print("Digite o valor do lado A do retangulo: ");
        double ladoA = scan.nextDouble();
        System.out.print("Digite o valor do lado B do retangulo: ");
        double ladoB = scan.nextDouble();
        double area = ladoA * ladoB;
        System.out.println("A área do retangulo é: " + area + " M2");
    }
    public static void calcularAreaCircunferencia(){
        double pi = 3.14;
        System.out.print("Digite o valor do raio: ");
        double raio = scan.nextDouble();
        double area = (2 * pi) * Math.pow(raio, 2.0);
        System.out.println("A área da circunferência é: " + area + " M2");
    }
    public static void calcularAreaLosango(){
        System.out.print("Digite o valor da diagonal do losango: ");
        double diagonal = scan.nextDouble();
        double area = Math.pow(diagonal, 2.0) / 2;
        System.out.println("A área do losango é: " + area + " M2");
    }
    public static void calcularAreaTriangulo(){
        System.out.print("Digite o valor da base do triangulo: ");
        double base = scan.nextDouble();
        System.out.print("Digite o valor da altura do triangulo: ");
        double altura = scan.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triangulo é: " + area + " M2");
    }
    public static void calcularAreaTrapezio(){
        System.out.println("Em construção...");
    }
}
