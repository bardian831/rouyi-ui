package com.demo.authority.system.service.impl;

import java.util.List;
import com.demo.authority.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.authority.system.mapper.BSampleMapper;
import com.demo.authority.system.domain.BSample;
import com.demo.authority.system.service.IBSampleService;

/**
 * 样品Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-24
 */
@Service
public class BSampleServiceImpl implements IBSampleService 
{
    @Autowired
    private BSampleMapper bSampleMapper;

    /**
     * 查询样品
     * 
     * @param sampleId 样品主键
     * @return 样品
     */
    @Override
    public BSample selectBSampleBySampleId(Integer sampleId)
    {
        return bSampleMapper.selectBSampleBySampleId(sampleId);
    }

    /**
     * 查询样品列表
     * 
     * @param bSample 样品
     * @return 样品
     */
    @Override
    public List<BSample> selectBSampleList(BSample bSample)
    {
        return bSampleMapper.selectBSampleList(bSample);
    }

    /**
     * 新增样品
     * 
     * @param bSample 样品
     * @return 结果
     */
    @Override
    public int insertBSample(BSample bSample)
    {
        bSample.setCreateTime(DateUtils.getNowDate());
        return bSampleMapper.insertBSample(bSample);
    }

    /**
     * 修改样品
     * 
     * @param bSample 样品
     * @return 结果
     */
    @Override
    public int updateBSample(BSample bSample)
    {
        bSample.setUpdateTime(DateUtils.getNowDate());
        return bSampleMapper.updateBSample(bSample);
    }

    /**
     * 批量删除样品
     * 
     * @param sampleIds 需要删除的样品主键
     * @return 结果
     */
    @Override
    public int deleteBSampleBySampleIds(Integer[] sampleIds)
    {
        return bSampleMapper.deleteBSampleBySampleIds(sampleIds);
    }

    /**
     * 删除样品信息
     * 
     * @param sampleId 样品主键
     * @return 结果
     */
    @Override
    public int deleteBSampleBySampleId(Integer sampleId)
    {
        return bSampleMapper.deleteBSampleBySampleId(sampleId);
    }
}
