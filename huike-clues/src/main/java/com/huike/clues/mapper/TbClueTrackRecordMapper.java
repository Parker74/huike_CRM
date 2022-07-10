package com.huike.clues.mapper;


import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.common.core.domain.AjaxResult;

/**
 * 线索跟进记录Mapper接口
 * @date 2021-04-19
 */
public interface TbClueTrackRecordMapper {

    AjaxResult add(ClueTrackRecordVo tbClueTrackRecord);

}
