import javax.swing.*;

public class FabioAugusto_4 {

    public static class Aluno {
        String nome;
        double[] notas = new double[15];
        double somaNota;
        double mediaNota;
    }

    public static void main(String[] args) {
        Aluno turma[] = new Aluno[30];
        double[] somaDisciplina = new double[15];
        double menorDisciplina = 0, maiorDisciplia = 0;
        int posiMaiorDisciplina = 0, posiMenorDisciplina = 0;
        Aluno menorAluno = new Aluno(), maiorAluno = new Aluno();

        for (int i = 0; i < turma.length; i++) {
            Aluno alunoX = new Aluno();
            alunoX.nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno " + (i + 1) + ": ");
            alunoX.somaNota = 0;
            for (int j = 0; j < alunoX.notas.length; j++) {
                alunoX.notas[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do aluno " + (alunoX.nome) + " na disciplia " + (i + 1) + ": "));
                alunoX.somaNota += alunoX.notas[j];
                somaDisciplina[j] += alunoX.notas[j];
            }
            alunoX.mediaNota = alunoX.somaNota / alunoX.nome.length();
            if (i == 0) {
                menorAluno.nome = alunoX.nome;
                maiorAluno.nome = alunoX.nome;
                menorAluno.somaNota = alunoX.somaNota;
                maiorAluno.somaNota = alunoX.somaNota;
            } else {
                if (alunoX.somaNota < menorAluno.somaNota) {
                    menorAluno.nome = alunoX.nome;
                    menorAluno.somaNota = alunoX.somaNota;
                }
                if (alunoX.somaNota > maiorAluno.somaNota) {
                    maiorAluno.nome = alunoX.nome;
                    maiorAluno.somaNota = alunoX.somaNota;
                }
            }
            turma[i] = alunoX;
        }

        for (int i = 0; i < somaDisciplina.length; i++) {
            if (i == 0) {
                menorDisciplina = somaDisciplina[i];
                posiMenorDisciplina = i + 1;
                maiorDisciplia = somaDisciplina[i];
                posiMaiorDisciplina = i + 1;
            } else {
                if (somaDisciplina[i] < menorDisciplina) {
                    menorDisciplina = somaDisciplina[i];
                    posiMenorDisciplina = i + 1;
                }
                if (somaDisciplina[i] > maiorDisciplia) {
                    maiorDisciplia = somaDisciplina[i];
                    posiMaiorDisciplina = i + 1;
                }
            }
        }

        String printMedia = "";
        for (int i = 0; i < turma.length; i++) {
            printMedia += "Aluno " + turma[i].nome + " - Média: " + turma[i].mediaNota + "\n";
        }
        JOptionPane.showMessageDialog(null, printMedia);

        JOptionPane.showMessageDialog(null,
                "O aluno que obteve a maior soma de notas foi o " + maiorAluno.nome +
                        "\nO aluno que obteve a menor soma de notas foi o " + menorAluno.nome);

        JOptionPane.showMessageDialog(null,
                "Disciplina que obteve a menor média de notas alcançadas pelos alunos foi a disciplina" + posiMaiorDisciplina +
                        "\nDisciplina que obteve a maior média de notas alcançadas pelos alunos foi a disciplina" + posiMenorDisciplina);


    }
}
