package com.gosaint.service.facade.impl;

import com.gosaint.core.query.BaseQuery;
import com.gosaint.core.utils.Page;
import com.gosaint.domain.Product;
import com.gosaint.facade.ProductCenterService;

import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:商品中心基类实现
 * @Date Created in 22:01 2018/3/18
 * @Modified By:
 */
@Service
public class ProductCenterServiceImpl implements ProductCenterService{
    
    public Product getProduct(final Long id) {
        return null;
    }

    public Page<Product> getProductPage(final BaseQuery baseQuery) {
        return null;
    }
}
