import java.util.Scanner;

public class MainAreaVolumePerimetro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o tipo de calculo a ser efetuado:");
        System.out.println("[1] - Área");
        System.out.println("[2] - Volume");
        System.out.println("[3] - Perímetro");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1: Area.opcaoArea(); break;
            case 2: Volume.opcaoVolume(); break;
            case 3: break;
            default: System.out.println("O objeto selecionado não existe"); break;
        }
    }
}
