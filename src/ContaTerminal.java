import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entrada = new Scanner(System.in);

      System.out.print("Por favor digite o número da agência: ");
      int contaNumero = entrada.nextInt();

      System.out.print("Por favor digite o número da agencia: ");
      String agencia = entrada.next();
      
      entrada.nextLine();
      System.out.print("Por favor digite o nome do cliente: ");
      String nomeCliente = entrada.nextLine();

      System.out.print("Por favor informe o saldo: ");
      double saldo = entrada.nextDouble();
      
      System.out.println("\nOlá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + contaNumero+ " e seu saldo R$ " + saldo + " já está disponível para saque." );

      entrada.close();
   }
}