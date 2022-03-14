import java.util.Scanner;

public class Volume {
    static Scanner scan = new Scanner(System.in);

    public static void opcaoVolume(){
        System.out.println("Escolha a forma geometrica para calcular o volume");
        System.out.println("[1].Cubo");
        System.out.println("[2].Esfera");
        System.out.println("[3].Cilindro");
        System.out.print("Opção: ");

        int volumeOpcao = scan.nextInt();
        switch (volumeOpcao){
            case 1: calculaVolumeCubo(); break;
            default: System.out.println("Nao é possivel calcular.");
        }
    }
    public static void calculaVolumeCubo(){
        System.out.println("Digite a medidas da arestas do cubo: ");
        double aresta = scan.nextDouble();
        double volume = Math.pow(aresta, 3.0);
        System.out.println("O volume do cubo é: " + volume + " M3");
    }
}

