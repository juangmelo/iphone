package usuario;

import java.util.Scanner;
import celular.Iphone;

public class IphoneDeJuan {
    public static void main(String[] args) throws Exception {

        Iphone iphoneJuan = new Iphone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual musica gostaria de ouvir?");
        String musica = scanner.next();

        iphoneJuan.selecionarMusica(musica);
        iphoneJuan.tocar();
        iphoneJuan.pausar();

        System.out.println("Qual página acessar?");
        String pagina = scanner.next();
        
        iphoneJuan.adicionarNovaAba(pagina);
        iphoneJuan.exibirPagina();
        iphoneJuan.atualizarPagina();

        System.out.println("Ligar para:");
        String numero = scanner.next();

        iphoneJuan.ligar(numero);
        iphoneJuan.atender();
        iphoneJuan.iniciarCorreioVoz();

        scanner.close();
    }
}
