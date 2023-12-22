package sn.isi.appadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.appadmin.entities.ProductEntity;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, Integer> {

}
