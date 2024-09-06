package br.sesi.dos.modelo;

public class Moto implements Veiculo{

    @Override
    public void ligarMotor() {
        System.out.println("Liguei a moto");
    }

    @Override
    public void desligarMotor() {
        System.out.println("");
    }

    @Override
    public void ligarFarol() {

    }

    @Override
    public void desligarFarol() {

    }

    @Override
    public boolean estaLigado() {
        return false;
    }
}
