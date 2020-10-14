package cn.shine.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import cn.shine.service.IPudongEnterpriseInformationDaoService;
import cn.shine.entity.PudongEnterpriseInformation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 工商企业基本信息表 前端控制器
 * </p>
 *
 * @author zhj
 * @since 2020-10-13
 */
@Slf4j
@Api(tags = {"工商企业基本信息表"})
@RestController
@RequestMapping("//pudongEnterpriseInformation")
public class PudongEnterpriseInformationController {

    //private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IPudongEnterpriseInformationDaoService pudongEnterpriseInformationDaoService;


    @ApiOperation(value = "新增工商企业基本信息表")
    @PostMapping()
    public int add(@RequestBody PudongEnterpriseInformation pudongEnterpriseInformation){
        return pudongEnterpriseInformationDaoService.add(pudongEnterpriseInformation);
    }

    @ApiOperation(value = "删除工商企业基本信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return pudongEnterpriseInformationDaoService.delete(id);
    }

    @ApiOperation(value = "更新工商企业基本信息表")
    @PutMapping()
    public int update(@RequestBody PudongEnterpriseInformation pudongEnterpriseInformation){
        return pudongEnterpriseInformationDaoService.updateData(pudongEnterpriseInformation);
    }

    @ApiOperation(value = "查询工商企业基本信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<PudongEnterpriseInformation> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return pudongEnterpriseInformationDaoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询工商企业基本信息表")
    @GetMapping("/sql")
    public List findById(String sql){
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                List<Map<String,Object>> list = pudongEnterpriseInformationDaoService.selectBysql(sql);
            }).start();
        }
//        return pudongEnterpriseInformationDaoService.findById(id);
        return new ArrayList();
    }

}
