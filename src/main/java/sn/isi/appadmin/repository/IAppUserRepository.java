package sn.isi.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<sn.isi.adminapp.entities.AppUserEntity, Long> {
    public sn.isi.adminapp.entities.AppUserEntity findByEmail(String email);
}
