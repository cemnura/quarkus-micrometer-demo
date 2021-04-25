package org.acme.newrelic.metric;

import com.newrelic.telemetry.Attributes;
import com.newrelic.telemetry.micrometer.NewRelicRegistry;
import com.newrelic.telemetry.micrometer.NewRelicRegistryConfig;
import io.micrometer.core.instrument.util.NamedThreadFactory;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NewRelicMetricRegistry {

    @Produces
    @Singleton
    public NewRelicRegistry registry(NewRelicRegistryConfig config) throws UnknownHostException {
        NewRelicRegistry newRelicRegistry =
                NewRelicRegistry.builder(config)
                        .commonAttributes(
                                new Attributes()
                                        .put("host", InetAddress.getLocalHost().getHostName()))
                        .build();
        newRelicRegistry.start(new NamedThreadFactory("newrelic.micrometer.registry"));
        return newRelicRegistry;
    }
}
