package ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import ssm.entity.Log;

public interface LogDAO {
	@Insert("insert into [Log] values(#{content}, default)")
	public int insert(@Param("content")String content);
}
