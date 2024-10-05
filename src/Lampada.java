public class Lampada {
    String marca;
    int voltagem;
    String tipo;
    String cor;
    float preco;
    boolean ligada;

    public Lampada() {}

    public Lampada(String marca, int voltagem, String tipo, String cor, float preco){
        this.marca = marca;
        this.voltagem = voltagem;
        this.tipo = tipo;
        this.cor = cor;
        this.preco = 0.00f;
        this.ligada = false;
    }

    public boolean ligar() {
        return true;
    }

    public boolean desligar(){
       return false;

    }

    public boolean verificarEstado(){
        if(this.ligada == true){
            this.ligada = ligar();
            return true;
        }
        this.ligada = desligar();
        return false;
    }


}
