import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {

    int menu = 0;
    int bebidas = 0;
    int salgado = 0;
    int doce = 0;
    int pagamento = 0;
    int troco;
    int carrinho;
    int estorno;

    while (menu != 6) {
      menu = Integer.parseInt(JOptionPane.showInputDialog("MENU: "

          + "\n ESCOLHA UMA OPÇÃO ABAIXO:"
          + "\n 1 - BEBIDAS."
          + "\n 2 - SALGADINHOS."
          + "\n 3 - DOCES."
          + "\n 4 - CARRINHO."
          + "\n 5 - CANCELAMENTO DA COMPRA."
          + "\n 6 - SAIR."));

      switch (menu) {
        case 1:
          JOptionPane.showMessageDialog(null, "MENU DE BEBIDAS:");
          int valorBebida = 5;
          int numBebidas;
          numBebidas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cada bebida custa R$" + valorBebida
              + "\n Informe a quantidade:"));

          bebidas = (valorBebida * numBebidas);
          JOptionPane.showMessageDialog(null, "TOTAL: R$" + bebidas + ".");
          break;
        // espaço // espaço //
        case 2:
          JOptionPane.showMessageDialog(null, "MENU DE SALGADINHOS:");
          int valorSalgado = 3;
          int numSalgado;
          numSalgado = Integer.parseInt(JOptionPane.showInputDialog(null, "Cada salgado custa R$" + valorSalgado
              + "\n Informe a quantidade:"));

          salgado = (valorSalgado * numSalgado);
          JOptionPane.showMessageDialog(null, "TOTAL: R$" + salgado + ".");
          break;
        // espaço // espaço //
        case 3:
          JOptionPane.showMessageDialog(null, "MENU DE DOCE:");
          int valorDoce = 1;
          int numDoce;
          numDoce = Integer.parseInt(JOptionPane.showInputDialog(null, "Cada doce custa R$" + valorDoce
              + "\n Informe a quantidade:"));

          doce = (valorDoce * numDoce);
          JOptionPane.showMessageDialog(null, "TOTAL: R$" + doce + ".");
          break;
        // espaço // espaço //
        case 4:
          JOptionPane.showMessageDialog(null, "VOCÊ ENTROU NO CARRINHO");
          carrinho = (bebidas + salgado + doce);
          JOptionPane.showMessageDialog(null, "VALOR TOTAL É : " + carrinho);
          pagamento = Integer.parseInt(JOptionPane.showInputDialog(null,
              "BEM VINDO AO CAIXA PARA PAGAMENTO POR FAVOR INFORME QUANTIA DE PAGAMENTO:"));
          troco = (pagamento - carrinho);
          JOptionPane.showMessageDialog(null, "OBRIGADO POR COMPRAR CONOSCO SEU TROCO É :" + troco + "\n VOLTE SEMPRE");
          break;

        case 5:
          estorno = pagamento;
          JOptionPane.showMessageDialog(null, "COMPRA CANCELADA ESTORNO É R$:" + estorno);
          break;
        case 6:
          break;

      }
    }
  }
}