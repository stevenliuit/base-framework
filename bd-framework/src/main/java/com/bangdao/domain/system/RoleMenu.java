package com.bangdao.domain.system;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 角色和菜单关联 sys_role_menu
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleMenu {
    /**
     * 角色ID
     */
    private Long roleId;
    /**
     * 菜单ID
     */
    private Long menuId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "RoleMenu [roleId=" + roleId + ", menuId=" + menuId + "]";
    }

}
