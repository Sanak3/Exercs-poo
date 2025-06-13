package br.inatel.cdg;

public class Conta {
    private int numero ;
    private float saldo ;
    private float limite ;
    private Cliente [] clientes;

    public Conta() {
        this.clientes = new Cliente[3];
    }

    void sacar (float quantia){
    if(quantia<=saldo){
        this.saldo -=quantia;
    }else{
        System.out.println("Saldo invalido");
        }
    }

    void deposita (float quantia){
        this.saldo += quantia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
