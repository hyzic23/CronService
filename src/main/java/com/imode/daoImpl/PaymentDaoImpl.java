package com.imode.daoImpl;

import com.imode.dao.PaymentDao;
import com.imode.model.PaymentDetails;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Repository
public class PaymentDaoImpl implements PaymentDao {

    //@Qualifier("jdbcProductService")
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public List<PaymentDetails> getAllPayments() {

//        List<Item> items = template.query("select id, name,category from item",(result,rowNum)->new Item(result.getInt("id"),
//                result.getString("name"),result.getString("category")));
//        return items;
        String sql = "select paymentDetailId, CardName, CardNumber, ExpirationDate, SecurityCode from PaymentDetails";
        //List<PaymentDetails> items = (List<PaymentDetails>)jdbcTemplate.queryForObject(sql, PaymentDetails.class);
        List items = jdbcTemplate.queryForList(sql);
        if(items.size() > 0)
            return items;
        return null;
    }

    @Override
    @Transactional
    public void save(PaymentDetails paymentDetails) {

    }

    @Override
    @Transactional
    public PaymentDetails getPaymentDetailsById(int id) {
        return null;
    }
}
