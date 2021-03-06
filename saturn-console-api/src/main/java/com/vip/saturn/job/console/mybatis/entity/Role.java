package com.vip.saturn.job.console.mybatis.entity;

import java.util.List;

/**
 * @author hebelala
 */
public class Role extends EntityCommonFields {

	private String roleKey;
	private String roleName;
	private String description;

	private List<RolePermission> rolePermissions;

	public String getRoleKey() {
		return roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<RolePermission> getRolePermissions() {
		return rolePermissions;
	}

	public void setRolePermissions(List<RolePermission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}
}
