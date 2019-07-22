package com.hao.mapper.user;

import com.hao.model.user.User;
import com.hao.model.user.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     *  根据指定的条件获取数据库记录数
     * @param example
     * @return
     */
    long countByExample(UserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录
     * @param example
     * @return
     */
    int deleteByExample(UserExample example);

    /**
     *  根据主键删除数据库的记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录
     * @param record
     * @return
     */
    int insert(User record);

    /**
     *  动态字段,写入数据库记录
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     *  根据指定的条件查询符合条件的数据库记录
     * @param example
     * @return
     */
    List<User> selectByExample(UserExample example);

    /**
     *  根据指定主键获取一条数据库记录
     * @param id
     * @return
     */
    User selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *  根据主键来更新符合条件的数据库记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}