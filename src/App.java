import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner tecla = new Scanner(System.in);

        double valorMaior = 0;
        double valores[] = new double[3];
        double valorPagar = 0;
        int codigo;
        int qntItem;

        for(int i=0; i<3;i++){
            System.out.println("1 - Cachorro Quente  - R$4.00");
            System.out.println("2 - X-Salada         - R$4.50");
            System.out.println("3 - X-Bacon          - R$5.00");
            System.out.println("4 - Torrada Simples  - R$2.00");
            System.out.println("5 - Refrigerante     - R$1.50");

            System.out.println("Insira o codigo do item que você quer: ");
            codigo = tecla.nextInt();
            tecla.nextLine();
            System.out.println("Insira a quantidade que você quer: ");
            qntItem = tecla.nextInt();

            switch (codigo) {
                case 1:
                    if(4 > valorMaior){
                        valorMaior = 4;
                    }
                    valores[i] = 4;
                    valorPagar += 4*qntItem;
                    break;
                case 2:
                    if(4.50 > valorMaior){
                        valorMaior = 4.50;
                    }
                    valores[i] = 4.50;
                    valorPagar += 4.50*qntItem;
                    break;
                case 3:
                    if(5 > valorMaior){
                        valorMaior = 5;
                    }
                    valores[i] = 5;
                    valorPagar += 5*qntItem;
                    break;
                case 4:
                    if(2 > valorMaior){
                        valorMaior = 2;
                    }
                    valores[i] = 2;
                    valorPagar += 2*qntItem;
                    break;
                case 5:
                    if(1.50 > valorMaior){
                        valorMaior = 1.50;
                    }
                    valores[i] = 1.50;
                    valorPagar += 1.50*qntItem;
                    break;
            
                default:
                    break;
            }

        }

        System.out.println("O maior valor pago foi R$"+valorMaior);
        System.out.println("Valor Total a Pagar: R$"+valorPagar);

        tecla.close();
    }
}
