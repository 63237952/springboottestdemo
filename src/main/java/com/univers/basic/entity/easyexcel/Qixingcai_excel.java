package com.univers.basic.entity.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;

public class Qixingcai_excel {
    @ExcelProperty(value = {"期数"},index =0)
    private int id;
    @ExcelProperty(value = {"ge"},index =1)
    private int ge;
    @ExcelProperty(value = {"shi"},index =2)
    private int shi;
    @ExcelProperty(value = {"bai"},index =3)
    private int bai;
    @ExcelProperty(value = {"qian"},index =4)
    private int qian;
    @ExcelProperty(value = {"wan"},index =5)
    private int wan;
    @ExcelProperty(value = {"shiwan"},index =6)
    private int shiwan;
    @ExcelProperty(value = {"baiwan"},index =7)
    private int baiwan;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGe() {
        return ge;
    }

    public void setGe(int ge) {
        this.ge = ge;
    }

    public int getShi() {
        return shi;
    }

    public void setShi(int shi) {
        this.shi = shi;
    }

    public int getBai() {
        return bai;
    }

    public void setBai(int bai) {
        this.bai = bai;
    }

    public int getQian() {
        return qian;
    }

    public void setQian(int qian) {
        this.qian = qian;
    }

    public int getWan() {
        return wan;
    }

    public void setWan(int wan) {
        this.wan = wan;
    }

    public int getShiwan() {
        return shiwan;
    }

    public void setShiwan(int shiwan) {
        this.shiwan = shiwan;
    }

    public int getBaiwan() {
        return baiwan;
    }

    public void setBaiwan(int baiwan) {
        this.baiwan = baiwan;
    }


}
