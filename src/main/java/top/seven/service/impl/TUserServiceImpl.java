package top.seven.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.seven.entity.TUser;
import top.seven.mapper.TUserMapper;
import top.seven.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author 3795
 * @since 2020-05-01
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getByAccount(String account) {
        QueryWrapper<TUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account", account);
        return this.getOne(queryWrapper);
    }

    @Override
    public Page<TUser> getList(Integer pageNum, Integer pageSize) {
        Page<TUser> page = new Page<>(pageNum, pageSize);
        this.page(page);
        page.getRecords().forEach(e -> e.setPassword(null));
        return page;
    }
}
