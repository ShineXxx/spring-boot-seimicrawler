package cn.shine.mapper;

import cn.shine.entity.PudongEnterpriseInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
import java.util.Map;

/**
 * <p>
    *  Mapper 接口
    * </p>
 *
 * @author Morty
 * @since 2019-12-20
 */
public interface PudongEnterpriseInformationMapper extends BaseMapper<PudongEnterpriseInformation> {

    List<Map<String, Object>> selectBysql(String sql);
}
