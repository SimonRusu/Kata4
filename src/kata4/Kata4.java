/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.util.List;

/**
 *
 * @author Entrar
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    private static List<Mail> mailList;
    private static Histogram<String> h;
    private static HistogramDisplay histo;
    
    public static void main(String[] args) {
        execute();
        input();
        process();
        output();
        
    }
    
    public static void execute(){
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }
    
    public static void input(){
        h = MailHistogramBuilder.built(mailList);
    }
    
    public static void process(){
        histo = new HistogramDisplay("Mi Histograma",h);
    }
    
    public static void output(){
        histo.execute();
    }
}
