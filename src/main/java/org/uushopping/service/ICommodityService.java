package org.uushopping.service;

import org.uushopping.pojo.Commodity;

import java.util.List;

public interface ICommodityService {
    public List<Commodity> getAllCommodity();

    public List<Commodity> search(String arg0);

    public String getFlag(int commodityId);

    public void setFlag(String flag, int commodityId);
}
