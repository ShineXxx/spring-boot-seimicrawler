package cn.shine.seimi.dao;

import cn.shine.seimi.domain.Imges;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
    *  Mapper 接口
    * </p>
 *
 * @author Morty
 * @since 2019-12-20
 */
public interface ImgesMapper extends BaseMapper<Imges> {
    IPage<Imges> selectPageVo(Page page);
}
