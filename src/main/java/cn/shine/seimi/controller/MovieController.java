package cn.shine.seimi.controller;

import cn.shine.seimi.domain.Movie;
import cn.shine.seimi.service.IMovieService;
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
@RequestMapping("/movie")
public class MovieController {

    //private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMovieService movieService;


    @ApiOperation(value = "新增")
    @PostMapping()
    public int add(@RequestBody Movie movie){
        return movieService.add(movie);
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return movieService.delete(id);
    }

    @ApiOperation(value = "更新")
    @PutMapping()
    public int update(@RequestBody Movie movie){
        return movieService.updateData(movie);
    }

    @ApiOperation(value = "查询分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Movie> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return movieService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询")
    @GetMapping("{id}")
    public Movie findById(@PathVariable Long id){
        return movieService.findById(id);
    }

}
