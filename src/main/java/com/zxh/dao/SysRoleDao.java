package com.zxh.dao;

import com.zxh.entity.SysRoleEntity;
import com.zxh.util.BaseDao;

/**
 * 角色管理
 *
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 更新角色
     *
     * @param role SysRoleEntity
     */
    void updateNoMapper(SysRoleEntity role);

}
