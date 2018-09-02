package org.uushopping.service;

import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.CommodityImage;

import org.uushopping.pojo.Commodity_Image;

import org.uushopping.pojo.CommodityInfo;

import org.uushopping.pojo.HotCommodity;

import java.util.List;

public interface ICommodityService {
    public List<Commodity> getAllCommodity();

    public List<Commodity> search(String arg0);

    public String getFlag(int commodityId);

    public void setFlag(String flag, int commodityId);

    //获取页面的数据
    public List<String> getCommodityType ();

    //查询热卖的商品
    public List<HotCommodity> selectHotCommodity();
    //查询鞋
    public List<HotCommodity> selectShoe();
    //根据商品的id查找商品
    public Commodity selectOldCommodityById (int commodityId);

    public CommodityInfo selectCommodityById (int commodityId);
    //根据分类查询商品
    public List<Commodity> getCommodityByClass(String commodityType);
    //根据分类查询商店
    public List<Integer> getStoreByClass(String commodityType);
    //根据commodityImageId查询商品图片
    public CommodityImage getCommodityImageByCommodityId(int commodityImageId);
    // 带图片的商品
    public List<Commodity_Image> getCommodity_Image(String commodityType);
    // 所有带图片的商品
    public List<Commodity_Image> getALLCommodity_Image();
}
