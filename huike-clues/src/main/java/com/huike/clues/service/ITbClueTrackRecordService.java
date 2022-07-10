package com.huike.clues.service;


import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.common.core.domain.AjaxResult;

/**
 * 线索跟进记录Service接口
 * 
 * @author WGL
 * @date 2022-04-19
 */
public interface ITbClueTrackRecordService {

    AjaxResult add(ClueTrackRecordVo tbClueTrackRecord);
}
