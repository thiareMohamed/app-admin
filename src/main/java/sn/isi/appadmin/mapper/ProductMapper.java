package sn.isi.appadmin.mapper;

import org.mapstruct.Mapper;
import sn.isi.appadmin.dto.Product;
import sn.isi.appadmin.entities.ProductEntity;

@Mapper
public interface ProductMapper {
    Product toProduct(ProductEntity productEntity);
    ProductEntity fromProduct(Product product);
}
