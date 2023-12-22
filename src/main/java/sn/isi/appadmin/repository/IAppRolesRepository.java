package sn.isi.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.adminapp.entities.AppRoles;

public interface IAppRolesRepository extends JpaRepository<AppRoles, Long> {
    public AppRoles findByRoleName(String roleName);
}
