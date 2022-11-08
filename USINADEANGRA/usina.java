import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double massa = 0;
        int contador = 0;

        massa = Double.parseDouble(JOptionPane.showInputDialog("Por favor informe a massa inicial:"));

        while (massa > 0.10) {
            massa -= (massa * 0.25);
            contador++;
        }
        JOptionPane.showMessageDialog(null, contador * 30);

    }
}
