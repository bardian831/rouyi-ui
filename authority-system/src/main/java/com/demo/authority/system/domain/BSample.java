package com.demo.authority.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.demo.authority.common.annotation.Excel;
import com.demo.authority.common.core.domain.BaseEntity;

/**
 * 样品对象 b_sample
 * 
 * @author ruoyi
 * @date 2022-11-24
 */
public class BSample extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 样品主键 */
    private Integer sampleId;

    /** 样品名称 */
    @Excel(name = "样品名称")
    private String sampleName;

    /** 样品关键字 */
    @Excel(name = "样品关键字")
    private String sampleKey;

    /** 参数参数值 */
    @Excel(name = "参数参数值")
    private String sampleValue;

    /** 样品类型（Y正品 N非正器） */
    @Excel(name = "样品类型", readConverterExp = "Y=正品,N=非正器")
    private String sampleType;

    public void setSampleId(Integer sampleId) 
    {
        this.sampleId = sampleId;
    }

    public Integer getSampleId() 
    {
        return sampleId;
    }
    public void setSampleName(String sampleName) 
    {
        this.sampleName = sampleName;
    }

    public String getSampleName() 
    {
        return sampleName;
    }
    public void setSampleKey(String sampleKey) 
    {
        this.sampleKey = sampleKey;
    }

    public String getSampleKey() 
    {
        return sampleKey;
    }
    public void setSampleValue(String sampleValue) 
    {
        this.sampleValue = sampleValue;
    }

    public String getSampleValue() 
    {
        return sampleValue;
    }
    public void setSampleType(String sampleType) 
    {
        this.sampleType = sampleType;
    }

    public String getSampleType() 
    {
        return sampleType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sampleId", getSampleId())
            .append("sampleName", getSampleName())
            .append("sampleKey", getSampleKey())
            .append("sampleValue", getSampleValue())
            .append("sampleType", getSampleType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
