package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private volatile boolean isDone;
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();


    public void incrementTotalBytes(){
        synchronized (totalBytesLock){
            totalBytes++;
        }
    }

    public synchronized void incrementTotalFiles(){
            totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}


/*
*  public synchronized boolean isDone() {
        return isDone;
    }

    public synchronized void done() {
        isDone = true;
    }
    *
    * TO fix temporary solution, we can use synchronized keyword to make sure that only one thread can access this method at a time
    * but there is a better way
    * use volatile keyword for boolean
*
* */
