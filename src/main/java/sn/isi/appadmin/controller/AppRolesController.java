package sn.isi.appadmin.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sn.isi.appadmin.dto.AppRoles;
import sn.isi.appadmin.service.AppRolesService;

import java.util.List;

@RestController
@RequestMapping("/roles")
@AllArgsConstructor
@NoArgsConstructor
public class AppRolesController {
    private AppRolesService appRolesService;

    @GetMapping
    public List<AppRoles> getAppRoles() {
        return appRolesService.getAppRoles();
    }

    @GetMapping("/{id}")
    public AppRoles getAppRoles(@PathVariable("id") int id) {
        return appRolesService.getAppRole(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AppRoles createAppRoles(@Valid @RequestBody AppRoles appRoles) {
        return appRolesService.createAppRoles(appRoles);
    }

    @PutMapping("/{id}")
    public AppRoles updateAppRoles(@PathVariable("id") int id, @Valid @RequestBody AppRoles appRoles) {
        return appRolesService.updateAppRoles(id, appRoles);
    }

    @DeleteMapping("/{id}")
    public void deleteAppRoles(@PathVariable("id") int id) {
        appRolesService.deleteAppRoles(id);
    }
}
