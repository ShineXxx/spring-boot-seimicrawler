package cn.shine.seimi.service;

import cn.shine.seimi.domain.Imges;
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
public interface IImgesService extends IService<Imges> {

    /**
     * 查询分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Imges>
     */
    IPage<Imges> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加
     *
     * @param imges 
     * @return int
     */
    int add(Imges imges);

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
     * @param imges 
     * @return int
     */
    int updateData(Imges imges);

    /**
     * id查询数据
     *
     * @param id id
     * @return Imges
     */
    Imges findById(Long id);
}
