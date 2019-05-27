package com.company;

public class Main {


    public static void main(String[] args) {

        FuncionarioMensalista fm = new FuncionarioMensalista();
        fm.setSalarioLiquido(10000);
        fm.listaFuncionario();


        FuncionarioHorista fh = new FuncionarioHorista();
        fh.setSalarioHora(10);
        fh.setHorasTrabalhadas(1000);
        fh.listaFuncionario();

        GerenciaFuncionario g1 = new GerenciaFuncionario();

        g1.excluiFuncionario(fh);

    }
}
