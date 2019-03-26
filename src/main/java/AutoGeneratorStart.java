import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author baojie
 */
public class AutoGeneratorStart {
    public static void main(String[] args) {
        //代码生成器
        new AutoGenerator()
                //全局配置
                .setGlobalConfig(
                        new GlobalConfig()
                                .setOutputDir("D:\\generator-baojie")
                                .setFileOverride(true)
                                .setEnableCache(false)
                                .setAuthor("renBaoJie")
                                .setBaseResultMap(true)
                                .setIdType(IdType.AUTO)
                                .setBaseColumnList(true)
                                .setEntityName("%sPO")
                                .setMapperName("%sDao")
                                //.setServiceName("%sService")
                )
                //数据源配置
                .setDataSource(
                        new DataSourceConfig()
                                .setDbType(DbType.MYSQL)
                                .setUsername("root")
                                .setPassword("Mysql615243!")
                                .setDriverName("com.mysql.jdbc.Driver")
                                .setUrl("jdbc:mysql://119.29.239.91:3306/baojie?serverTimezone=CST&useSSL=false&allowMultiQueries=true")
                )
                //表策略配置
                .setStrategy(
                        new StrategyConfig()
                                .setNaming(NamingStrategy.underline_to_camel)
                                .setTablePrefix("t_")
                                .setEntityLombokModel(true)
                                .setEntityBooleanColumnRemoveIsPrefix(true)
                                .setRestControllerStyle(true)
                                //.setLogicDeleteFieldName("state")
                                .setInclude("t_mall_addr_backup")
                )
                //包配置
                .setPackageInfo(
                        new PackageConfig()
                                .setParent("ren.baojie")
                                .setEntity("entity")
                                .setService("service")
                                .setServiceImpl("service.impl")
                                .setMapper("dao")
                                .setXml("mapper")
                                .setController("controller")
                )
                //go
                .execute();
        // aaa
        // bbb
        // ccc
    }
}