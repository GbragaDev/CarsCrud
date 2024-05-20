package com.example.aulasjava.Crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeCadastro {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    List<Pessoa> pessoas = new ArrayList<>();

    while (true) {
      System.out.println("1 - Cadastrar pessoa");
      System.out.println("2 - Listar pessoas");
      System.out.println("3 - Sair");
      int opcao = scanner.nextInt();
      scanner.nextLine();

      if (opcao == 1) {
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Apelido: ");
        String apelido = scanner.nextLine();
        Pessoa pessoa = new Pessoa(pessoas.size() + 1, nome, apelido);
        pessoas.add(pessoa);
        System.out.println("Pessoa cadastrada com sucesso!");
      } else if (opcao == 2) {
        for (Pessoa pessoa : pessoas) {
          System.out.println(pessoa);
        }
      } else if (opcao == 3) {
        break;
      } else {
        System.out.println("Opção inválida!");
      }
    }



  }



}

