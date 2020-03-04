package com.quanle.pojo;

/**
 * @author quanle
 * @date 2020/3/3 9:14 PM
 */
public class UserOrder {
    private Integer id;
    private String createts;
    private Double total;

    private User user;


    public Integer getId() {
        return id;
    }

    public UserOrder setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCreatets() {
        return createts;
    }

    public UserOrder setCreatets(String createts) {
        this.createts = createts;
        return this;
    }

    public Double getTotal() {
        return total;
    }

    public UserOrder setTotal(Double total) {
        this.total = total;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserOrder setUser(User user) {
        this.user = user;
        return this;
    }
}
