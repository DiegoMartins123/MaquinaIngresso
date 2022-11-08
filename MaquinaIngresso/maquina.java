package MaquinaIngresso;

import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {

  int opcao=0;
  int ingresso=0;
  int quantidade;
  int inteira = 30;
  int meia = 15;
  int pagamento=0;
  int total=0;
  double cartao=0;
  double boleto=0;
  double troco;
  double pix=0;
  double pag=0;
    
while (opcao!=2){
opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção:\n1 - Comprar ingresso\n 2 - Sair"));
  
switch(opcao){
  
 case 1:
  while(ingresso!=4){
  ingresso = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor escolha opção de ingresso:"
+"\n1 - Inteira: R$30,00" 
+"\n2 - Meia: R$15,00"
+"\n3 - Carrinho" 
+"\n4 - Voltar ao Menu"));
  
    switch(ingresso){ 
    
    case 1:
quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de ingresso:"));
    total = quantidade*inteira;
  JOptionPane.showMessageDialog (null, "O valor de seu ingresso será de :R$ "+total );
    break;
  
    case 2:
  quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de ingresso:"));
    total = quantidade*meia;
  JOptionPane.showMessageDialog (null, "O valor de seu ingresso será de :R$ "+total );
  break;
  
    case 3:
    while(pagamento!=4){
  pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor escolha opção de pagamento:"
+"\n1 - Cartão (5% Juros)" 
+"\n2 - Boleto" 
+"\n3 - PIX (5% Desconto)"
+"\n4 - Cancelar compra"));
  
    switch(pagamento){
  
    case 1:
    cartao = (total*1.05);
    JOptionPane.showMessageDialog (null, "O valor de seu ingresso foi ajustado para 5% devido a forma de pagamento, total a pagar será de :R$ "+cartao );
        pag = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá, bem vindo ao caixa. Por favor informe a quantia para pagamento:"));
        troco = (pag - (total * 1.05));
         JOptionPane.showMessageDialog(null, "Agradecemos a sua compra, o seu troco é: " +troco);
    JOptionPane.showMessageDialog (null, "Obrigado pela sua compra, tenha um bom filme");
  break;
    case 2:
     boleto = Double.parseDouble(JOptionPane.showInputDialog("Total a pagar:R$"+total));
    JOptionPane.showMessageDialog (null, "Obrigado pela sua compra, tenha um bom filme");
  break;
    case 3:
     pix = (total-(total*0.05));
    JOptionPane.showMessageDialog (null, "O valor de seu ingresso foi ajustado com 5% de desconto por estar usando o PIX como forma de pagamento, total a pagar será de :R$ "+pix );
        pag = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor informe a quantia para pagamento:"));
    troco = (pagamento - (total -  (total * 0.05)));
      JOptionPane.showMessageDialog(null, "Agradecemos a sua compra, o seu troco é: " + troco);   
    JOptionPane.showMessageDialog (null, "Obrigado pela sua compra, tenha um bom filme");
    break;
      case 4:
        break;
        
}   
} 
} 
}
}    
}     
}
}