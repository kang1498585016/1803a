package com.bw.service;

import com.bw.bean.Par;
import com.bw.mapper.ParMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ParServiceImpl implements ParService{

    @Resource
    private ParMapper parMapper;

    public List list(Map map) {
        return parMapper.list(map);
    }
}
