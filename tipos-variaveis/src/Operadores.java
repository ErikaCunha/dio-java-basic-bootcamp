public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
		
//Imprimindo o numero negativo
        System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

//Operadores lógicos com condições:
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
                System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2){
                System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
    }  
}
