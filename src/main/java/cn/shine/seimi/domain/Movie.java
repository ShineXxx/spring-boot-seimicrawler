package cn.shine.seimi.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("javbooks_movie")
@ApiModel(value="Movie对象", description="")
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "番号")
    private String number;

    @ApiModelProperty(value = "发行时间")
    private Date releaseTime;

    @ApiModelProperty(value = "导演")
    private String director;

    @ApiModelProperty(value = "系列")
    private String series;

    @ApiModelProperty(value = "制作商")
    @TableField("Maker")
    private String Maker;

    @ApiModelProperty(value = "发行商")
    @TableField("Publisher")
    private String Publisher;

    @ApiModelProperty(value = "类别")
    private String genre;

    @ApiModelProperty(value = "女优")
    private String actor;

    private String moviePic;

    private String movieTitle;

    @ApiModelProperty(value = "影片时长")
    private String movieLength;

    private String moviePicDetail;


}
