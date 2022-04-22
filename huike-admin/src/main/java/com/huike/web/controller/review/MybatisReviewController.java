package com.huike.web.controller.review;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huike.common.core.controller.BaseController;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.TableDataInfo;
import com.huike.review.pojo.Review;
import com.huike.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 该Controller主要是为了复习三层架构以及Mybatis使用的，该部分接口已经放开权限，可以直接访问
 * 同学们在此处编写接口通过浏览器访问看是否能完成最简单的增删改查
 */
@RestController
@RequestMapping("/review")
public class MybatisReviewController extends BaseController {

    @Autowired
    private ReviewService reviewService;

    /**
     * 根据三个参数添加
     *
     * @param name
     * @param age
     * @param sex
     * @return
     */
    @GetMapping("/saveData/{name}/{age}/{sex}")
    public AjaxResult insert(@PathVariable String name, @PathVariable String age, @PathVariable String sex) {
        return reviewService.insert(name, age, sex);
    }

    /**
     * 根据传入对象添加
     *
     * @param review
     * @return
     */
    @PostMapping("/saveData")
    public AjaxResult insertObj(Review review) {
        return reviewService.insertObj(review);
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/remove/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return reviewService.deleteById(id);
    }

    /**
     * 根据id修改数据
     *
     * @param review
     * @return
     */
    @PostMapping("/update")
    public AjaxResult updateById(Review review) {
        return reviewService.updateById(review);
    }

    @GetMapping("/getById")
    public AjaxResult selectById(Long id) {
        return reviewService.selectById(id);
    }

   /* @GetMapping("/getDataByPage")
    public PageDomain page1(Integer pageNum, Integer pageSize){
        return reviewService.page(pageNum, pageSize);
    }*/

    @GetMapping("/getDataByPage")
    public TableDataInfo page2(int pageNum, int pageSize){
        startPage();
        List<Review> list = reviewService.page(pageNum, pageSize);
        return getDataTable(list);
    }

    /*@GetMapping("/getDataByPage")
    public TableDataInfo page3(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize,null);
        List<Review> list = reviewService.page(pageNum, pageSize);
        return getDataTable(list);
    }*/
}