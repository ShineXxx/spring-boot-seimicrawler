package cn.shine.seimi.controller;

import cn.shine.seimi.domain.Imges;
import cn.shine.seimi.service.IImgesService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Morty
 * @since 2019-12-20
 */
@Slf4j
@Api(tags = {""})
@RestController
@RequestMapping("/imges")
public class ImgesController {

    //private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IImgesService imgesService;


    @ApiOperation(value = "新增")
    @PostMapping()
    public int add(@RequestBody Imges imges){
        return imgesService.add(imges);
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return imgesService.delete(id);
    }

    @ApiOperation(value = "更新")
    @PutMapping()
    public int update(@RequestBody Imges imges){
        return imgesService.updateData(imges);
    }

    @ApiOperation(value = "查询分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Imges> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return imgesService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询")
    @GetMapping("{id}")
    public Imges findById(@PathVariable Long id){
        return imgesService.findById(id);
    }

}
