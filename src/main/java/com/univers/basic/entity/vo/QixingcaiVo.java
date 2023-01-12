package com.univers.basic.entity.vo;

public class QixingcaiVo {
    private int id;
    private int ge;
    private int shi;
    private int bai;
    private int qian;
    private int wan;
    private int shiwan;
    private int baiwan;

    @Override
    public String toString() {
        return "QixingcaiVo{" +
                "id=" + id +
                ", ge=" + ge +
                ", shi=" + shi +
                ", bai=" + bai +
                ", qian=" + qian +
                ", wan=" + wan +
                ", shiwan=" + shiwan +
                ", baiwan=" + baiwan +
                '}';
    }

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
