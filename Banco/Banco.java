import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Bem vindo a sua conta. Seu saldo é de R$1000.0");

    Double saldo = 1000.0;
    int opcao = 0;
    Double sacar, depositar;
  
    while(opcao!=3){
    opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Menu Inicial. Escolha uma opção: \n" +
        "1- Depositar \n" +
        "2- Sacar \n" +
        "3 - Sair"));

    switch (opcao) {
      case 1:
        do {
          depositar = Double.parseDouble(JOptionPane.showInputDialog(null, "Deseja depositar quanto? "));
          saldo = saldo + depositar;
          JOptionPane.showMessageDialog(null, "Seu novo salfo é: R$" + saldo);
        } while (opcao != 1);
      break;
      case 2:
        do {
          sacar = Double.parseDouble(JOptionPane.showInputDialog(null, "Deseja sacar qual valor"));
          if (sacar > saldo) {
            JOptionPane.showMessageDialog(null, "Operação inválida você não tem saldo sufuciente");
          } else {
            saldo = saldo - sacar;
            JOptionPane.showMessageDialog(null, "Seu novo saldo é: R$" + saldo);
          break;
          }
        } while (opcao != 1);
        
      case 3:
        break;
    
      default:
        JOptionPane.showMessageDialog(null, "Opção invalida!");
        break;
        }
    }
  
  }
}