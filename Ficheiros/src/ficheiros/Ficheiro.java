
package ficheiros;

import java.io.File;
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
