/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_A_w1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author pagh
 */
public class T1 extends Thread
{

    private String url;
    private int sum;
    private volatile int bisCount;

    public T1(String url)
    {
        this.url = url;
    }

    public void run()
    {
        sum = getBytesFromUrl(url).length;

    }

    protected synchronized byte[] getBytesFromUrl(String url)
    {
        ByteArrayOutputStream bis = new ByteArrayOutputStream();
        try
        {
            InputStream is = new URL(url).openStream();
            byte[] bytebuff = new byte[4096];
            int read;
            while ((read = is.read(bytebuff)) > 0)
            {
                bis.write(bytebuff, 0, read);
            }
            bisCount = bis.size();
        } catch (IOException ex)
        {
            System.out.println(ex);
        }
        return bis.toByteArray();
    }

    public synchronized int getSum()
    {
        ByteArrayOutputStream bis = new ByteArrayOutputStream();
        try
        {
            InputStream is = new URL(url).openStream();
            byte[] bytebuff = new byte[4096];
            int read;
            while ((read = is.read(bytebuff)) > 0)
            {
                bis.write(bytebuff, 0, read);
            }
            bisCount = bis.size();
        } catch (IOException ex)
        {
            System.out.println(ex);
        }
        return bisCount;
    }

}
