package com.huike.review.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.PageDomain;
import com.huike.common.core.page.TableDataInfo;
import com.huike.review.pojo.Review;
import com.huike.review.service.ReviewService;
import com.huike.review.mapper.MybatisReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * mybatis复习使用的业务层
 * 注意该业务层和我们系统的业务无关，主要是让同学们快速熟悉系统的
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private MybatisReviewMapper reviewMapper;

    @Override
    public AjaxResult insert(String name, String age, String sex) {
        try {
            reviewMapper.insert(name, age, sex);
            return AjaxResult.success();
        } catch (Exception e) {
            return AjaxResult.error();
        }
    }

    @Override
    public AjaxResult insertObj(Review review) {
        try {
            reviewMapper.insertObj(review);
            return AjaxResult.success();
        } catch (Exception e) {
            return AjaxResult.error();
        }
    }

    @Override
    public AjaxResult deleteById(Long id) {
        try {
            reviewMapper.deleteById(id);
            return AjaxResult.success();
        } catch (Exception e) {
            return AjaxResult.error();
        }
    }

    @Override
    public AjaxResult updateById(Review review) {
        try {
            reviewMapper.updateById(review);
            return AjaxResult.success();
        } catch (Exception e) {
            return AjaxResult.error();
        }
    }


    @Override
    public AjaxResult selectById(Long id) {
        Review review = reviewMapper.selectById(id);
        if (review == null) {
            return AjaxResult.error();
        }
        return AjaxResult.success(review);
    }

    @Override
    public List<Review> page(Integer pageNum, Integer pageSize) {
        return reviewMapper.page(pageNum, pageSize);
    }
}