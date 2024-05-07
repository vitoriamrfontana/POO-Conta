package lanchonete;

public class Estabelecimento {
    public static void main(String[] args){

        Cozinheiro cozinheiro1 = new Cozinheiro();

        cozinheiro1.adicionarComboNoBalcao();
        cozinheiro1.adicionarLancheNoBalcao();
        cozinheiro1.adicionarSucoNoBalcao();
        cozinheiro1.prepararLanche();

        Atendente atendente1 = new Atendente();

        atendente1.pegarLancheNaCozinha();
        atendente1.pegarPedidoNoBalcao();
        atendente1.receberPagamento();
        atendente1.servindoMesa();

        Cliente cliente1 = new Cliente();

        cliente1.escolherLanche();
        cliente1.fazerPedido();
        cliente1.pagarConta();
        cliente1.consultarSaldoNoAplicativo();
        
    }
}
