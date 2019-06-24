import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author baojieren
 */
public class AutoGeneratorStart {
    public static void main(String[] args) {
        //代码生成器
        new AutoGenerator()
                //表策略配置
                .setStrategy(
                        new StrategyConfig()
                                .setNaming(NamingStrategy.underline_to_camel)
                                .setTablePrefix("t_")
                                .setEntityLombokModel(true)
                                .setEntityBooleanColumnRemoveIsPrefix(true)
                                .setRestControllerStyle(true)
                                //.setLogicDeleteFieldName("state")
                                .setInclude("t_divide_ali_contract_receiver")
                )
                //全局配置
                .setGlobalConfig(
                        new GlobalConfig()
                                .setOutputDir("D:\\gen-code")
                                .setFileOverride(true)
                                .setEnableCache(false)
                                .setAuthor("renBaoJie")
                                .setBaseResultMap(true)
                                .setIdType(IdType.AUTO)
                                .setBaseColumnList(true)
                                .setEntityName("%sPO")
                                .setMapperName("I%sDao")
                                //.setServiceName("%sService")
                )
                //数据源配置
                .setDataSource(
                        new DataSourceConfig()
                                .setDbType(DbType.MYSQL)
                                .setUsername("cimi")
                                .setPassword("cimi123!")
                                .setDriverName("com.mysql.jdbc.Driver")
                                .setUrl("jdbc:mysql://112.74.84.5:3306/bjs?serverTimezone=CST")
                )
                //包配置
                .setPackageInfo(
                        new PackageConfig()
                                .setParent("com.bjs")
                                .setEntity("data.po")
                                .setService("service.service")
                                .setServiceImpl("service.service.impl")
                                .setMapper("data.dao")
                                .setXml("mapper")
                                .setController("web")
                )
                //go
                .execute();
        // 第一次提交
        // 第二次提交
        // 第4次提交
        // 第5次提交
    }
}