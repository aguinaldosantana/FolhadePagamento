package com.company;

public class FuncionarioHorista extends Funcionario{

    private double salarioHora;
    private int horasTrabalhadas;
    private double salarioBruto;        //criei uma variavel para receber o salario bruto

    public double calculaSalarioBruto(double salH, int hT){
        return salH * hT;
    }

    @Override
    public double calculaSalarioLiquido(double salario) {
        this.salarioBruto = super.calculaInss(salarioHora * horasTrabalhadas);
        return this.salarioBruto;
//        return super.calculaSalarioLiquido(salario);
    }

    @Override
    public double calculaInss(double salario) {
        return super.calculaInss(salario);
    }

    @Override
    public void listaFuncionario() {
        System.out.println("Salario Liquido Horista: " + calculaSalarioLiquido(salarioBruto));
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
