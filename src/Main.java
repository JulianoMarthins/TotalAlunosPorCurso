import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos alunos tem no curso de Java Completo: ");
        int num = sc.nextInt();
        sc.nextLine();

        Set<String> cursoA = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            System.out.printf("Digite a ID do %d° aluno: ", i + 1);
            String id = sc.nextLine();
            cursoA.add(id);
        }
        System.out.println();

        System.out.print("Quantos alunos tem no curso de Spring Boot: ");
        num = sc.nextInt();
        sc.nextLine();

        Set<String> cursoB = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            System.out.printf("Digite a Id do %d° aluno: ", i + 1);
            String id = sc.nextLine();
            cursoB.add(id);
        }
        System.out.println();

        System.out.print("Quantos alunos tem no curso de Banco de dados: ");
        num = sc.nextInt();
        sc.nextLine();

        Set<String> cursoC = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            System.out.printf("Digite a ID do %d° aluno: ", i + 1);
            String id = sc.nextLine();
            cursoC.add(id);
        }
        System.out.println();

        Set<String> totalAlunos = new TreeSet<>(cursoA);
        totalAlunos.addAll(cursoB);
        totalAlunos.addAll(cursoC);

        for(String n: totalAlunos){
            System.out.println("Id dos alunos: " + n);
        }


        System.out.println("\nTotal de alunos: " + totalAlunos.size());


        sc.close();
    }
}