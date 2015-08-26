/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockQueTest;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author pagh
 */
public class TTaker extends Thread
{

//    private Stack stack;

    private BlockingQueue abe = new ArrayBlockingQueue(10000);
    
    public TTaker(BlockingQueue abe)
    {
        this.abe = abe;
    }

//    public TTaker(Stack stack)
//    {
//        this.stack = stack;
//    }

    public void run()
    {
        while (true)
        {
            taker(abe);
        }
    }
    
    public void taker(BlockingQueue abe)
    {
                abe.poll();
                System.out.println(abe.size());
    }

//    public synchronized void taker(Stack stack)
//    {
//        while (!stack.empty())
//        {
//         stack.pop();
//            System.out.println("Taker har poppet stacken!!");
//        }

//    }
}
