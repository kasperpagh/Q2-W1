/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pagh
 */
public class T1Saver extends Thread
{

    private ArrayList<String> abe;

    public T1Saver(ArrayList abe)
    {
        this.abe = abe;
    }

    public void run()
    {
        gogo(abe);
    }

    public void gogo(ArrayList abe)
    {
        try
        {
            FileWriter writer = new FileWriter("backup.txt", false);
            PrintWriter out = new PrintWriter(writer);
            for (Object abe1 : abe)
            {
                out.write((String) abe1);
            }

            out.println("This is written to the file");
            out.close();
        } catch (IOException e)
        {
            System.out.println("knas i IO'en!");
        }
    }
}
