package OCP.a6exceptionsandassertions.try_with_resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

    /*
        Nu putem pune ca resursa in try orice clasa, doar celea care implementeaza interfata AutoCloseable

     */

public class TryWithResources implements AutoCloseable{

    public static void main(String[] args) throws Exception {


        try(Scanner sc = new Scanner(System.in)) {
            sc.nextLine();
        }catch (Exception e){
            //sc.nextInt(); nu se compileaza, deoarece referinta sc este valabila doar in blocul try, cu implimentarea veche unde Scanner ar fi declarat ca varianbila de intanta
            // ar fi posibil si putem accidental sa folosim obiecte care au fost inchise (closed), de asta si try cu resurse este mai eficient
        }finally {
            //s.nextInt(); aceiasi chestie
        }

        try(TryWithResources tr = new TryWithResources()) {

        }

    }

    public void oldApproach(Path path, Path path1) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;

        try{
            in = Files.newBufferedReader(path);
            out = Files.newBufferedWriter(path1);
            out.write(in.readLine());
        }finally {
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }

    public void newApproach(Path path, Path path1) throws IOException {

        try(BufferedReader in = Files.newBufferedReader(path);
            BufferedWriter out = Files.newBufferedWriter(path1)) {
            out.write(in.readLine());
        }
    }

    @Override
    public void close() {
        System.out.println("Closed");
    }
}
