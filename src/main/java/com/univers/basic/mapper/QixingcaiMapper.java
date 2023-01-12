package com.univers.basic.mapper;

import com.univers.basic.entity.Qixingcai;
import com.univers.basic.entity.vo.QixingcaiVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QixingcaiMapper {
    public void addData(Qixingcai qixingcai);
    List<Qixingcai> getData(QixingcaiVo qixingcaiVo);
}
