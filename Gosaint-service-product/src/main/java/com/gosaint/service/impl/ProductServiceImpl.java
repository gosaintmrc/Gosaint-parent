package com.gosaint.service.impl;

import java.util.List;

import com.gosaint.core.mapper.ProductMapper;
import com.gosaint.core.query.BaseQuery;
import com.gosaint.core.utils.Page;
import com.gosaint.domain.Product;
import com.gosaint.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:26 2018/3/18
 * @Modified By:
 */
@Service
public class ProductServiceImpl implements IProductService{
    /** 商品dao层接口依赖*/
    @Autowired
    private ProductMapper mapper;

    public void save(final Product o) {

    }

    public void savePart(final Product o) {

    }

    public void delete(final Long id) {

    }

    public void update(final Product o) {

    }

    public void updatePart(final Product o) {

    }

    public Product get(final Long id) {
        return null;
    }

    public int queryTotal(final BaseQuery query) {
        return 0;
    }

    public List<Product> query(final BaseQuery query) {
        return null;
    }

    public Page<Product> queryPage(final BaseQuery query) {
        return null;
    }
}
