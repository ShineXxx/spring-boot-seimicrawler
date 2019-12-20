package cn.shine.seimi.service;

import cn.shine.seimi.domain.Movie;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Morty
 * @since 2019-12-20
 */
public interface IMovieService extends IService<Movie> {

    /**
     * 查询分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Movie>
     */
    IPage<Movie> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加
     *
     * @param movie 
     * @return int
     */
    int add(Movie movie);

    /**
     * 删除
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改
     *
     * @param movie 
     * @return int
     */
    int updateData(Movie movie);

    /**
     * id查询数据
     *
     * @param id id
     * @return Movie
     */
    Movie findById(Long id);
}
