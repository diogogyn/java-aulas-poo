package br.sesi.file;

import java.io.IOException;

public class MainFile {
    public static void main(String args[]) throws IOException {
        String path = "C:\\Users\\user\\Documents\\develop\\java-aulas-poo\\file2.txt";

        //ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }

}
