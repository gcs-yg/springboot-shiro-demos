package com.zxh.config;

import com.jagregory.shiro.freemarker.ShiroTags;
import com.zxh.util.freemaker.FormatTimeFTLHelper;

import freemarker.template.Configuration;
import freemarker.template.TemplateModelException;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Freemaker
 *
 */
@org.springframework.context.annotation.Configuration
public class FreeMarkerConfig {

    @Resource
    private Configuration configuration;
    @Resource
    protected org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver resolver;
    @Resource
    protected org.springframework.web.servlet.view.InternalResourceViewResolver springResolver;

    @PostConstruct
    public void setSharedVariable() throws TemplateModelException {
        configuration.setTagSyntax(freemarker.template.Configuration.AUTO_DETECT_TAG_SYNTAX);
        configuration.setSharedVariable("formatTime", new FormatTimeFTLHelper());
        configuration.setSharedVariable("shiro", new ShiroTags());
    }

    @PostConstruct
    public void freeMarkerConfigurer() {
    }

}
