package cn.grandtime.demo.demo3;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
public class RenameTest {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<String> files = FileUtil.listFileNames("/Users/laiweijia/Downloads/美图A");

        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).contains("mmexport")) {

                long lt = new Long(files.get(i).substring(13, 26));
                Date date = new Date(lt);
                File file = new File("/Users/laiweijia/Downloads/美图A/" + files.get(i));
                FileUtil.rename(file, simpleDateFormat.format(date) + " " + RandomUtil.randomInt(10, 90) + ".jpeg", true);

            }
        }


    }
}
