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
        boolean b = sftp.upload("/data/image/laiweijia/", file);
        log.info(String.valueOf(b));
    }
}
