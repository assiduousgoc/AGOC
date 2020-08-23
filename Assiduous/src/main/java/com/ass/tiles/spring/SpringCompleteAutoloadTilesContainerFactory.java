package com.ass.tiles.spring;

import org.apache.tiles.extras.complete.CompleteAutoloadTilesContainerFactory;
import org.apache.tiles.locale.LocaleResolver;
import org.apache.tiles.request.ApplicationContext;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.web.servlet.view.tiles3.SpringLocaleResolver;

/**
 * @author Bright Interactive
 */
public class SpringCompleteAutoloadTilesContainerFactory extends CompleteAutoloadTilesContainerFactory {
	@Override
	protected LocaleResolver createLocaleResolver(ApplicationContext applicationContext) {
		return new SpringLocaleResolver();
	}

}
