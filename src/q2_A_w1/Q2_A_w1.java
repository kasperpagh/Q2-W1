/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_A_w1;

/**
 *
 * @author pagh
 */
public class Q2_A_w1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());
        int endCountBytes;
        T1 t1 = new T1("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        T1 t2 = new T1("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        T1 t3 = new T1("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");
//Del af opg 1.c
//        long start = System.nanoTime();
//        t1.run();
//        t2.run();
//        t3.run();
//       
//        long end = System.nanoTime();
//        System.out.println("Time Sequental (in full secs): " + ((end - start))/1000000000);

        //Del af opg 1.c
//        long startPara = System.nanoTime();
//        t1.start();
//        t2.start();
//        t3.start();
//        try
//        {
//
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e)
//        {
//            System.out.println("Der er problemer i try-catchen!!!");
//        }
//        long endPara = System.nanoTime();
//        System.out.println("Time Sequental (in full secs): " + ((endPara - startPara)) / 1000000000);

// Understående kode er svar på opgave 1.a og 1.b!        
        t1.start();
        System.out.println("T1: " + t1.getSum());
        endCountBytes = t1.getSum();
        t2.start();
        endCountBytes += t2.getSum();
        System.out.println("T2: " +t2.getSum());
        t3.start();
        endCountBytes += t3.getSum();
        System.out.println("T3: " +t3.getSum());
        System.out.println("Her er total number of bytes: " + endCountBytes);
    }

}
