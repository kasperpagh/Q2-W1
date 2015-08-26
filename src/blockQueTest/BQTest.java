package blockQueTest;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author pagh
 */
public class BQTest
{

    public static void main(String[] args)
    {
//        Stack stack = new Stack();
        BlockingQueue abe = new ArrayBlockingQueue(10000);
//        for(int i = 0; i < 20; i++)
//        {
//            stack.add(new Object());
//        }
        TTaker taker = new TTaker(abe);
        TGiver giver = new TGiver(abe);
        
        taker.start();
        giver.start();

    }

}
