package smartphone.aparelhoTelefonico;
public class Telefone implements AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("REALIZANDO CHAMADA");
    
    }
    public void atender() {
        System.out.println("CHAMADA ATENDIDA");
    
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    
    }
}