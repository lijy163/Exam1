package com.hand.dto;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 16:23
 */
public class Address extends IdEntity {
    private  String  city;
    private  String country;
    private  Long userId;


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", userId=" + userId +
                ", id=" + id +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
