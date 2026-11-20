import java.util.Scanner;
      public class index {
         public static void main (String[] args) {
            Scanner MolequeBusiness = new Scanner(System.in);
            System.out.println("Digite o nome do aluno:");
            String Nome = MolequeBusiness.nextLine();
            System.out.println("Digite a idade do aluno:");
            int Idade = MolequeBusiness.nextInt();
            if (Idade < 18){
               System.out.println("O aluno " + Nome + " é menor de idade!");
            }
            else{
               System.out.println("O aluno " + Nome + " é maior de idade!");
            }
            System.out.println("bem-vindo " + Nome + " e sua idade é " + Idade);
      
         }
      }