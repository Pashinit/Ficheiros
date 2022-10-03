/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheiros;

import java.util.Scanner;

/**
 *
 * @author vquerido
 */
public class Ficheiros {

    public static Scanner read = new Scanner (System.in);
    
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("1- Criar Ficheiro");
            System.out.println("2- Verificar se Ficheiro existe");
            System.out.println("3- Escrever em ficheiro mantendo dados caso exista");
            System.out.println("4- Escrever um novo ficheiro mantendo dados caso exista");
            System.out.println("5- Ler um ficheiro");
            System.out.println("6- Mostrar lista de ficheiros");
            System.out.println("0- Sair");
            System.out.println("Selcione a opção pretendida");
            op = read.nextInt();
            switch(op){
                case 1: Ficheiro.criarFicheiro(); break;
                case 2: Ficheiro.verificaSeExiste();break;
                case 3: Ficheiro.escreveNoFinalFicheiro();break;
                case 4: Ficheiro.escreveFicheiroNovo();break;
                case 5: Ficheiro.mostraConteudoFicheiro();break;
                case 6: Ficheiro.mostraListaFicheiros();break;
                case 0: Ficheiro.criarFicheiro();break;
            }
        }while(op!=0);
        
    }
    
}
