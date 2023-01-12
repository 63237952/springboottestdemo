package com.univers.basic.controller;

import com.alibaba.excel.EasyExcel;
import com.univers.basic.Listener.QixingcaiListener;
import com.univers.basic.entity.Qixingcai;
import com.univers.basic.entity.easyexcel.Qixingcai_excel;
import com.univers.basic.entity.vo.QixingcaiVo;
import com.univers.basic.service.QixingcaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/qixingcai")
public class QixingcaiController {
    @Autowired
    private QixingcaiListener qixingcaiListener;
    @Autowired
    private QixingcaiService qixingcaiService;
    @RequestMapping(value = "/addData",method = RequestMethod.POST)
    public @ResponseBody
    String addData(MultipartFile file){
        try{
            EasyExcel.read(file.getInputStream(), Qixingcai_excel.class,qixingcaiListener).sheet().doRead();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping(value = "/getQixingcaiData",method = RequestMethod.POST)
    public List<Qixingcai> getData(@RequestBody(required = false)QixingcaiVo qixingcaiVo){
        System.out.println(qixingcaiVo);
        List<Qixingcai> data = qixingcaiService.getData(qixingcaiVo);
        return data;
    }
}
