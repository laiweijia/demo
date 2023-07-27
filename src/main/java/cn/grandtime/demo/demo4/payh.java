package cn.grandtime.demo.demo4;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;

@Slf4j
public class payh {


    public static void main(String[] args) {

//        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("C:/Users/Administrator/Desktop/中石化供应商发票统计2021全年2.xlsx"), 0);
//
//        log.info("完成");
        try {

            String fileName = "C:/Users/laiweijia/Downloads/中石化供应商发票统计2021全年3.xlsx";   //修改d盘的aaa.xlsx文件
            XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(fileName));
            String fillStr = "";    //存储aaa文件里的数据
            String[] fillSplit = null;
            XSSFSheet xSheet = xwb.getSheetAt(0);  //获取excel表的第一个sheet
            for (int i = 1; i <= xSheet.getLastRowNum(); i++) {  //遍历所有的行
                if (xSheet.getRow(i) == null) { //这行为空执行下次循环
                    continue;
                }

                for (int j = 2; j <= xSheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    //遍历当前行的所有列
                    if (j > 2 && j % 2 == 1) {
                        XSSFCell cell = xSheet.getRow(i).getCell(j);
                        if (xSheet.getRow(i).getCell(j) == null) {//为空执行下次循环
                            continue;
                        }
                        fillStr = (xSheet.getRow(i)).getCell(j).toString();//获取当前单元格的数据
                        if (StringUtils.isEmpty(fillStr)) {
                            continue;
                        }
                        BigDecimal anInt = new BigDecimal(fillStr);
//                        Double anInt = Double.valueOf(fillStr);
                        String s = null;
                        if (anInt.compareTo(new BigDecimal("0")) == 0) {
                            s = "A1";
                        } else if (anInt.compareTo(new BigDecimal("100000")) == -1 && anInt.compareTo(new BigDecimal("0")) == 1) {
                            s = "A2";
                        } else if ((anInt.compareTo(new BigDecimal("500000")) == -1 && anInt.compareTo(new BigDecimal("100000")) == 1) || anInt.compareTo(new BigDecimal("100000")) == 0) {
                            s = "A3";
                        } else if ((anInt.compareTo(new BigDecimal("1000000")) == -1 && anInt.compareTo(new BigDecimal("500000")) == 1) || anInt.compareTo(new BigDecimal("500000")) == 0) {
                            s = "A4";
                        } else if ((anInt.compareTo(new BigDecimal("5000000")) == -1 && anInt.compareTo(new BigDecimal("1000000")) == 1) || anInt.compareTo(new BigDecimal("1000000")) == 0) {
                            s = "A5";
                        } else if ((anInt.compareTo(new BigDecimal("10000000")) == -1 && anInt.compareTo(new BigDecimal("5000000")) == 1) || anInt.compareTo(new BigDecimal("5000000")) == 0) {
                            s = "A6";
                        } else if ((anInt.compareTo(new BigDecimal("50000000")) == -1 && anInt.compareTo(new BigDecimal("10000000")) == 1) || anInt.compareTo(new BigDecimal("10000000")) == 0) {
                            s = "A7";
                        } else if ((anInt.compareTo(new BigDecimal("100000000")) == -1 && anInt.compareTo(new BigDecimal("50000000")) == 1) || anInt.compareTo(new BigDecimal("50000000")) == 0) {
                            s = "A8";
                        } else if ((anInt.compareTo(new BigDecimal("200000000")) == -1 && anInt.compareTo(new BigDecimal("100000000")) == 1) || anInt.compareTo(new BigDecimal("100000000")) == 0) {
                            s = "A9";
                        } else if ((anInt.compareTo(new BigDecimal("500000000")) == -1 && anInt.compareTo(new BigDecimal("200000000")) == 1) || anInt.compareTo(new BigDecimal("200000000")) == 0) {
                            s = "A10";
                        } else if ((anInt.compareTo(new BigDecimal("1000000000")) == -1 && anInt.compareTo(new BigDecimal("500000000")) == 1) || anInt.compareTo(new BigDecimal("500000000")) == 0) {
                            s = "A11";
                        } else if ((anInt.compareTo(new BigDecimal("5000000000")) == -1 && anInt.compareTo(new BigDecimal("1000000000")) == 1) || anInt.compareTo(new BigDecimal("1000000000")) == 0) {
                            s = "A12";
                        } else if ((anInt.compareTo(new BigDecimal("10000000000")) == -1 && anInt.compareTo(new BigDecimal("5000000000")) == 1) || anInt.compareTo(new BigDecimal("5000000000")) == 0) {
                            s = "A13";
                        } else if ((anInt.compareTo(new BigDecimal("50000000000")) == -1 && anInt.compareTo(new BigDecimal("10000000000")) == 1) || anInt.compareTo(new BigDecimal("10000000000")) == 0) {
                            s = "A14";
                        } else if (anInt.compareTo(new BigDecimal("50000000000")) == 1 || anInt.compareTo(new BigDecimal("50000000000")) == 0) {
                            s = "A15";
                        }

                        XSSFCell xCell = xSheet.getRow(i).getCell(j); //获取单元格对象，这块不能向上边那两句代码那么写，不能用createXXX，用的话会只把第一列的数据改掉
                        xCell.setCellValue(s);//修改数据，看数据是否和字段集合中的数据匹配，不匹配使用元数据
                    }
                }
            }

            FileOutputStream out = new FileOutputStream(fileName);
            xwb.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


