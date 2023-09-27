package poo.iphone.navegador;

public class Navegador implements NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina...");
    }
}
