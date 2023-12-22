package sn.isi.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.adminapp.entities.AppUser;

public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByEmail(String email);
}
