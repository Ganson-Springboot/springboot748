package com.dao;

import com.entity.ForumEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ForumVO;
import com.entity.view.ForumView;


/**
 * 论坛新天地
 * 
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface ForumDao extends BaseMapper<ForumEntity> {
	
	List<ForumVO> selectListVO(@Param("ew") Wrapper<ForumEntity> wrapper);
	
	ForumVO selectVO(@Param("ew") Wrapper<ForumEntity> wrapper);
	
	List<ForumView> selectListView(@Param("ew") Wrapper<ForumEntity> wrapper);

	List<ForumView> selectListView(Pagination page,@Param("ew") Wrapper<ForumEntity> wrapper);
	
	ForumView selectView(@Param("ew") Wrapper<ForumEntity> wrapper);
	
}