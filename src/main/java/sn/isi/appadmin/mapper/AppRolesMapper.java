package sn.isi.appadmin.mapper;

import org.mapstruct.Mapper;
import sn.isi.appadmin.dto.AppRoles;
import sn.isi.appadmin.entities.AppRolesEntity;

@Mapper
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRoles);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
