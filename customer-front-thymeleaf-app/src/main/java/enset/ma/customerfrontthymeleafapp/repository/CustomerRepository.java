package enset.ma.customerfrontthymeleafapp.repository;


import enset.ma.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
