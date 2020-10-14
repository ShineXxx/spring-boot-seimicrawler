package ${package.Mapper};

import ${package.Entity}.${entity};
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
<#if kotlin>
interface ${table.mapperName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.mapperName} extends BaseMapper<${entity}> {

}
</#if>
