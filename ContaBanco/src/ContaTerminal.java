//TO-DO: Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
               
        //Exibir as mensagens para o usuário:  "Por favor, digite o número da Agência !"
        System.out.println("Digite seu primeiro Nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua agência com o digito verificador");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o valor que gostaria de sacar");
        double saldo = scanner.nextDouble();


        //Obter pela classe Scanner, os valores digitados no terminal

        /*Exibir a mensagem final: ""Olá [Nome Cliente], 
        obrigado por criar uma conta em nosso banco, 
        sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] 
        já está disponível para saque"."
        */
        System.out.println("Olá "+nome+" "+sobrenome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+ " e seu saldo de R$"+saldo+" já está disponível para saque!");
        
    }
}
