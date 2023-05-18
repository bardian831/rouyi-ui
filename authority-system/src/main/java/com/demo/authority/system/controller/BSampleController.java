package com.demo.authority.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.authority.common.annotation.Log;
import com.demo.authority.common.core.controller.BaseController;
import com.demo.authority.common.core.domain.AjaxResult;
import com.demo.authority.common.enums.BusinessType;
import com.demo.authority.system.domain.BSample;
import com.demo.authority.system.service.IBSampleService;
import com.demo.authority.common.utils.poi.ExcelUtil;
import com.demo.authority.common.core.page.TableDataInfo;

/**
 * 样品Controller
 * 
 * @author ruoyi
 * @date 2022-11-24
 */
@RestController
@RequestMapping("/system/sample")
public class BSampleController extends BaseController
{
    @Autowired
    private IBSampleService bSampleService;

    /**
     * 查询样品列表
     */
    @PreAuthorize("@ss.hasPermi('system:sample:list')")
    @GetMapping("/list")
    public TableDataInfo list(BSample bSample)
    {
        startPage();
        List<BSample> list = bSampleService.selectBSampleList(bSample);
        return getDataTable(list);
    }

    /**
     * 导出样品列表
     */
    @PreAuthorize("@ss.hasPermi('system:sample:export')")
    @Log(title = "样品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BSample bSample)
    {
        List<BSample> list = bSampleService.selectBSampleList(bSample);
        ExcelUtil<BSample> util = new ExcelUtil<BSample>(BSample.class);
        util.exportExcel(response, list, "样品数据");
    }

    /**
     * 获取样品详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:sample:query')")
    @GetMapping(value = "/{sampleId}")
    public AjaxResult getInfo(@PathVariable("sampleId") Integer sampleId)
    {
        return success(bSampleService.selectBSampleBySampleId(sampleId));
    }

    /**
     * 新增样品
     */
    @PreAuthorize("@ss.hasPermi('system:sample:add')")
    @Log(title = "样品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BSample bSample)
    {
        return toAjax(bSampleService.insertBSample(bSample));
    }

    /**
     * 修改样品
     */
    @PreAuthorize("@ss.hasPermi('system:sample:edit')")
    @Log(title = "样品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BSample bSample)
    {
        return toAjax(bSampleService.updateBSample(bSample));
    }

    /**
     * 删除样品
     */
    @PreAuthorize("@ss.hasPermi('system:sample:remove')")
    @Log(title = "样品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sampleIds}")
    public AjaxResult remove(@PathVariable Integer[] sampleIds)
    {
        return toAjax(bSampleService.deleteBSampleBySampleIds(sampleIds));
    }
}
