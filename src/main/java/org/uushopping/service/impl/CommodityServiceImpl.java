package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.CommodityMapper;
import org.uushopping.mapper.StoreMapper;
import org.uushopping.pojo.Commodity;
import org.uushopping.service.ICommodityService;

import java.util.List;
@Service
public class CommodityServiceImpl implements ICommodityService {
    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> getAllCommodity() {
        return commodityMapper.getAllCommodity();
    }

    @Override
    public List<Commodity> search(String arg0) {
        return commodityMapper.search(arg0);
    }

    @Override
    public String getFlag(int commodityId) {
        return commodityMapper.getFlag(commodityId);
    }

    @Override
    public void setFlag(String flag, int commodityId) {
        commodityMapper.setFlag(flag,commodityId);
    }
}
