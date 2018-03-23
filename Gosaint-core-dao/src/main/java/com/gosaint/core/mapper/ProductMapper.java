package com.gosaint.core.mapper;

import com.gosaint.core.common.base.BaseMapper;
import com.gosaint.domain.Product;
import com.gosaint.domain.User;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 23:06 2018/3/18
 * @Modified By:
 */
public interface ProductMapper extends BaseMapper<Product> {
    Product findProductById(Long id);
}
