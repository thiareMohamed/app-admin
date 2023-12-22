package sn.isi.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRolesRepository extends JpaRepository<sn.isi.adminapp.entities.AppRolesEntity, Long> {
    public sn.isi.adminapp.entities.AppRolesEntity findByRoleName(String roleName);
}
