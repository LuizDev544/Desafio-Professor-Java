import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        // try {
        //     System.out.println("Digite um numero:");
        //     int numero = sc.nextInt();
        //     System.out.println("O numro digitado foi: " + numero);
            
        // } catch (InputMismatchException E) {
        //     // mostra o erro no gato
        //     E.printStackTrace();
        //     System.err.println("Tá errado isso aí");
        // }
        // try {
        //     int [] arr= new int[5];
        //     System.out.println(arr[3]);
           
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.err.println("luiz achou o erro: " + e.getMessage());
        // }

        // try {
        //     int resultado = 10/0;
        //     System.out.println(resultado);
            
        // } catch (Exception e) {
        //     System.out.println("O rafa achou um erro: " + e.getMessage());
        // }

        // try {
        //     String numero = "Matheus é tchola";
        //     int num = Integer.parseInt(numero);
        //     System.out.println(numero);
        // } catch (NumberFormatException e) {
        //     System.out.println("Matheus achou um erro: " + e.getMessage() );
        // }

        try {
            System.out.println("|| notas do rafa||");
            System.out.println("Informe o primeiro numero:");
            int n1 = sc.nextInt();
            System.out.println("Informe o primeiro numero:");
            int n2 = sc.nextInt();
            double resultado = n1 / n2;
        } catch (NumberFormatException e) {
            System.out.println("O erro encontrado foi: nao posso dividir letras " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("numero divido por zero");
        }
        sc.close();
    }
}
