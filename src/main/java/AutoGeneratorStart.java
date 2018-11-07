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
                                .setOutputDir("D:\\generator-code")
                                .setFileOverride(true)
                                .setEnableCache(false)
                                .setAuthor("baojie")
                                .setBaseResultMap(true)
                                .setIdType(IdType.AUTO)
                                .setServiceName("%sService")
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
                //表策略配置
                .setStrategy(
                        new StrategyConfig()
                                .setNaming(NamingStrategy.underline_to_camel)
                                //.setLogicDeleteFieldName("state")
                                .setInclude("t_vendor_log_count")
                )
                //包配置
                .setPackageInfo(
                        new PackageConfig()
                                .setParent("com.baojie")
                                .setXml("mapper")
                )
                //go
                .execute();
    }
}