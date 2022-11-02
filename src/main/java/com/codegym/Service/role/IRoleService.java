package com.codegym.Service.role;

import com.codegym.Service.IGeneralService;
import com.codegym.model.Role;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}
