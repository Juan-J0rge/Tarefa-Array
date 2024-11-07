package PastaTarefas.TarefaArray;

import java.util.ArrayList;
import java.util.List;

public class MascFem {
   private List<Exigencias> masculino;
   private List<Exigencias> feminino;

   public MascFem() {
      this.masculino = new ArrayList<>();
      this.feminino = new ArrayList<>();
   }
   public void adicionarPessoas(Exigencias pessoa) {
       if (pessoa.getSexo().equalsIgnoreCase("M")) {
           masculino.add(pessoa);
       } else if (pessoa.getSexo().equalsIgnoreCase("F")) {
          feminino.add(pessoa);
       }else {
       System.out.println("Invalido, Digite " + "M " +"para masculino ou " + "F " + "para feminino.");
       }
   }
   public void exibirPessoas() {
       System.out.println("Lista de Masculinos: ");
       for (Exigencias p : masculino) {
           System.out.println("Nome :" + p.getNome() + ",");
       }
       System.out.println("Lista de Femininos: ");
       for (Exigencias p : feminino) {
           System.out.println("Nome :" + p.getNome() + ",");
       }
       System.out.println();
   }
}
