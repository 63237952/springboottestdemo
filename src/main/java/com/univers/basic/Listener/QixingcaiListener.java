package com.univers.basic.Listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.univers.basic.entity.Qixingcai;
import com.univers.basic.entity.easyexcel.Qixingcai_excel;
import com.univers.basic.service.QixingcaiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QixingcaiListener extends AnalysisEventListener {
    @Autowired
    private QixingcaiService qixingcaiService;
    @Override
    public void invoke(Object data, AnalysisContext context) {
        Qixingcai_excel data1 = (Qixingcai_excel) data;
        Qixingcai qixingcai = new Qixingcai();
        BeanUtils.copyProperties(data1,qixingcai);
        qixingcaiService.addData(qixingcai);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
