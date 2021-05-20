public abstract class Conta{
  
    public int numeroConta;
    //-->Validação de conta 8 algarismos + dig
    public String nomeCliente;
    //-->Minimo 3 letras
    public int CPF;
    //--> Condição pra validar 11 digitos
    public double saldo;    

//Todos os atributos deverão ter get, porém o saldo, o número da conta
//CPF não poderão ter sets públicos

public int getNumeroConta() {
    return numeroConta;
}
public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
}
public String getNomeCliente() {
    return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
}
public int getCPF() {
    return CPF;
}
private void setCPF(int cPF) {
    CPF = cPF;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}

//Métodos obrigatórios
public boolean sacar(valorSacado){
    //--> Recebe um valor a ser sacado como parâmetro 
    //--> E valida se é possível efetuar o saque
    //--> Retorna true, se for.
}

public boolean depositar(valorDepositado)
    //--> Recebe um valor a ser sacado como parâmetro 
    //--> Deposita

public String imprimir(){
    //--> Retorna Saldo + valor depositado
}

//Construtor: que receba o número da conta, nome do cliente e CPF;
public Conta(int numeroConta, String nomeCliente, int cPF) {
    this.numeroConta = numeroConta;
    this.nomeCliente = nomeCliente;
    CPF = cPF;
}
}