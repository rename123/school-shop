package cn.reminis.o2o.service;

import cn.reminis.o2o.dto.ShopExecution;
import cn.reminis.o2o.entity.Shop;

import java.io.InputStream;

/**
 * @author sun
 * @date 2020-07-12 22:01
 * @description
 */
public interface ShopService {

    /**
     * 通过shopId获取店铺信息
     * @param shopId
     * @return
     */
    Shop getShopById(long shopId);

    /**
     * 注册店铺信息
     * @param shop
     * @param shopImg
     * @param fileName
     * @return
     */
    ShopExecution addShop(Shop shop, InputStream shopImg, String fileName);

    /**
     * 更新店铺信息
     * @param shop
     * @param shopImg
     * @return
     * @throws RuntimeException
     */
    ShopExecution modifyShop(Shop shop, InputStream shopImg, String fileName);

    /**
     * 店铺分页条件列表
     * @param shopCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
}
