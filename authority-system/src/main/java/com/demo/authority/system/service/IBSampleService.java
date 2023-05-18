package com.demo.authority.system.service;

import java.util.List;
import com.demo.authority.system.domain.BSample;

/**
 * 样品Service接口
 * 
 * @author ruoyi
 * @date 2022-11-24
 */
public interface IBSampleService 
{
    /**
     * 查询样品
     * 
     * @param sampleId 样品主键
     * @return 样品
     */
    public BSample selectBSampleBySampleId(Integer sampleId);

    /**
     * 查询样品列表
     * 
     * @param bSample 样品
     * @return 样品集合
     */
    public List<BSample> selectBSampleList(BSample bSample);

    /**
     * 新增样品
     * 
     * @param bSample 样品
     * @return 结果
     */
    public int insertBSample(BSample bSample);

    /**
     * 修改样品
     * 
     * @param bSample 样品
     * @return 结果
     */
    public int updateBSample(BSample bSample);

    /**
     * 批量删除样品
     * 
     * @param sampleIds 需要删除的样品主键集合
     * @return 结果
     */
    public int deleteBSampleBySampleIds(Integer[] sampleIds);

    /**
     * 删除样品信息
     * 
     * @param sampleId 样品主键
     * @return 结果
     */
    public int deleteBSampleBySampleId(Integer sampleId);
}
