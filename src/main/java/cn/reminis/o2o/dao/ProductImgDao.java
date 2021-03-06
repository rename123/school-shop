package cn.reminis.o2o.dao;

import cn.reminis.o2o.entity.ProductImg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author sun
 * @date 2020-07-24 20:07
 * @description
 */
public interface ProductImgDao {

    /**
     * 批量添加商品详情图片
     * @param productImgList
     * @return
     */
    int batchInsertProductImg(@Param("productImgList") List<ProductImg> productImgList);

    /**
     * 删除指定商品下的详情图
     * @param productId
     * @return
     */
    int deleteProductImgByProductId(Long productId);

    /**
     * 通过商品id，获取商品详情图
     * @param productId
     * @return
     */
    List<ProductImg> queryProductImgList(Long productId);
}
