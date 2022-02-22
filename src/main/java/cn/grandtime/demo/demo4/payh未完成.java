package cn.grandtime.demo.demo4;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class payh未完成 {


    public static void main(String[] args) {

        BigDecimal XA = new BigDecimal(0);
        BigDecimal XB = new BigDecimal(100000);
        BigDecimal XC = new BigDecimal(500000);
        BigDecimal XD = new BigDecimal(1000000);
        BigDecimal XE = new BigDecimal(5000000);
        BigDecimal XF = new BigDecimal(10000000);
        BigDecimal XG = new BigDecimal(50000000);
        BigDecimal XH = new BigDecimal(100000000);
        BigDecimal XI = new BigDecimal(200000000);
        BigDecimal XJ = new BigDecimal(500000000);
        BigDecimal XK = new BigDecimal(1000000000);
        BigDecimal XL = new BigDecimal(2000000000);
        // BigDecimal XL = new BigDecimal(5000000000);
//        BigDecimal XM = new BigDecimal (10000000000);
//        BigDecimal XN = new BigDecimal (50000000000);

        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("C:/Users/laiweijia/Downloads/中石化供应商发票统计2021全年.xlsx"), 0);


        List<List<String>> rows = new ArrayList<>();

        List<List<Object>> xx = reader.read();
        for (int i = 1; i < xx.size(); i++) {
            String z0 = xx.get(i).get(0).toString();
            String z1 = xx.get(i).get(1).toString();
            String z2 = xx.get(i).get(2).toString();
            String z3 = xx.get(i).get(3).toString();
            String z4 = xx.get(i).get(4).toString();
            String z5 = xx.get(i).get(5).toString();
            String z6 = xx.get(i).get(6).toString();
            String z7 = xx.get(i).get(7).toString();
            String z8 = xx.get(i).get(8).toString();
            String z9 = xx.get(i).get(9).toString();
            String z10 = xx.get(i).get(10).toString();
            String z11 = xx.get(i).get(11).toString();
            String z12 = xx.get(i).get(12).toString();
            String z13 = xx.get(i).get(13).toString();
            String z14 = xx.get(i).get(14).toString();
            String z15 = xx.get(i).get(15).toString();
            String z16 = xx.get(i).get(16).toString();
            String z17 = xx.get(i).get(17).toString();
            String z18 = xx.get(i).get(18).toString();
            String z19 = xx.get(i).get(19).toString();
            String z20 = xx.get(i).get(20).toString();
            String z21 = xx.get(i).get(21).toString();
            String z22 = xx.get(i).get(22).toString();
            String z23 = xx.get(i).get(23).toString();
            String z24 = xx.get(i).get(24).toString();
            String z25 = xx.get(i).get(25).toString();
            String z26 = xx.get(i).get(26).toString();
            String z27 = xx.get(i).get(27).toString();


            // 1月
            BigDecimal bigDecimal = new BigDecimal(xx.get(i).get(3).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z3 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z3 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z3 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z3 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z3 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z3 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z3 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z3 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z3 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z3 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z3 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z3 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z3 = "XM";
            }


            // 2月
            bigDecimal = new BigDecimal(xx.get(i).get(5).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z5 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z5 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z5 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z5 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z5 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z5 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z5 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z5 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z5 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z5 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z5 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z5 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z5 = "XM";
            }
//            if (bigDecimal.compareTo(XM) == 1 && bigDecimal.compareTo(XB) == -1) {
//
//            }
//            if (bigDecimal.compareTo(XN) == 1 && bigDecimal.compareTo(XB) == -1) {
//
//            }


            // 3月
            bigDecimal = new BigDecimal(xx.get(i).get(7).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z7 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z7 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z7 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z7 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z7 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z7 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z7 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z7 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z7 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z7 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z7 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z7 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z7 = "XM";
            }

            // 4月
            if (xx.get(i).get(9) == null || xx.get(i).get(9).equals("")) {
                z9 = "9";
            }
            bigDecimal = new BigDecimal(xx.get(i).get(9).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z9 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z9 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z9 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z9 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z9 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z9 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z9 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z9 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z9 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z9 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z9 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z9 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z9 = "XM";
            }
            // 5月
            xx.get(i).get(11);
            bigDecimal = new BigDecimal(xx.get(i).get(11).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z11 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z11 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z11 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z11 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z11 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z11 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z11 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z11 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z11 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z11 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z11 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z11 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z11 = "XM";
            }
            // 6月
            xx.get(i).get(13);
            bigDecimal = new BigDecimal(xx.get(i).get(13).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z13 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z13 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z13 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z13 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z13 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z13 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z13 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z13 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z13 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z13 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z13 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z13 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z13 = "XM";
            }
            // 7月
            xx.get(i).get(15);
            bigDecimal = new BigDecimal(xx.get(i).get(15).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z15 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z15 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z15 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z15 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z15 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z15 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z15 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z15 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z15 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z15 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z15 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z15 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z15 = "XM";
            }
            // 8月
            xx.get(i).get(17);
            bigDecimal = new BigDecimal(xx.get(i).get(17).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z17 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z17 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z17 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z17 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z17 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z17 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z17 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z17 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z17 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z17 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z17 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z17 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z17 = "XM";
            }
            // 9月
            xx.get(i).get(19);
            bigDecimal = new BigDecimal(xx.get(i).get(19).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z19 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z19 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z19 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z19 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z19 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z19 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z19 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z19 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z19 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z19 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z19 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z19 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z19 = "XM";
            }
            // 10月
            xx.get(i).get(21);
            bigDecimal = new BigDecimal(xx.get(i).get(21).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z21 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z21 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z21 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z21 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z21 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z21 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z21 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z21 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z21 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z21 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z21 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z21 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z21 = "XM";
            }
            // 11月
            xx.get(i).get(23);
            bigDecimal = new BigDecimal(xx.get(i).get(23).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z23 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z23 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z23 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z23 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z23 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z23 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z23 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z23 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z23 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z23 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z23 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z23 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z23 = "XM";
            }
            // 12月
            xx.get(i).get(25);
            bigDecimal = new BigDecimal(xx.get(i).get(25).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z25 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z25 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z25 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z25 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z25 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z25 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z25 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z25 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z25 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z25 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z25 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z25 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z25 = "XM";
            }
            // 合计金额

            if (xx.get(i).get(27) == null || xx.get(i).get(27).equals("")) {
                z27 = "0";
            }

            bigDecimal = new BigDecimal(xx.get(i).get(27).toString());
            if (bigDecimal.compareTo(XA) == 0) {
                z27 = "XA";
            }
            if (bigDecimal.compareTo(XA) == 1 && bigDecimal.compareTo(XB) == -1) {
                z27 = "XB";
            }
            if (bigDecimal.compareTo(XB) == 1 && bigDecimal.compareTo(XC) == -1) {
                z27 = "XC";
            }
            if (bigDecimal.compareTo(XC) == 1 && bigDecimal.compareTo(XD) == -1) {
                z27 = "XD";
            }
            if (bigDecimal.compareTo(XD) == 1 && bigDecimal.compareTo(XE) == -1) {
                z27 = "XE";
            }
            if (bigDecimal.compareTo(XE) == 1 && bigDecimal.compareTo(XF) == -1) {
                z27 = "XF";
            }
            if (bigDecimal.compareTo(XF) == 1 && bigDecimal.compareTo(XG) == -1) {
                z27 = "XG";
            }
            if (bigDecimal.compareTo(XG) == 1 && bigDecimal.compareTo(XH) == -1) {
                z27 = "XH";
            }
            if (bigDecimal.compareTo(XH) == 1 && bigDecimal.compareTo(XI) == -1) {
                z27 = "XI";
            }
            if (bigDecimal.compareTo(XI) == 1 && bigDecimal.compareTo(XJ) == -1) {
                z27 = "XJ";
            }
            if (bigDecimal.compareTo(XJ) == 1 && bigDecimal.compareTo(XK) == -1) {
                z27 = "XK";
            }
            if (bigDecimal.compareTo(XK) == 1 && bigDecimal.compareTo(XL) == -1) {
                z27 = "XL";
            }
            if (bigDecimal.compareTo(XL) == 1) {
                z27 = "XM";
            }


            List<String> row = CollUtil.newArrayList(
                    z0,
                    z1,
                    z2,
                    z3,
                    z4,
                    z5,
                    z6,
                    z7,
                    z8,
                    z9,
                    z10,
                    z11,
                    z12,
                    z13,
                    z14,
                    z15,
                    z16,
                    z17,
                    z18,
                    z19,
                    z20,
                    z21,
                    z22,
                    z23,
                    z24,
                    z25,
                    z26,
                    z27

            );

            rows.add(row);

            log.info(String.valueOf(i));
        }


        List<List<String>> rows2 = CollUtil.newArrayList(rows);
        ExcelWriter writer = ExcelUtil.getWriter("C:/Users/laiweijia/Downloads/中石化供应商发票统计2021全年3.xlsx");
        writer.write(rows2, true);
        writer.close();

        log.info("完成完成完成完成完成完成完成完成完成完成完成完成完成完成完成");
    }
}
