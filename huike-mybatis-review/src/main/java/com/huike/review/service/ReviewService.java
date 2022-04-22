package com.huike.review.service;

import com.github.pagehelper.Page;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.PageDomain;
import com.huike.common.core.page.TableDataInfo;
import com.huike.review.pojo.Review;

import java.util.List;

/**
 * mybatis复习接口层
 */
public interface ReviewService {


    AjaxResult insert(String name,  String age,  String sex);

    AjaxResult insertObj(Review review);

    AjaxResult deleteById(Long id);

    AjaxResult updateById(Review review);

    AjaxResult selectById(Long id);

    List<Review> page(Integer pageNum, Integer pageSize);

}
