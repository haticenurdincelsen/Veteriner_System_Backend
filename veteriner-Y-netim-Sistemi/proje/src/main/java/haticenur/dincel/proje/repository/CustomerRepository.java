package haticenur.dincel.proje.repository;

import haticenur.dincel.proje.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByNameAndMail(String name, String mail);

    List<Customer> findByNameContaining(String name);
}