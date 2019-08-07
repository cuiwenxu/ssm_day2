package service.impl;

import com.github.pagehelper.PageHelper;
import dao.IOrdersDao;
import model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IOrdersService;
import java.util.List;


@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll() throws Exception{
        return ordersDao.findAll();
    }

    @Override
    public List<Orders> findAllByPage(int page, int pageSize) throws Exception {
        PageHelper.startPage(page, pageSize);
        return ordersDao.findAll();
    }
}
