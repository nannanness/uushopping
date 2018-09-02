package org.uushopping.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.uushopping.pojo.*;

import java.util.List;
@Repository
public interface CommodityMapper {
    public List<Commodity> getAllCommodity();

    public List<Commodity> search(String arg0);

    public String getFlag(int commodityId);

    public void setFlag(String flag, int commodityId);


    //根据商品的id查找商品
    public CommodityInfo selectCommodityById (int commodityId);

    //根据商品的id查找商品
    public Commodity selectOldCommodityById (int commodityId);
    //查询商品中的分类
    @Select("SELECT DISTINCT commodityType from commodity;")
    public List<String> getCommodityType ();
    //查询热卖的商品
    @Select("SELECT imageAddress,commodityName,commodityId,storeId,commodityPrice FROM commodity c ,commodityimage ci WHERE ci.commodityImageId=c.commodityImageId  LIMIT 0 ,6;")
    public List<HotCommodity> getHotCommodity();
    //鞋
    @Select("SELECT imageAddress,commodityName,commodityId,storeId,commodityPrice,salesVolume FROM commodity c ,commodityimage ci WHERE ci.commodityImageId=c.commodityImageId AND commodityType='鞋' LIMIT 0,6")
    public List<HotCommodity> selectShoe();

    @Select("select * from commodity where commodityType = #{arg0};")
    public List<Commodity> getCommodityByClass(String commodityType);

    @Select("select DISTINCT storeId from commodity where commodityType = #{arg0};")
    public List<Integer> getStoreByClass(String commodityType);

    @Select("select * from commodityimage where commodityImageId = #{arg0};")
    public CommodityImage getCommodityImageByCommodityId(int commodityImageId);

    @Select("select t1.* , t2.imageAddress from commodity t1, commodityimage t2 where t1.commodityImageId = t2.commodityImageId and t1.commodityType = #{arg0};")
    public List<Commodity_Image> getCommodity_Image(String commodityType);

    @Select("select t1.* , t2.imageAddress from commodity t1, commodityimage t2 where t1.commodityImageId = t2.commodityImageId;")
    public List<Commodity_Image> getALLCommodity_Image();

}
