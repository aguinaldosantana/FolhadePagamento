package com.company;

public class FuncionarioMensalista extends Funcionario{     //FuncionarioMensalista herda de Funcionario

    private double salarioMensal;

    public double calculaSalarioLiquido(double salario) {
        this.salarioMensal = super.calculaSalarioLiquido(salario);
        return this.salarioMensal;
    }

    @Override
    public double calculaInss(double salario) {
        return super.calculaInss(salario);
    }

    @Override
    public void listaFuncionario() {
        System.out.println("Salario Liquido Mensalista R$: " + calculaSalarioLiquido(salarioMensal));
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
