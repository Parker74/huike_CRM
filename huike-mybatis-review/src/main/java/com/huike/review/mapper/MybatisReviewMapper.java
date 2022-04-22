package com.huike.review.mapper;

import com.github.pagehelper.Page;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.PageDomain;
import com.huike.common.core.page.TableDataInfo;
import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Mybatis复习的Mapper层
 */
public interface MybatisReviewMapper {


    /**
     * ======================================================新增======================================================
     **/

    void insert(@Param("name") String name, @Param("age") String age, @Param("sex") String sex);

    void insertObj(Review review);

    void deleteById(Long id);

    void updateById(Review review);

    Review selectById(Long id);

    List<Review> page(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

}
