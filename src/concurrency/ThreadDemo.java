package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ThreadDemo {
    public static void show(){
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while(!status.isDone()) {}
            System.out.println(status.getTotalBytes());
        });
        // when we run this we cannot run other thread, bcz loop keep running until finish, but there is a better way to do this

        thread1.start();
        thread2.start();

    }
}
