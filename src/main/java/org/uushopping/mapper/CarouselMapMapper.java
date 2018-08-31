package org.uushopping.mapper;

import org.springframework.stereotype.Repository;
import org.uushopping.pojo.CarouselMap;

import java.util.List;
@Repository
public interface CarouselMapMapper {
    // 从数据库查找轮播图
    public List<CarouselMap> findAllCarousel();
    // 切换轮播图状态
    public void takeFlag(String carouselMapFlag, int carouselMapOrder , int carouselMapId );
    // 查询轮播图状态
    public String getFlag(int carouselMapId);
    // 查询轮播图序号
    public int getOrder(int carouselMapId);
    // 统计不同状态的图的计数
    public int getCountFlag(String carouselMapFlag);
    // 上传轮播图
    public void uploadCarouselAddress(String address,String date);
}
