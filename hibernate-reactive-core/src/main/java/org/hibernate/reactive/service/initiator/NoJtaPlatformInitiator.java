package org.hibernate.reactive.service.initiator;

import org.hibernate.boot.registry.StandardServiceInitiator;
import org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform;
import org.hibernate.engine.transaction.jta.platform.spi.JtaPlatform;
import org.hibernate.service.spi.ServiceRegistryImplementor;

import java.util.Map;

public class NoJtaPlatformInitiator implements StandardServiceInitiator<JtaPlatform> {
	public static final NoJtaPlatformInitiator INSTANCE = new NoJtaPlatformInitiator();

	@Override
	public JtaPlatform initiateService(Map configurationValues, ServiceRegistryImplementor registry) {
		return NoJtaPlatform.INSTANCE;
	}

	@Override
	public Class<JtaPlatform> getServiceInitiated() {
		return JtaPlatform.class;
	}
}
