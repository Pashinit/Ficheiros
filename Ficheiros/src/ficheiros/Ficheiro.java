
package ficheiros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class Ficheiro {

    static void criarFicheiro() {
        String nome;
        System.out.println("Insira o nome do ficheiro a criar");
        nome = Ficheiros.read.nextLine();
        nome = Ficheiros.read.next();
        
        File ficheiro = new File (nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    static void verificaSeExiste() {
        String nome;
        System.out.println("Insira o nome do ficheiro a verificar");
        nome = Ficheiros.read.nextLine();
        nome = Ficheiros.read.next();
        
        File ficheiro = new File (nome);
        if(!ficheiro.exists()){
            System.out.println("O ficheiro não existe");
        }else{
            System.out.println("O ficheiro existe");
        }
    }

    static void escreveNoFinalFicheiro() {
        String nome;
        System.out.println("Insira o nome do ficheiro onde vai escrever");
        nome = Ficheiros.read.nextLine();
        nome = Ficheiros.read.next();
        
        File ficheiro = new File (nome);
        
            try {
                if(!ficheiro.exists()){
                    ficheiro.createNewFile();
                }
                FileWriter fw = new FileWriter(ficheiro,true);
                BufferedWriter bw = new BufferedWriter(fw);
                String texto;
                System.out.println("Insira o conteudo");
                texto = Ficheiros.read.nextLine();
                texto = Ficheiros.read.nextLine();
                bw.write(texto);
                bw.newLine();
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }

    static void escreveFicheiroNovo() {
    }

    static void mostraConteudoFicheiro() {
    }

    static void mostraListaFicheiros() {
        File ficheiro = new File("C:\\Users\\vquerido/Desktop\\JAVAGIT\\ProjetoFicheiros\\Ficheiros\\Ficheiros");
        File [] lista = ficheiro.listFiles();
        System.out.println(">>> Lista de Ficheiros <<<");
        for(int x=0;x<lista.length;x++){
            System.out.println(lista[x].getName());
        }
    }
    
}
