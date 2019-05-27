package com.company;

public abstract class Funcionario {

    private int id;
    private String nome;
    private double inss;
    private double salarioLiquido;

   public double calculaSalarioLiquido(double salario) {   //Calcula salario menos  o INSS

        return calculaInss(salarioLiquido);
    }

    public double calculaInss(double salario) {                   //Calculo de INSS
        if (salario <= 1751.81) {
            this.salarioLiquido = salario - (salario * 0.08);
        } else if (salario > 1751.81 && salario <= 2919.72) {
            this.salarioLiquido = salario - (salario * 0.09);
        } else {
            this.salarioLiquido = salario - (salario * 0.11);
        }
        return salarioLiquido;
    }

    public abstract void listaFuncionario();

    public int getId () {
        return id;
    }

    public String getNome () {
        return nome;
    }

    public double getInss () {
        return inss;
    }

    public double getSalarioLiquido () {
        return salarioLiquido;
    }

    public void setSalarioLiquido( double salarioLiquido){
        this.salarioLiquido = salarioLiquido;
    }

    public void setId ( int id){
        this.id = id;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setInss ( double inss){
        this.inss = inss;
    }
}
