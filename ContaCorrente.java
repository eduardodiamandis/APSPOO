public class ContaCorrente extends Conta {
//Classe conta corrente: Herda a classe conta

//Adiciona as seguintes modificações:
public double limite;

//Métodos obrigatórios:
public boolean usandoLimite(){
    return true;
    //--> Condição: Retorna true se o cliente estiver utilizando o limite (saldo negativo)
    //-->e false em caso contrário;
}

//Reimplementação do sacar, que deve considerar o limite – mesma assinatura do método original, apenas com reimplementação;
//--> Dar um Override 

//??Mudanças no imprimir, que deve retornar também o limite da conta;??

//-->Dar Override
//Construtor: um que recebe apenas os parâmetros necessários
@Override
public ContaCorrente(int numeroConta, String nomeCliente, int cPF) {
    this.numeroConta = numeroConta;
    this.nomeCliente = nomeCliente;
    CPF = cPF;
}

//Construtor 2 que recebe os mesmos parâmetros mais o limite da conta.
public ContaCorrente(int numeroConta, String nomeCliente, int cPF, double limite) {
    super(numeroConta, nomeCliente, cPF);
    this.limite = limite;
}
}