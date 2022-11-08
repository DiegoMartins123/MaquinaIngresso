import javax.swing.JOptionPane;

//João Vitor Oliveira da Silva; Jefferson Henrique Machado; Diego Magno Lopes Martins.

class Main {
  public static void main(String[] args) {

    int menu=0;
    int salario = 0;
    int ferias;
    int INSS;
    int calculof;
    int mesesTrabalhados;
    int decimoTerceiro;
    double ajuste;
    int meses;
    
    while(menu!=4){   
    menu = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Menu Inicial. Escolha uma opção: \n" +
    "1- Novo Salario \n" +
    "2- Ferias \n" +
    "3- Decimo Terceiro \n"+
    "4 - INSS \n"+
    "5 - Sair" ));

    switch (menu) {
      case 1:
      salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor informe o salario do contemplado atual: "));
      if (salario < 3500){
        JOptionPane.showMessageDialog (null, "Parabens seu salario sera ajustado em 15% !!");
      ajuste = ((salario * 0.15)+ salario);
    JOptionPane.showMessageDialog (null, "Seu salario final sera:R$ "+ajuste );
      }else if (salario >= 3500 && salario < 6000){
        JOptionPane.showMessageDialog(null, "Parabens seu salario sera ajustado em 10% !!"); 
      ajuste = ((salario * 0.10)+ salario);
    JOptionPane.showMessageDialog (null, "Seu salario final sera:R$ "+ajuste );
      } else if (salario >= 6000){
      JOptionPane.showMessageDialog(null, "Parabens seu salario sera ajustado em 5% !!");
      ajuste = ((salario * 0.5)+ salario);
    JOptionPane.showMessageDialog (null, "Seu salario final sera:R$ "+ajuste );
      
    }
     break;   
      case 2:
    salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor informe o salario atual do funcionario: "));
    calculof = salario/3;
    ferias = salario + calculof;
  JOptionPane.showMessageDialog (null, "O valor de suas ferias será de :R$ "+ferias );
    break;
    case 3:
  salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor informe o salario atual do funcionario: ")); 
  mesesTrabalhados = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor informe a quantidade de meses trabalhado do funcionario: ")); 
   decimoTerceiro = ((salario * mesesTrabalhados)/12);
    JOptionPane.showMessageDialog(null, "Parabens seu decimo terceiro sera de:R$" +decimoTerceiro);
     break;  
  case 4:
       salario = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe o salario do contemplado atual: "));
      if (salario < 1100){
     JOptionPane.showMessageDialog (null, "Seu salario liquido com INSS é :!!" + (salario - 7.5/100));
     meses = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe os meses trabalhados "));   
     JOptionPane.showMessageDialog (null, "Ao total você pagara " + ((salario - 7.5/100) - salario) * meses );
   
      }
        
      default:
        JOptionPane.showMessageDialog(null, "Opção invalida!");
        break;
    
    } 
    }
     
  }
}