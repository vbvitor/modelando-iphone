package smartphone.celular;

import smartphone.reprodutorMusical.ReprodutorMusical;
import smartphone.aparelhoTelefonico.AparelhoTelefonico;
import smartphone.navegadorInternet.NavegadorInternet;          

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {    
    public void ligar(String numero) {
        System.out.println("REALIZANDO CHAMADA");
    
    }
    public void atender() {
        System.out.println("CHAMADA ATENDIDA");
    
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    
    }
    public void exibirPagina(String url) {
        System.out.println("CARREGANDO PÁGINA");
    
    }
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");

    }
    public void tocar() {
        System.out.println("REPRODUZINDO MÚSICA");
    
    }
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
    
    }
    public void selecionarMusica(String musica) {
        System.out.println("MÚSICA SELECIONADA");
    
    }

}
