package celularSmart;

import smartphone.celular.Iphone;
import smartphone.reprodutorMusical.*;
import smartphone.aparelhoTelefonico.*;
import smartphone.navegadorInternet.*;

public class Celular {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;
        
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica(null);
        aparelhoTelefonico.ligar(null);
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        navegadorInternet.exibirPagina(null);
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
