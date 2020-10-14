package cn.shine.service.impl;

import cn.shine.entity.PudongEnterpriseInformation;
import cn.shine.mapper.PudongEnterpriseInformationMapper;
import cn.shine.service.IPudongEnterpriseInformationDaoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 工商企业基本信息表 服务实现类
 * </p>
 *
 * @author zhj
 * @since 2020-10-13
 */
@Service
class PudongEnterpriseInformationDaoServiceImpl extends ServiceImpl<PudongEnterpriseInformationMapper, PudongEnterpriseInformation> implements IPudongEnterpriseInformationDaoService {

    @Autowired
    PudongEnterpriseInformationMapper mapper;

    @Override
    public  IPage<PudongEnterpriseInformation> findListByPage(Integer page, Integer pageCount){
        Page<PudongEnterpriseInformation> wherePage = new Page<>(page, pageCount);
        QueryWrapper<PudongEnterpriseInformation> querywrapper=new QueryWrapper<>();
        return   baseMapper.selectPage(wherePage,querywrapper);
    }

    @Override
    public int add(PudongEnterpriseInformation pudongEnterpriseInformation){
        return baseMapper.insert(pudongEnterpriseInformation);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(PudongEnterpriseInformation pudongEnterpriseInformation){
        return baseMapper.updateById(pudongEnterpriseInformation);
    }

    @Override
    public PudongEnterpriseInformation findById(Long id){
        return  baseMapper.selectById(id);
    }

    @Override
    public List<Map<String, Object>> selectBysql(String sql) {
        return mapper.selectBysql(sql);
    }
}
