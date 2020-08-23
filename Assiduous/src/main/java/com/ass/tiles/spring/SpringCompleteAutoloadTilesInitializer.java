package com.ass.tiles.spring;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.apache.tiles.extras.complete.CompleteAutoloadTilesInitializer;
import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.request.ApplicationContext;

/**
 * @author Maheshwar Prasad
 */
public class SpringCompleteAutoloadTilesInitializer extends CompleteAutoloadTilesInitializer {
	@Override
	protected AbstractTilesContainerFactory createContainerFactory(ApplicationContext context) {
		return new SpringCompleteAutoloadTilesContainerFactory();
	}
}
