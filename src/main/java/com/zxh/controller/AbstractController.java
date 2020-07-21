package com.zxh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zxh.util.Constant;
import com.zxh.util.EhcacheUtil;

import javax.annotation.Resource;

/**
 * Controller公共组件
 * 
 *
 */
abstract class AbstractController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	/** 常量帮助类 */
	@Resource
	protected Constant constant;

	@Resource
	protected EhcacheUtil ehcacheUtil;

}
