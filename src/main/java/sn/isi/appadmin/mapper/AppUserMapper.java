package sn.isi.appadmin.mapper;

import org.mapstruct.Mapper;
import sn.isi.appadmin.dto.AppUser;
import sn.isi.appadmin.entities.AppUserEntity;

@Mapper
public interface AppUserMapper {
    AppUser toAppUser(AppUserEntity appUserEntity);
    AppUserEntity fromAppUser(AppUser appUser);
}
