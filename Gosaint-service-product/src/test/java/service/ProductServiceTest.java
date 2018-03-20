package service;

import com.gosaint.domain.Product;
import com.gosaint.domain.User;
import com.gosaint.service.IProductService;
import com.gosaint.service.IUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:44 2018/3/19
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:service-product.xml"})
public class ProductServiceTest {
    @Autowired
    private IProductService service;
    @Autowired
    private IUserService userService;
    @Test
    public void testservice(){
        Product product = service.get(1L);
        System.out.println("result");
        User user = userService.get(1L);
        System.out.println(user);
        System.out.println(product);

    }
}
