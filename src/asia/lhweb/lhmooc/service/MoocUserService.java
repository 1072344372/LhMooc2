package asia.lhweb.lhmooc.service;

import asia.lhweb.lhmooc.model.Page;
import asia.lhweb.lhmooc.model.bean.MoocUser;

/**
 * Mooc用户服务
 *
 * @author Administrator
 * @description 针对表【mooc_user(慕课用户信息表)】的数据库操作Service
 * @createDate 2024-03-11 21:23:21
 * @date 2024/03/11
 */
public interface MoocUserService{

    /**
     * 注册
     *
     * @param moocUser 蕴藏用户
     * @return boolean
     */
    boolean register(MoocUser moocUser);

    /**
     * 是否存在
     *
     * @param username 用户名
     * @return boolean
     */
    boolean isExists(String username);

    /**
     * 登录
     *
     * @param moocUser 蕴藏用户
     * @return {@link MoocUser}
     */
    MoocUser login(MoocUser moocUser);

    /**
     * 页面
     * 分页
     *
     * @param parseInt 解析int
     * @param pageSize 页面大小
     * @return {@link Page}<{@link MoocUser}>
     */
    Page<MoocUser> page(int parseInt, int pageSize);

    /**
     * 更新
     *
     * @param moocUser 蕴藏用户
     * @return boolean
     */
    boolean update(MoocUser moocUser);

    /**
     * 删除
     *
     * @param moocUser 蕴藏用户
     * @return boolean
     */
    boolean delete(MoocUser moocUser);
}
