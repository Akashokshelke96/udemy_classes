package com.sourceCode.Lesson37;

public class Sequence {
    private int value = 0;

//    public int getNext(){ //this is the function which is to be shared amongst two THREADS ...just incrementing the value and returning it.
//        value++; //since this contains 3 operations in between which the control might shift to another thread, and irregular output might return
//        return value;  //so we used synchronised(this){ code    } to tackle this fallback
//}
    public int getNext(){
        synchronized (this) {
            value++; //
            return value;
        }
    }
}
