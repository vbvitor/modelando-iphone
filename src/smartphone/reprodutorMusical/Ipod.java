package smartphone.reprodutorMusical;
public class Ipod implements ReprodutorMusical {
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