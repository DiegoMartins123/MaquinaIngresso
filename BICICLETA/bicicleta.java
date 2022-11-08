import java.util.Scanner;

class Main {
  public static void main(String[] args) {


int [] idade = new int[5];
Scanner s = new Scanner(System.in);

for (int i = 0; i < idade.length; i++){
    System.out.println("Informe a idade " + (i=1) + ":");
    idade[i] = s.nextInt();

}
  }
}