package smartphone.navegadorInternet;
public class Browser implements NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("CARREGANDO PÁGINA");
    
    }
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");

    }
    
}
