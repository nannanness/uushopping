package org.uushopping.mapper;

import org.springframework.stereotype.Repository;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.Store;

import java.util.List;
@Repository
public interface CommodityMapper {
    public List<Commodity> getAllCommodity();

    public List<Commodity> search(String arg0);

    public String getFlag(int commodityId);

    public void setFlag(String flag, int commodityId);
}
