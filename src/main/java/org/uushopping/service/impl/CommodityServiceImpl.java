package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.CommodityMapper;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.CommodityImage;

import org.uushopping.pojo.Commodity_Image;


import org.uushopping.pojo.CommodityInfo;

import org.uushopping.pojo.HotCommodity;
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

    @Override
    public List<String> getCommodityType() {
        List<String> strings = commodityMapper.getCommodityType();
        return strings;
    }

    @Override
    public List<HotCommodity> selectHotCommodity() {
        List<HotCommodity> hotCommodities = commodityMapper.getHotCommodity();
        return hotCommodities;
    }

    @Override
    public List<HotCommodity> selectShoe() {
        List<HotCommodity> shoes = commodityMapper.selectShoe();
        return shoes;
    }

    @Override
    public CommodityInfo selectCommodityById(int commodityId) {
        CommodityInfo commodity = commodityMapper.selectCommodityById(commodityId);
        return commodity;
    }
    public Commodity selectOldCommodityById(int commodityId) {
        Commodity commodity = commodityMapper.selectOldCommodityById(commodityId);
        return commodity;
    }

    @Override
    public List<Commodity> getCommodityByClass(String commodityType) {
        return commodityMapper.getCommodityByClass(commodityType);
    }

    @Override
    public List<Integer> getStoreByClass(String commodityType) {
        return commodityMapper.getStoreByClass(commodityType);
    }

    @Override
    public CommodityImage getCommodityImageByCommodityId(int commodityImageId) {
        return commodityMapper.getCommodityImageByCommodityId(commodityImageId);
    }

    @Override
    public List<Commodity_Image> getCommodity_Image(String commodityType) {
        return commodityMapper.getCommodity_Image(commodityType);
    }

    @Override
    public List<Commodity_Image> getALLCommodity_Image() {
        return commodityMapper.getALLCommodity_Image();
    }
}
