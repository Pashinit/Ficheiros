
package ficheiros;

import java.io.File;


class Ficheiro {

    static void criarFicheiro() {
    }

    static void verificaSeExiste() {
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
