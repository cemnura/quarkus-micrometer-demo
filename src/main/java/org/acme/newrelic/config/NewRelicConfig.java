package org.acme.newrelic.config;

import com.newrelic.telemetry.micrometer.NewRelicRegistryConfig;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import java.time.Duration;

public class NewRelicConfig {

    @ConfigProperty(name = "newrelic.api.key")
    String apiKey;

    @ConfigProperty(name = "newrelic.step.seconds")
    Integer step;

    @ConfigProperty(name = "newrelic.metric.api.uri", defaultValue = "https://metric-api.newrelic.com")
    String uri;

    @ConfigProperty(name = "newrelic.service.name")
    String serviceName;

    @Produces
    @Singleton
    public NewRelicRegistryConfig config() {
        return  new NewRelicRegistryConfig() {
            @Override
            public String get(String key) {
                return null;
            }

            @Override
            public String apiKey() {
                return apiKey;
            }

            @Override
            public Duration step() {
                return Duration.ofSeconds(step);
            }

            @Override
            public String uri() {
                return uri;
            }

            @Override
            public String serviceName() {
                return serviceName;
            }
        };

    }
}
