package com.maven.domain;

import java.util.List;

public class Role {
    private String id;

    private String roleName;    //角色名称
    private String roleDesc;    //角色说明

    private String roleDescStr;

    private List<Permission> permissions;
    private List<UserInfo> userInfoList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleDescStr() {
        return roleDescStr;
    }

    public void setRoleDescStr(String roleDescStr) {
        this.roleDescStr = roleDescStr;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }
}
