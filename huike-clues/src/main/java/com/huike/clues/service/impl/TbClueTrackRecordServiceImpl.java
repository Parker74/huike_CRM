package com.huike.clues.service.impl;


import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.mapper.TbClueTrackRecordMapper;
import com.huike.clues.service.ITbClueTrackRecordService;
import com.huike.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 线索跟进记录Service业务层处理
 *
 * @date 2022-04-22
 */
@Service
public class TbClueTrackRecordServiceImpl implements ITbClueTrackRecordService {

    @Autowired
    private TbClueTrackRecordMapper tbClueTrackRecordMapper;

    @Override
    public AjaxResult add(ClueTrackRecordVo tbClueTrackRecord) {
        return AjaxResult.success(tbClueTrackRecordMapper.add(tbClueTrackRecord));
    }
}
