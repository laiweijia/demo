package cn.grandtime.demo.demo4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.apache.ibatis.annotations.Case;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class payh3 {


    public static void main2(String[] args) {

//        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("C:/Users/Administrator/Desktop/中石化供应商发票统计2021全年2.xlsx"), 0);
//
//        log.info("完成");
        try {

            String fileName = "C:/Users/Administrator/Desktop/中石化供应商发票统计2021全年2.xlsx";  //修改d盘的aaa.xlsx文件
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


    public static void main3(String[] args) {
        try {
            String fileName = "C:/Users/Administrator/Desktop/中石化供应商发票统计2021全年2.xlsx";  //修改d盘的aaa.xlsx文件
            XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(fileName));
            String fillStr = "";    //存储aaa文件里的数据
            String[] fillSplit = null;
            String s = null;
            XSSFSheet xSheet = xwb.getSheetAt(0);  //获取excel表的第一个sheet
            for (int i = 1; i <= xSheet.getLastRowNum(); i++) {  //遍历所有的行
                if (xSheet.getRow(i) == null) { //这行为空执行下次循环
                    continue;
                }
                List<Double> list = new ArrayList<>();
                for (int j = 2; j <= xSheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    //遍历当前行的所有列
                    if (j % 2 == 0 && j < 25) {
                        XSSFCell cell = xSheet.getRow(i).getCell(j);
                        if (xSheet.getRow(i).getCell(j) == null) {//为空执行下次循环
                            continue;
                        }
                        fillStr = (xSheet.getRow(i)).getCell(j).toString();//获取当前单元格的数据
                        if (StringUtils.isEmpty(fillStr)) {
                            continue;
                        }
                        Double lo = Double.valueOf(fillStr);

                        list.add(lo);

                    }
                }
                List<BigDecimal> b = new ArrayList<>();
                int a = 0;
                for (int i1 = 0; i1 < list.size(); i1++) {
                    if (list.get(i1) == 0) {
                        a = 1;
                        b.add(new BigDecimal(a));
                        for (int i2 = i1 + 1; i2 < list.size(); i2++) {
                            if (list.get(i2) == 0) {
                                a++;
                                b.add(new BigDecimal(a));
                            } else {
                                break;
                            }
                        }
                    }
                }
                System.out.println(b.toString());
                if (!CollectionUtils.isNotEmpty(b)) {
                    s = "B0";
                    XSSFRow row = xSheet.getRow(i);
                    row.createCell(28).setCellValue(s);
                    continue;
                }
                BigDecimal max = Collections.max(b);
                int intValue = max.intValue();
                if (intValue == 0) {
                    s = "B0";
                } else if (intValue == 1) {
                    s = "B1";
                } else if (intValue == 2) {
                    s = "B2";
                } else if (intValue == 3) {
                    s = "B3";
                } else if (intValue == 4) {
                    s = "B4";
                } else if (intValue == 5) {
                    s = "B5";
                } else if (intValue == 6) {
                    s = "B6";
                } else if (intValue == 7) {
                    s = "B7";
                } else if (intValue == 8) {
                    s = "B8";
                } else if (intValue == 9) {
                    s = "B9";
                } else if (intValue == 10) {
                    s = "B10";
                } else if (intValue == 11) {
                    s = "B11";
                }
                XSSFRow row = xSheet.getRow(i);
                row.createCell(28).setCellValue(s);
//                XSSFCell xCell = xSheet.getRow(i).getCell(28); //获取单
//                // 元格对象，这块不能向上边那两句代码那么写，不能用createXXX，用的话会只把第一列的数据改掉
//                xCell.setCellValue(s);//修改数据，看数据是否和字段集合中的数据匹配，不匹配使用元数据


            }

            FileOutputStream out = new FileOutputStream(fileName);
            xwb.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        {
            try {
                String fileName = "C:/Users/laiweijia/Downloads/中石化供应商发票统计2021全年_金额&隔期标签.xlsx";  //修改d盘的aaa.xlsx文件
                XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(fileName));
                String fillStr = "";    //存储aaa文件里的数据
                String[] fillSplit = null;
                String s = null;
                XSSFSheet xSheet = xwb.getSheetAt(0);  //获取excel表的第一个sheet
                for (int i = 1; i <= xSheet.getLastRowNum(); i++) {  //遍历所有的行
                    if (xSheet.getRow(i) == null) { //这行为空执行下次循环
                        continue;
                    }

                    //遍历当前行的所有列
                    fillStr = (xSheet.getRow(i)).getCell(0).toString();//获取当前单元格的数据
                    String s2 = fillStr.substring(2, 4);

                    if ("11".equals(s2)) {
                        s = "北京市";
                    } else if ("12".equals(s2)) {
                        s = "天津市";
                    } else if ("31".equals(s2)) {
                        s = "上海市";
                    } else if ("50".equals(s2)) {
                        s = "重庆市";
                    } else if ("13".equals(s2)) {
                        s = "河北省";
                    } else if ("41".equals(s2)) {
                        s = "河南省";
                    } else if ("21".equals(s2)) {
                        s = "辽宁省";
                    } else if ("53".equals(s2)) {
                        s = "云南省";
                    } else if ("23".equals(s2)) {
                        s = "黑龙江省";
                    } else if ("43".equals(s2)) {
                        s = "湖南省";
                    } else if ("34".equals(s2)) {
                        s = "安徽省";
                    } else if ("37".equals(s2)) {
                        s = "山东省";
                    } else if ("65".equals(s2)) {
                        s = "新疆维吾尔";
                    } else if ("32".equals(s2)) {
                        s = "江苏省";
                    } else if ("33".equals(s2)) {
                        s = "浙江省";
                    } else if ("36".equals(s2)) {
                        s = "江西省";
                    } else if ("42".equals(s2)) {
                        s = "湖北省";
                    } else if ("45".equals(s2)) {
                        s = "广西壮族";
                    } else if ("62".equals(s2)) {
                        s = "甘肃省";
                    } else if ("14".equals(s2)) {
                        s = "山西省";
                    } else if ("15".equals(s2)) {
                        s = "内蒙古";
                    } else if ("61".equals(s2)) {
                        s = "陕西省";
                    } else if ("22".equals(s2)) {
                        s = "吉林省";
                    } else if ("35".equals(s2)) {
                        s = "福建省";
                    } else if ("52".equals(s2)) {
                        s = "贵州省";
                    } else if ("44".equals(s2)) {
                        s = "广东省";
                    } else if ("63".equals(s2)) {
                        s = "青海省";
                    } else if ("54".equals(s2)) {
                        s = "西藏";
                    } else if ("51".equals(s2)) {
                        s = "四川省";
                    } else if ("64".equals(s2)) {
                        s = "宁夏回族";
                    } else if ("46".equals(s2)) {
                        s = "海南省";
                    }

                    //在第几行添加内容
                    XSSFRow row = xSheet.getRow(i);
                    row.createCell(29).setCellValue(s);

                }

                FileOutputStream out = new FileOutputStream(fileName);
                xwb.write(out);
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}


