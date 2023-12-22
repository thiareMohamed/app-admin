package sn.isi.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<sn.isi.adminapp.entities.ProductEntity, Long> {

}
