package service.impl;

import service.RoleService;
import dao.RoleDao;
import dao.impl.RoleDaoImpl;
import entity.Role;

public class RoleServiceImpl implements RoleService {
	private RoleDao roleDao = new RoleDaoImpl();
	public Role createRole(Role role) {
		return roleDao.createRole(role);
	}

	public void deleteRole(Long roleId) {
		roleDao.deleteRole(roleId);
	}

	public void correlationPermissions(Long roleId, Long... permissionIds) {
		roleDao.correlationPermissions(roleId, permissionIds);
	}

	public void uncorrelationPermissions(Long roleId, Long... permissionIds) {
		roleDao.uncorrelationPermissions(roleId, permissionIds);
	}

}
