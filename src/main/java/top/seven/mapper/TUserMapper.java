package top.seven.mapper;

import top.seven.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author 3795
 * @since 2020-05-01
 */
@Repository
@Mapper
public interface TUserMapper extends BaseMapper<TUser> {

}
