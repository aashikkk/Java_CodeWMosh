package concurrency;

import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private boolean isDone;
    private LongAdder totalBytes = new LongAdder(); //
    private int totalFiles;

    public void incrementTotalBytes(){
            totalBytes.increment(); //
    }

    public void incrementTotalFiles(){
            totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes.intValue(); // sum()
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