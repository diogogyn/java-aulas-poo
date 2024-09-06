package br.sesi.dos.modelo;

public class Principal {

    public static void main(String[] args) {
        //Veiculo veiculo = null;
        Moto veiculo = new Moto();

        int opcao = 1;
        System.out.println("Quer iniciar qual veiculo");
        if(opcao ==1){
            veiculo = new Moto();
        }else if(opcao ==2){
            veiculo = new Carro();
        }
    }
}
