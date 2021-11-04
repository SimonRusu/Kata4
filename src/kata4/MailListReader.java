/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Entrar
 */
public  class MailListReader {
    public static List<Mail> read(String fileName){
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = br.readLine();
                if (line == null) break;
                if (Mail.isMail(line))
                    list.add(new Mail(line));
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("ERROR MailListReader::read (FileNotFound)"+ ex);
        }
        catch (IOException ex){
            System.out.println("ERROR MailListReader::read (IO)"+ ex);

        }
        
        return list;
    }
}
