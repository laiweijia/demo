package cn.grandtime.demo.demo1;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.io.FileUtil;

import java.io.File;

public class Base64FileTest {
    public static void main(String[] args) {
        File file = FileUtil.file("/Users/laiweijia/Downloads/2.docx");
        FileUtil.writeUtf8String(Base64.encode(file), "/Users/laiweijia/Downloads/2.txt");
    }
}
