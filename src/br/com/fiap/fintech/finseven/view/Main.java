package br.com.fiap.fintech.finseven.view;


import br.com.fiap.fintech.finseven.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua abcd", 20, 121214189, "São Paulo", "SP");

        Login login = new Login(123, "teste@email.com", "senha123", 0, false);

        Usuario usuario = new Usuario("Maria Silva", 123456789, endereco, login);
        login.setUsuario(usuario);


        Categoria receita = new Categoria(10L, "Receita");
        Categoria catLazer = new Categoria(2L, "Lazer");


        Despesa cinema = new Despesa("Ingresso Cinema", 45.00, LocalDate.now(), catLazer, "Cartão de Crédito");


        Receita salario = new Receita("Salário Mensal", 5000.0, LocalDate.now(), receita, "Salário empresa");


        System.out.println("=== Fin Seven ===");
        usuario.exibirDadosUsuario();

        System.out.println("\n--- Endereço do Usuário ---");
        usuario.getEndereco().exibirEndereco();

        System.out.println("\n---  Movimentação da Conta ---");

        salario.exibirMovimentacao();
        System.out.println("=== Detalhes da Despesa ===");
        cinema.exibirMovimentacao();

        Login realizarLogin = new Login("fintech.finseven@fiap.com.br", "012@345");
        System.out.println("\n----- Realizando Logi n-----");
        realizarLogin.realizarLogin("fintech.finseven@fiap.com.br", "012@345");

        Login realizarLogin2 = new Login("teste.finseven@fiap.com.br", "abc@345");
        System.out.println("\n---- Testando Bloqueio de Conta (3 tentativas erradas) ----");

        realizarLogin2.realizarLogin("fintech@fiap.com.br", "ERRO_1");
        realizarLogin2.realizarLogin("fintech@fiap.com.br", "ERRO_2");
        realizarLogin2.realizarLogin("fintech@fiap.com.br", "ERRO_3");
        realizarLogin2.realizarLogin("teste.finseven@fiap.com.br", "abc@345");

        System.out.println("\n--- Área de Suporte ---");
        Suporte chamado = new Suporte("Problema no Acesso", "Não consigo visualizar meu extrato de investimentos.", usuario);
        chamado.enviarMensagem();
    }
}
