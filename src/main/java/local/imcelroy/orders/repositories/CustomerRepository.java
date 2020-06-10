package local.imcelroy.orders.repositories;

import local.imcelroy.orders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers, Long> {
}
