package com.shanghai.study;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.shanghai.study.model.common.NewBaseModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 代码生成工具
 * @Package: .MybatisPlusCodeGenerator
 * @Author  Yao.Jie
 * @date 2021/3/11 19:45
 * */
public class MybatisPlusCodeGenerator {

	// ================= 自定义配置  =================

	private static final DbType DB_TYPE = DbType.MYSQL;
	private static final String JDBC_URL = "jdbc:mysql://rm-bp1jy441nuw370821yo.mysql.rds.aliyuncs.com:3306/qyj_my_database?useUnicode=true&characterEncoding=utf8";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "Ser@zd0228";
	private static final String PROJECT_NAME = "/study-biz";
	/**
	 * 生成文件根目录及包名
	 */
	private static final String ROOT_DIR = System.getProperty("user.dir") + PROJECT_NAME + "/src/main/java";
	//java文件夹下路径
	private static final String PACKAGE_PARENT_NAME = "com.shanghai.study";
	private static final String PACKAGE_CONTROLLER_NAME = "controller";
	private static final String PACKAGE_SERVICE_NAME = "service";
	private static final String PACKAGE_SERVICEIMPL_NAME = "service.impl";
	//entity
	private static final String PACKAGE_ENTITY_NAME = "model";
	private static final String PACKAGE_DTO_NAME = "dto";
	private static final String PACKAGE_MAPPER_NAME = "mapper";
	private static final String RESOURCES_DIR = System.getProperty("user.dir") + PROJECT_NAME + "/src/main/resources";
	private static final String MAPPER_XML_PATH = "mapper";
	/**
	 * 生成代码的@author
	 */
	private static final String AUTHOR = "system";
	/**
	 * 需要生成代码的数据库表名
	 */
	private static final String[] TABLES = new String[]{"t_user"};
	/**
	 * 数据库表名前缀
	 */
	private static final String[] TABLE_PREFIXS = new String[]{"t_"};


	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();
		mpg.setDataSource(getDataSourceConfig());
		mpg.setGlobalConfig(getGlobalConfig());
		mpg.setStrategy(getStrategyConfig());
		mpg.setPackageInfo(getPackageConfig());
		mpg.setCfg(getInjectionConfig());
		mpg.setTemplate(getTemplateConfig());
		// 执行生成
		mpg.execute();
	}

	/**
	 * 数据源配置
	 *
	 * @return
	 */
	private static DataSourceConfig getDataSourceConfig() {
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DB_TYPE);
		dsc.setDriverName(JDBC_DRIVER);
		dsc.setUrl(JDBC_URL);
		dsc.setUsername(JDBC_USERNAME);
		dsc.setPassword(JDBC_PASSWORD);
		return dsc;
	}

	/**
	 * 全局配置
	 *
	 * @return
	 */
	private static GlobalConfig getGlobalConfig() {
		GlobalConfig gc = new GlobalConfig();
		//生成后是否打开资源管理器
		gc.setOpen(false);
		gc.setOutputDir(ROOT_DIR);
		//重新生成时文件是否覆盖
		gc.setFileOverride(true);
		gc.setActiveRecord(true);
		//主键策略
		gc.setIdType(IdType.ASSIGN_ID);
		//定义生成的实体类中日期类型
		gc.setDateType(DateType.ONLY_DATE);
		//开启Swagger2模式
		gc.setSwagger2(false);
		// XML 二级缓存
		gc.setEnableCache(false);
		// XML ResultMap
		gc.setBaseResultMap(true);
		// XML columList
		gc.setBaseColumnList(true);
		gc.setAuthor(AUTHOR);
		gc.setMapperName("%sMapper");
		gc.setXmlName("%sMapper");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setControllerName("%sController");
		return gc;
	}

	/**
	 * 生成策略配置
	 *
	 * @return
	 */
	private static StrategyConfig getStrategyConfig() {
		StrategyConfig strategy = new StrategyConfig();
		// 此处可以修改为您的表前缀
		strategy.setTablePrefix(TABLE_PREFIXS);
		strategy.setSuperEntityClass(NewBaseModel.class);
		strategy.setSuperEntityColumns("id","is_deleted", "creator_id", "create_time", "updater_id", "update_time");
		// 表名生成策略
		strategy.setNaming(NamingStrategy.underline_to_camel);
		// 需要生成的表
		strategy.setInclude(TABLES);
		// lombok 模型 @Accessors(chain = true) setter链式操作
		strategy.setEntityLombokModel(true);
		//restful api风格控制器 （生成controller）
//        strategy.setRestControllerStyle(true);
		//url中驼峰转连字符
//        strategy.setControllerMappingHyphenStyle(true);
		// 是否启用builder 模式
		strategy.setEntityBuilderModel(true)
				.setEntitySerialVersionUID(false)
				// 生成实体类字段注解
				.setEntityTableFieldAnnotationEnable(true)
		;
		return strategy;
	}

	/**
	 * 生成包名设置
	 *
	 * @return
	 */
	private static PackageConfig getPackageConfig() {
		// 4.生成文件所在包配置：
		PackageConfig pc = new PackageConfig();
		pc.setParent(PACKAGE_PARENT_NAME);
		pc.setController(PACKAGE_CONTROLLER_NAME);
//		pc.setService(PACKAGE_SERVICE_NAME);
//		pc.setServiceImpl(PACKAGE_SERVICEIMPL_NAME);
		pc.setEntity(PACKAGE_ENTITY_NAME);
		pc.setMapper(PACKAGE_MAPPER_NAME);
		return pc;
	}

	/**
	 * xml文件配置
	 *
	 * @return
	 */
	private static InjectionConfig getInjectionConfig() {
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<String, Object>();
				//map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-rb");
				this.setMap(map);
			}
		};
		//xml生成路径
		List<FileOutConfig> focList = new ArrayList<>();

		focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
			@Override
			public String outputFile(TableInfo tableInfo) {
				return RESOURCES_DIR + "/" + MAPPER_XML_PATH + "/" + tableInfo.getEntityName() + "Mapper.xml";
			}
		});

//		focList.add(new FileOutConfig("/templates/controller1.java.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				return ROOT_DIR + "/" +PACKAGE_PARENT_NAME+"/"+ PACKAGE_DTO_NAME + "/" + tableInfo.getEntityName() + "Controller1.java";
//			}
//		});
		cfg.setFileOutConfigList(focList);
		return cfg;
	}

	/**
	 * 关闭默认 xml 生成
	 *
	 * @return
	 */
	private static TemplateConfig getTemplateConfig() {
		TemplateConfig tc = new TemplateConfig();
//	tc.setController("/templates/controller.java.vm");
		tc.setXml(null);

//		tc.setService("/templatesMybatis/service.java.vm");
//		tc.setServiceImpl("/templatesMybatis/serviceImpl.java.vm");
//		tc.setEntity("/templatesMybatis/entity.java.vm");
//		tc.setMapper("/templatesMybatis/mapper.java.vm");
//		tc.setXml("/templatesMybatis/mapper.xml.vm");
		return tc;
	}
}

