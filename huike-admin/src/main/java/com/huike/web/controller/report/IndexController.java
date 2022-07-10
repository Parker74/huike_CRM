package com.huike.web.controller.report;


import com.huike.report.domain.vo.IndexTodayInfoVO;
import com.huike.report.domain.vo.IndexTodoInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huike.common.core.domain.AjaxResult;
import com.huike.report.service.IReportService;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IReportService reportService;


    /**
     * 首页--基础数据统计
     *
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/getBaseInfo")
    public AjaxResult getBaseInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime) {
        return AjaxResult.success(reportService.getBaseInfo(beginCreateTime, endCreateTime));
    }

    /**
     * 首页查询
     * @return
     */
    @GetMapping("/getTodayInfo")
    public AjaxResult getTodayInfo() {
        String today = new SimpleDateFormat(("yyyy-MM-dd")).format(new Date());
        IndexTodayInfoVO todayInfo = reportService.getTodayInfo(today);
        return AjaxResult.success(todayInfo);
    }

    /**
     * 首页待办事项查询
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/getTodoInfo")
    public AjaxResult getTodoInfo(@RequestParam("beginCreateTime") String beginCreateTime, @RequestParam("endCreateTime") String endCreateTime) {
        IndexTodoInfoVO result = reportService.getTodoInfo(beginCreateTime, endCreateTime);
        return AjaxResult.success(result);
    }
}