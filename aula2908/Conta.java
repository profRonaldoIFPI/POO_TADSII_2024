package com.mycompany.aula2908;
public class Conta {
    String titular;
    float saldo;
    public Conta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    String depositar(float valor){
        this.saldo += valor;
        return "Novo saldo: "+ this.saldo;
    }
    String sacar (float valor){
        if (this.saldo>=valor){
            this.saldo -= valor;
            return "Saque realizado.\nSaldo: "+ this.saldo;
        } else {
            return "Saldo insuficiente. Você esta liso!\n"+this.saldo;
        }
    }
}
