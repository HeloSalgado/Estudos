package aplicacao;

import javax.swing.*;
import java.util.Scanner;

public class programa {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        produtos produto = new produtos();

        System.out.println("Nome do produto:");
        produto.produto = teclado.next();

        System.out.println("Insira a quantidade:");
        produto.quantidade = teclado.nextDouble();

        System.out.println("Insira o preço individual:");
        produto.preco = teclado.nextDouble();

        System.out.println("Confirmação: " + produto.produto + ", Estoque: " + produto.quantidade + " Preço: " + produto.preco);

        System.out.println("Deseja acrescentar produtos ao estoque?");
        int estoque = teclado.nextInt();
        produto.addProdutos(estoque);

        System.out.println("Atualização: " + produto.produto + ", Estoque atual: " + produto.quantidade + " Preço: " + produto.preco);

        System.out.println("Foi realizada alguma venda no período?");
        estoque = teclado.nextInt();
        produto.removeProdutos(estoque);

        JOptionPane.showMessageDialog(null, "Atualização após vendas: " + produto.produto + ", Estoque atual: " + produto.quantidade + " Preço: " + produto.preco + " Valor atual do estoque: R$" + produto.quantidade * produto.preco);

        teclado.close();
    }
}
