package lanchonete;

public class Estabelecimento {

    Cozinheiro cozinheiro = new Cozinheiro();
    //ações que não precisam estarem disponiveis para toda a aplicação
    cozinheiro.lavarIngredientes();
    cozinheiro.baterVitaminaLiquidificador();
    cozinheiro.selecionarIngredientesVitamina();
    cozinheiro.prepararLanche();
    cozinheiro.prepararVitamina();
    cozinheiro.prepararVitamina();

    //ações que o estabelecimento precisa ter ciencia
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Almoxarife almoxarife = new Almoxarife();
//ações que não precisam estarem disponiveis para toda a aplicação
    almoxarife.controlarEntrada();
    almoxarife.controlarSaida();
    //ação que somente o seu pacote cozinha precisa conhecer
    almoxarife.entregarIngredientes();
    almoxarife.trocarGas();
//
Atendente atendente = new Atendente();
atendente.pegarLancheCozinha();
atendente.receberPagamento();
atendente.servindoMesa();
//ação que somente o seu pacote cozinha precisa conhecer
atendente.trocarGas();

Cliente cliente = new Cliente();
cliente.escolherLanche();
cliente.fazerPedido();
cliente.pagarConta();

//nao deveria mas o estabelecimento
//ainda nao definiu normas de atendimento
cliente.pegarPedidoBalcao();

//esta acao é muito sigilosa que tal ser privada?
cliente.consultarSaldoAplicativo();
//ja pensou os clientes ounvindo que o gas acabou?

cozinheiro.pedirParaTrocarGas(atendente);
cozinheiro.pedirParaTrocarGas(almoxarife);
   
}
