package com.gustas.videogamestore.repository;

import com.gustas.videogamestore.domain.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

    List<Checkout> findAllByUserId(Long userId);

}
