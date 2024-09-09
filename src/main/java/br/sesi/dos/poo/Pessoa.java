package br.sesi.dos.poo;

import br.sesi.dos.poo.cabeca.Cabeca;
import br.sesi.dos.poo.inferior.MembrosInferiores;
import br.sesi.dos.poo.tronco.Tronco;


public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
