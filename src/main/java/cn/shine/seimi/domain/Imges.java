package cn.shine.seimi.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author Morty
 * @since 2019-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("javbooks_imges")
@ApiModel(value="Imges对象", description="")
public class Imges implements Serializable {

    private static final long serialVersionUID = 1L;

    private String number;

    private String gid;

    @ApiModelProperty(value = "缩略图")
    private String moviePicAbout;

    @ApiModelProperty(value = "高清图片")
    private String moviePicDetail;


}
