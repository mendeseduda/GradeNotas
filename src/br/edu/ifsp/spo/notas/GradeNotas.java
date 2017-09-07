/**
 *-------------------------------------------------------------------*
*                  IFSP - Instituto Federal de São Paulo             *
*                    T�cnico Integrado em Informática                *  
*                      Projeto Integrado - Turma 213                 *
*--------------------------------------------------------------------*
*                   Autor: Prof MSc. Veríssimo                       *
*                        data:04/09/2017                             *
*                                                                    *
*                    Id da Classe: GradeNotas                        *
* Descrição:                                                         *
*    Classe que será responsável por exibir as notas da turma        *
*--------------------------------------------------------------------*/

package br.edu.ifsp.spo.notas;

public class GradeNotas {

    private String nomeCurso;
    private int gradeNotas[][];

    public GradeNotas(String nomeCurso, int[][] gradeNotas) {
        this.nomeCurso = nomeCurso;
        this.gradeNotas = gradeNotas;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void exibeBoasVindas() {
        System.out.println("Bem vindo ao aplicativo Notas dos alunos para " + nomeCurso+"\n");
    }

    public void processaGradeNotas() {
        exibeBoasVindas();
        System.out.println("Na notas são:");
        imprimeNotas();
        for (int i = 0; i < gradeNotas.length; i++) {
            geraGraficoBarras(i);
            System.out.println("\n ------------------------------------------------------ \n");
        }
        System.out.println("TOTAIS GERAIS");
        System.out.printf("Média da turma: é %.2f \n", obtemMediaNotas());
        System.out.printf("Menor Nota: %d\n", obtemMenorNota());
        System.out.printf("Maior Nota: %d\n", obtemMaiorNota());
        
    }
    //Obtém a menor nota das turmas
    public int obtemMenorNota() {
        int menor = gradeNotas[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (menor > gradeNotas[i][j]) {
                    menor = gradeNotas[i][j];
                }
            }
        }
        return menor;
    }
    //Obtém a menor nota da turma especifíca
    public int obtemMenorNota(int turma) {
        int menor = gradeNotas[turma][0];
        for (int j = 0; j < 10; j++) {
            if (menor > gradeNotas[turma][j]) {
                menor = gradeNotas[turma][j];
            }
        }
        return menor;
    }
    //Obtém a maior nota das turmas 
    public int obtemMaiorNota() {
        int maior = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (gradeNotas[i][j] > maior) {
                    maior = gradeNotas[i][j];
                }
            }
        }
        return maior;
    }
    //Obtém a maior nota das turmas 
    public int obtemMaiorNota(int turma) {
        int maior = 0;
        for (int j = 0; j < 10; j++) {
            if (gradeNotas[turma][j] > maior) {
                maior = gradeNotas[turma][j];
            }

        }
        return maior;
    }
    //Obtém a media das turmas
    public double obtemMediaNotas() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                total += gradeNotas[i][j];
            }
        }
        total = total / 40;
        return total;
    }
    //Obtém a média da turma especifíca
    public double obtemMediaNotas(int turma) {
        double total = 0;
        for (int j = 0; j < 10; j++) {
            total += gradeNotas[turma][j];

        }
        total = total / gradeNotas[0].length;
        return total;
    }
    //Gera o gráfico da turma especifíca
    public void geraGraficoBarras(int turma) {
        String barras[] = new String[gradeNotas[0].length + 1];
        for (int i = 0; i < barras.length; i++) {
            barras[i] = "";
        }

        for (int i = 0; i < gradeNotas[0].length; i++) {
            if (gradeNotas[turma][i] >= 0 && gradeNotas[turma][i] < 10) {
                barras[0] += "*";
            }
            if (gradeNotas[turma][i] >= 10 && gradeNotas[turma][i] < 20) {
                barras[1] += "*";
            }
            if (gradeNotas[turma][i] >= 20 && gradeNotas[turma][i] < 30) {
                barras[2] += "*";
            }
            if (gradeNotas[turma][i] >= 30 && gradeNotas[turma][i] < 40) {
                barras[3] += "*";
            }
            if (gradeNotas[turma][i] >= 40 && gradeNotas[turma][i] < 50) {
                barras[4] += "*";
            }
            if (gradeNotas[turma][i] >= 50 && gradeNotas[turma][i] < 60) {
                barras[5] += "*";
            }
            if (gradeNotas[turma][i] >= 60 && gradeNotas[turma][i] < 70) {
                barras[6] += "*";
            }
            if (gradeNotas[turma][i] >= 70 && gradeNotas[turma][i] < 80) {
                barras[7] += "*";
            }
            if (gradeNotas[turma][i] >= 80 && gradeNotas[turma][i] < 90) {
                barras[8] += "*";
            }
            if (gradeNotas[turma][i] >= 90 && gradeNotas[turma][i] < 100) {
                barras[9] += "*";
            }
            if (gradeNotas[turma][i] == 100) {
                barras[10] += "*";
            }
        }

        System.out.printf("Distribuição das Notas Turma %d:\n", turma + 1);
        int cont = 0;
        for (int i = 0; i < gradeNotas[0].length * 10; i = i+10) {
            if (i == (gradeNotas[0].length * 9)) {
                System.out.printf("100     - %s \n\n", barras[10]);
            } else {
                System.out.printf("%02d - %02d - %s \n", i, i+9, barras[cont]);  
                cont++;
            }
        }
    }
    //Imprime todas as notas
    public void imprimeNotas() {
        for (int i = 0; i < gradeNotas.length; i++) {
            System.out.printf("Turma #%d \n", i + 1);
            for (int j = 0; j < gradeNotas[0].length; j++) {
                System.out.printf("Aluno #%d: %d\n", j + 1, gradeNotas[i][j]);
            }
            System.out.printf("\nMédia da classe: é %.2f", obtemMediaNotas(i));
            System.out.printf("\nMenor Nota:%d", obtemMenorNota(i));
            System.out.printf("\nMaior Nota:%d", obtemMaiorNota(i));
            System.out.println("\n ------------------------------------------------------ \n");
        }
    }

}
