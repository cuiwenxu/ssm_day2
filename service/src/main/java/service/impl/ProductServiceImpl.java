package service.impl;


import dao.IProductDao;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IProductService;
import java.util.List;


@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductDao iproductDao;

    @Override
    public List<Product> findAll() throws Exception {
        return iproductDao.findAll();
    }

}
