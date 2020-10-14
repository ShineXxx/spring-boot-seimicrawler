package cn.shine.service;

import cn.shine.entity.PudongEnterpriseInformation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 工商企业基本信息表 服务类
 * </p>
 *
 * @author zhj
 * @since 2020-10-13
 */
public interface IPudongEnterpriseInformationDaoService extends IService<PudongEnterpriseInformation> {

    /**
     * 查询工商企业基本信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<PudongEnterpriseInformation>
     */
    IPage<PudongEnterpriseInformation> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加工商企业基本信息表
     *
     * @param pudongEnterpriseInformation 工商企业基本信息表
     * @return int
     */
    int add(PudongEnterpriseInformation pudongEnterpriseInformation);

    /**
     * 删除工商企业基本信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改工商企业基本信息表
     *
     * @param pudongEnterpriseInformation 工商企业基本信息表
     * @return int
     */
    int updateData(PudongEnterpriseInformation pudongEnterpriseInformation);

    /**
     * id查询数据
     *
     * @param id id
     * @return PudongEnterpriseInformation
     */
    PudongEnterpriseInformation findById(Long id);

    List<Map<String, Object>> selectBysql(String sql);
}
