public class ContaTerminal {


    private int Numero;
    private String Agencia;
    private String NomeCliente;
    private double Saldo;

    public ContaTerminal(int numero,String agencia, String nomecliente,Double saldo){
        this.Numero = numero;
        this.Agencia = agencia;
        this.NomeCliente = nomecliente;
        this.Saldo = saldo;

    }
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        this.Numero = numero;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.NomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        this.Agencia = agencia;
    }


    public void Imprimir(){
        System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +
                Agencia + " conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
    }

}
