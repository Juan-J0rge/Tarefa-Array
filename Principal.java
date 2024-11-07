package PastaTarefas.TarefaArray;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MascFem mf = new MascFem();

        System.out.println("Digite o nome e o sexo (M/F) das pessoas");
        System.out.println("Para parar, digite 'sair' como nome.");

        while (true) {
            System.out.println("Nome: ");
            String nomePessoa = s.next();
            if (nomePessoa.equalsIgnoreCase("SAIR")) {
                break;
            }
            System.out.println("M/F");
            String sexoPessoa = s.next();

            Exigencias add = new Exigencias(nomePessoa, sexoPessoa);
            mf.adicionarPessoas(add);
        }
            mf.exibirPessoas();
            s.close();
    }

}
