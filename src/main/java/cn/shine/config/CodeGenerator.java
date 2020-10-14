package cn.shine.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Berry_Cooper.
 * @date 2018/10/3 14:48
 * fileName：CodeGenerator
 * Use：
 */
public class CodeGenerator {


    private static final String db = "localhost:3306/pudong_psdc";
    private static final String dbUsername = "root";
    private static final String dbPassword = "root";
    private static final String tableName = "pudong_enterprise_information";
    private static final String moduleName = "";
    private static final String author = "zhj";

    /**
     * RUN THIS
     */
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setDateType(DateType.ONLY_DATE);
        gc.setIdType(IdType.ID_WORKER);
        gc.setAuthor(author);
        gc.setOpen(false);
        gc.setServiceName("I%sDaoService");
        gc.setServiceImplName("%sDaoServiceImpl");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://" + db + "?characterEncoding=utf8&useSSL=false&useUnicode=true&allowPublicKeyRetrieval=true&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername(dbUsername);
        dsc.setPassword(dbPassword);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName);
        pc.setParent("cn.shine");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return projectPath + "/src/main/resources/mapper" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setInclude(tableName);
        strategy.setRestControllerStyle(true);
//        strategy.setTablePrefix("pdsc_");
        mpg.setStrategy(strategy);
        // 选择 freemarker 引擎需要指定如下加，注意 pom 依赖必须有！
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    private static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
//            if (StringUtils.isNotEmpty(ipt)) {
//                return ipt;
//            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

}
