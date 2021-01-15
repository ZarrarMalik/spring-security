package com.zarrar.spring.repos;

import com.zarrar.spring.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CouponRepo extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);

}

