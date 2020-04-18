package com.galaxy.dao;

import com.galaxy.entity.Account;
import com.galaxy.entity.Pages;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> queryAll();

    @Insert("insert into account values(0,#{name},#{password})")
    public void insert(Account account);

    @Delete("delete from account where id = #{id}")
    public void delete(int id);

    @Select("select * from account where id = #{id}")
    public Account queryById(int id);

    @Update("update account set name=#{name},password=#{password} where id = #{id}")
    public void update(Account account);

    /*分页  查询所有条数*/
    @Select("select count(*) from account")
    public int queryTotalCount();

    /*分页 方法一*/
    @Select("select * from account limit #{start},#{pageSize}")
    public List<Account> queryAllPages1(@Param("start") int start, @Param("pageSize") int pageSize);

    /*分页 方法二*/
    @Select("select * from account limit #{start},#{pageSize}")
    public List<Account> queryAllPages2(Pages pages);

    /*分页 方法三 使用pageHelper*/
    @Select("select * from account")
    public List<Account> queryAll3();
}
