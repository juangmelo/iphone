package celular;

import funçoes.AparelhoTelefonico;
import funçoes.NavegadorInternet;
import funçoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }

    public void tocar(){
        System.out.println("Reproduzindo música");
    }

    public void pausar(){
        System.out.println("Pausando música");
    }

    public void adicionarNovaAba(String pagina){
        System.out.println("Página nova: " + pagina);
    }

    public void exibirPagina(){
        System.out.println("Abrindo página");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando...");
    }

    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz");
    }
    
}
