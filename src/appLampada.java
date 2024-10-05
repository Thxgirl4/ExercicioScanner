import java.util.Scanner;

public class appLampada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Lampada lamp = new Lampada();
         System.out.println("Informe a marca: ");
         lamp.marca = teclado.nextLine();
         System.out.println("Informe a voltagem: ");
        lamp.voltagem = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Informe o tipo: ");
        lamp.tipo = teclado.nextLine();

         System.out.println("Informe a cor: ");
         lamp.cor = teclado.nextLine();
         teclado.nextLine();

         System.out.println("Informe o preço: ");
         lamp.preco = teclado.nextFloat();

         System.out.println("Marca: " + lamp.marca);
         System.out.println("Voltagem: " + lamp.voltagem);
         System.out.println("Tipo: " + lamp.tipo);
         System.out.println("Cor: " + lamp.cor);
         System.out.println("Preço: " + lamp.preco);

         System.out.println("Estado atual da Lampada é " + lamp.verificarEstado());

         lamp.ligada = lamp.ligar();

         System.out.println("Agora o estado atual da Lampada é " + lamp.verificarEstado());

    }
}