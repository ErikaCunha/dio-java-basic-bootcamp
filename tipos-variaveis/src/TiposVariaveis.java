public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, turma!");
        byte idade = 37;
        short ano = 2025;
        int cep = 13495426; //se começar com zero talvez seja necessário alterar o tipo para String.
        long cpf = 3467481269L; //mesma exceção da int. Também precisa ter o "L" ao final.
        float pi = 3.14F; //precisa ter o "F" ao final.
        double salario = 6875.33;
        String nome = "Erika Cunha";
        char sexo = 'F';
        boolean doadorOrgao = false;

    System.out.println(idade);
    System.out.println(ano);
    System.out.println(cep);
    System.out.println(cpf);
    System.out.println(pi);
    System.out.println(salario);
    System.out.println(nome);
    }
}
