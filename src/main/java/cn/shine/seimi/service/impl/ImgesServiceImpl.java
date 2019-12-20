package cn.shine.seimi.service.impl;

import cn.shine.seimi.domain.Imges;
import cn.shine.seimi.dao.ImgesMapper;
import cn.shine.seimi.service.IImgesService;
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
public class ImgesServiceImpl extends ServiceImpl<ImgesMapper, Imges> implements IImgesService {
    //@Autowired
    //private ImgesMapper imgesMapper;

    @Override
    public  IPage<Imges> findListByPage(Integer page, Integer pageCount){
        Page<Imges> wherePage = new Page<>(page, pageCount);
        QueryWrapper<Imges> querywrapper=new QueryWrapper<>();
        return   baseMapper.selectPage(wherePage,querywrapper);
    }

    @Override
    public int add(Imges imges){
        return baseMapper.insert(imges);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Imges imges){
        return baseMapper.updateById(imges);
    }

    @Override
    public Imges findById(Long id){
        return  baseMapper.selectById(id);
    }
}
