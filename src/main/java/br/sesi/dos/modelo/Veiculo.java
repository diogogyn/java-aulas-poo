package br.sesi.dos.modelo;

public interface Veiculo {

    void ligarMotor();
    void desligarMotor();
    void ligarFarol();
    void desligarFarol();
    boolean estaLigado();

}
