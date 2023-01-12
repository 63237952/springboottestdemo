package com.univers.basic.service;

import com.univers.basic.entity.Qixingcai;
import com.univers.basic.entity.vo.QixingcaiVo;

import java.util.List;

public interface QixingcaiService {
    void addData(Qixingcai qixingcai);
    List<Qixingcai> getData(QixingcaiVo qixingcaiVo);
}
