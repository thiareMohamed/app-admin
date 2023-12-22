package sn.isi.appadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.appadmin.entities.AppUserEntity;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
    public AppUserEntity findByEmail(String email);
}
