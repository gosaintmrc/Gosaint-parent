package com.gosaint.facade;

import com.gosaint.core.query.BaseQuery;
import com.gosaint.core.utils.Page;
import com.gosaint.domain.Product;

/**
 * @Authgor: gosaint
 * @Description:商品中心对外的接口,类似于dubbo的公共的API接口
 * @Date Created in 17:26 2018/3/18
 * @Modified By:
 */
public interface ProductCenterService {
    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    Product getProduct(Long id);

    /**
     * 获取商品的分页信息
     * @param baseQuery
     * @return
     */
    Page<Product> getProductPage(BaseQuery baseQuery);
}
