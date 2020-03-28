package com.example.demo;

import com.example.demo.entity.Orders;
import com.example.demo.entity.User;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SolrdemoApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    SolrClient solrClient;
    @Test
    public void findUser() throws IOException, SolrServerException {
        List<User> userList = new ArrayList<User>();
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery("*:*");
        solrQuery.setStart(0);
        solrQuery.setRows(3);
        try {
            QueryResponse queryResponse = solrClient.query(solrQuery);
            if (queryResponse != null) {
                userList = queryResponse.getBeans(User.class);
                for (User u : userList) {
                    System.out.println(u.getUsrName() + u.getUsrPassword());
                }
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void findOrders() throws IOException, SolrServerException {
        List<Orders> userList = new ArrayList<Orders>();
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery("*:*");
        solrQuery.setStart(0);
        solrQuery.setRows(3);
        try {
            QueryResponse queryResponse = solrClient.query(solrQuery);
            if (queryResponse != null) {
                userList = queryResponse.getBeans(Orders.class);
                for (Orders u : userList) {
                    System.out.println(u.getOdrId()+"-----" + u.getOdrCustomerNo()+"-----"+u.getOdrAddr());
                }
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        @Test
        public void print() {
            //计量
            int count = 0;
            //总是
            int sum = 0;
            //do循环不管while循环条件，都会执行一次
            do {
                sum += count;
                count++;
                //只要count还满足while,那还会执行一次，直到不满足未止
            } while (count <= 100);

            System.out.println("1~100的和为：" + sum);

        }

}
