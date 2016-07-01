package service.impl;

import service.PermissionService;
import dao.PermissionDao;
import dao.impl.PermissionDaoImpl;
import entity.Permission;

public class PermissionServiceImpl implements PermissionService {

	private PermissionDao permissionDao = new PermissionDaoImpl();
	
	public Permission createPermission(Permission permission) {
		return permissionDao.createPermission(permission);
	}

	public void deletePermission(Long permissionId) {
		permissionDao.deletePermission(permissionId);

	}

}
