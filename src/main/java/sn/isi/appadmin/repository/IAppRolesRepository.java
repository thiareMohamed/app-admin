package sn.isi.appadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.appadmin.entities.AppRolesEntity;

@Repository
public interface IAppRolesRepository extends JpaRepository<AppRolesEntity, Integer> {
    public AppRolesEntity findByName(String roleName);
}
