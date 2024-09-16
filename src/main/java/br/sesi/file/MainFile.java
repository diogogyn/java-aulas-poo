package br.sesi.file;

import java.io.IOException;

public class MainFile {
    public static void main(String args[]) throws IOException {
        String path = "/tmp/file.rtf";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }

}
