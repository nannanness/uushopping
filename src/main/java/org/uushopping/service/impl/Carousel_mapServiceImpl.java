package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.CarouselMapMapper;
import org.uushopping.pojo.CarouselMap;
import org.uushopping.service.ICarousel_mapManagerService;

import java.util.List;

@Service("carouselMap")
public class Carousel_mapServiceImpl implements ICarousel_mapManagerService {
    @Autowired
    CarouselMapMapper carouselMapMapper;
    @Override
    public List<CarouselMap> findAllCarousel() {
        return carouselMapMapper.findAllCarousel();
    }

    @Override
    public void takeFlag(String carouselMapFlag, int carouselMapOrder , int carouselMapId ){
        carouselMapMapper.takeFlag(carouselMapFlag,carouselMapOrder,carouselMapId);
    }

    @Override
    public String getFlag(int carouselMapId) {
        return carouselMapMapper.getFlag(carouselMapId);
    }

    @Override
    public int getOrder(int carouselMapId) {
        return carouselMapMapper.getOrder(carouselMapId);
    }

    @Override
    public int getCountFlag(String carouselMapFlag) {
        return carouselMapMapper.getCountFlag(carouselMapFlag);
    }

    @Override
    public void uploadCarouselAddress(String address, String date) {
        carouselMapMapper.uploadCarouselAddress(address,date);
    }

    @Override
    public void deleteCarouselMap(int id) {
        carouselMapMapper.deleteCarouselMap(id);
    }
}
