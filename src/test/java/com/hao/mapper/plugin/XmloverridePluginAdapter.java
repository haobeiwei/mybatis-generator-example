package com.hao.mapper.plugin;

import java.util.List;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * Xml生成插件,XML重新生成时覆盖历史生成的文件
 * @version 1.0.0
 */
public class XmloverridePluginAdapter extends PluginAdapter {

	@Override
	public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
		sqlMap.setMergeable(false);
		return super.sqlMapGenerated(sqlMap, introspectedTable);
	}

	@Override
	public boolean validate(List<String> list) {
		return true;
	}
}
