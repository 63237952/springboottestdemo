package com.univers.basic.service.impl;

import com.univers.basic.entity.Qixingcai;
import com.univers.basic.entity.vo.QixingcaiVo;
import com.univers.basic.mapper.QixingcaiMapper;
import com.univers.basic.service.QixingcaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QixingcaiServiceImpl implements QixingcaiService {
    @Autowired
    private QixingcaiMapper qixingcaiMapper;
    @Override
    public void addData(Qixingcai qixingcai) {
        qixingcaiMapper.addData(qixingcai);
    }

    @Override
    public List<Qixingcai> getData(QixingcaiVo qixingcaiVo) {
        List<Qixingcai> data = qixingcaiMapper.getData(qixingcaiVo);
        return data;
    }
}
