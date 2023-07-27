package cn.grandtime.demo.demo2;

import cn.hutool.extra.ssh.JschUtil;
import cn.hutool.extra.ssh.Sftp;
import com.jcraft.jsch.Session;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class SftpTest {

    public static void main(String[] args) {


        Session session = JschUtil.getSession("10.1.2.87", 62236, "dxhy1", "dxhy");
        Sftp sftp = new Sftp(session);
        File file = new File("C:/Users/laiweijia/Pictures/2014-Toyota-Land-Cruiser-Prado-02.JPG");
        sftp.upload("/data/image/laiweijia/", file);


//        ExecutorService threadPool = Executors.newFixedThreadPool(10);
//        CountDownLatch countDownLatch = new CountDownLatch(10);
//        Lock lock = new ReentrantLock();
//
//        for (int i = 0; i < 10; i++) {
//            int finalI = i;
//            threadPool.submit(() -> {
//                try {
//
//                    log.info(String.valueOf(finalI));
//                    Session session = JschUtil.getSession("10.1.2.87", 62236, "dxhy1", "dxhy");
//                    Sftp sftp = new Sftp(session);
//                    File file = new File("C:/Users/laiweijia/Pictures/2014-Toyota-Land-Cruiser-Prado-02.JPG");
//                    sftp.upload("/data/image/laiweijia/" + finalI + ".JPG", file);
//                    countDownLatch.countDown();
//                    return 200;
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    return 500;
//                } finally {
//
//                }
//
//            });
//        }
//
//
//        try {
//            countDownLatch.await(60L, TimeUnit.SECONDS);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            threadPool.shutdown();
//        }
    }
}
