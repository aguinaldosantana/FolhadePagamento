package com.company;

//nao pode instanciar dessa classe, pq é abstrata
public abstract class Funcionario {

        private String nome;
        private String id;
        private double salarioLiquido;

        public double salarioLiquido(double salario, double inss){

        }

        public double calculaInss(double salario){      //metodos

        }

        public void listaFuncionario(){

        }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}

