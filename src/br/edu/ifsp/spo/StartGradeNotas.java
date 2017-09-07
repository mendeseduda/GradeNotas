/**
 *-------------------------------------------------------------------*
*                  IFSP - Instituto Federal de São Paulo             *
*                    T�cnico Integrado em Informática                *  
*                      Projeto Integrado - Turma 213                 *
*--------------------------------------------------------------------*
*                   Autor: Prof MSc. Veríssimo                       *
*                        data:04/09/2017                             *
*                                                                    *
*                    Id da Classe: StartGradeNotas                   *
* Descrição:                                                         *
*    Classe que iniciará a classa gradeNotas                         *
*--------------------------------------------------------------------*/

package br.edu.ifsp.spo;

import br.edu.ifsp.spo.notas.GradeNotas;

public class StartGradeNotas {

    public static void main(String[] args) {
        int notas[][] = new int[][]{
            {65, 10, 80, 15, 83, 100, 85, 90, 30, 35},
            {20, 68, 40, 25, 88, 79, 05, 70, 26, 17},
            {34, 18, 99, 30, 100, 28, 45, 97, 66, 67},
            {47, 58, 14, 10, 37, 100, 35, 41, 44, 55}
        };
     
        new GradeNotas("LP1 – Linguagem de Programação", notas).processaGradeNotas();
    }

}
