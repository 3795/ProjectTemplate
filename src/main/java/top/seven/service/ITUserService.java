package top.seven.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.seven.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author 3795
 * @since 2020-05-01
 */
public interface ITUserService extends IService<TUser> {

    /**
     * 根据账号查找用户
     *
     * @param account
     * @return
     */
    TUser getByAccount(String account);

    /**
     * 查询所有的用户
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<TUser> getList(Integer pageNum, Integer pageSize);
}
