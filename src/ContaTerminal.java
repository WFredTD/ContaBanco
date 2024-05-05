import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner digite = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua conta bancária: ");
        String numeroConta = digite.next();

        System.out.println("Digite sua agência: ");
        String agencia = digite.next();

        System.out.println("Digite seu primeiro nome: ");
        String nomeCliente = digite.next();

        System.out.println("Digite seu saldo atual: ");
        String saldo = digite.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por ter uma conta em nosso banco. Seus dados bancários são - Agência: " + agencia + 
        ", Conta: " +  numeroConta + ", Saldo: R$" + saldo +". Seu saldo já está disponível para saque.");

        digite.close();
    }
}
