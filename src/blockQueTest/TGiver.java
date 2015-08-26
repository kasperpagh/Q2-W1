/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockQueTest;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author pagh
 */
public class TGiver extends Thread
{
    private BlockingQueue abe = new ArrayBlockingQueue(10000);
    private Object bubber = new Object();

    public TGiver(BlockingQueue abe)
    {
        this.abe = abe;
    }
//    Object abe = new Object();
//
//    private Stack stack;
//
//    public TGiver(Stack stack)
//    {
//        this.stack = stack;
//    }

    public void run()
    {
        while (true)
        {
            giver(abe);
        }
    }
    
    public void giver(BlockingQueue abe)
    {
        abe.offer(bubber);
        System.out.println(abe.size());
    }

//    public synchronized void giver(Stack stack)
//    {
//        while (true)
//        {
//            stack.add(abe);
//            System.out.println("Giver har lagt et element ind!!");
//        }
//    }
}
