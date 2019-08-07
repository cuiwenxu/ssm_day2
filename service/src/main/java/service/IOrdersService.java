package service;

import model.Orders;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll() throws Exception;
    List<Orders> findAllByPage(int page, int pageSize) throws Exception;
}
