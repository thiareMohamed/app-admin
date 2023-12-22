package sn.isi.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.adminapp.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
