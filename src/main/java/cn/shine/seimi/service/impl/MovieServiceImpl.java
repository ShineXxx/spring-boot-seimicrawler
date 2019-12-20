package cn.shine.seimi.service.impl;

import cn.shine.seimi.service.IMovieService;
import cn.shine.seimi.domain.Movie;
import cn.shine.seimi.dao.MovieMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Morty
 * @since 2019-12-20
 */
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie> implements IMovieService {
    //@Autowired
    //private MovieMapper movieMapper;

    @Override
    public  IPage<Movie> findListByPage(Integer page, Integer pageCount){
        Page<Movie> wherePage = new Page<>(page, pageCount);
        QueryWrapper<Movie> querywrapper=new QueryWrapper<>();
        return   baseMapper.selectPage(wherePage,querywrapper);
    }

    @Override
    public int add(Movie movie){
        return baseMapper.insert(movie);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Movie movie){
        return baseMapper.updateById(movie);
    }

    @Override
    public Movie findById(Long id){
        return  baseMapper.selectById(id);
    }
}
