package Punto;

public class GenerarPunto {

    private int x;
    private int y;

    public GenerarPunto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mArriba(int incremento) {
        y = y + incremento;
    }

    public void mAbajo(int incremento) {
        y = y - incremento;
    }

    public void nDerecha(int incremento) {
        x += incremento;
    }

    public void nIzquierda(int incremento) {
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
