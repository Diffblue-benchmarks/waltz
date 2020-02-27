package com.khartec.waltz.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

public class DIConfigurationDiffblueTest {
  @Test
  public void settingOverridesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DIConfiguration()).settingOverrides().size());
  }

  @Test
  public void configureTasksTest() {
    // Arrange
    DIConfiguration diConfiguration = new DIConfiguration();
    ScheduledTaskRegistrar scheduledTaskRegistrar = new ScheduledTaskRegistrar();

    // Act
    diConfiguration.configureTasks(scheduledTaskRegistrar);

    // Assert
    TaskScheduler scheduler = scheduledTaskRegistrar.getScheduler();
    assertTrue(scheduler instanceof ThreadPoolTaskScheduler);
    assertFalse(((ThreadPoolTaskScheduler) scheduler).isRemoveOnCancelPolicy());
    assertEquals(5, ((ThreadPoolTaskScheduler) scheduler).getThreadPriority());
    assertEquals("ThreadPoolTaskScheduler-", ((ThreadPoolTaskScheduler) scheduler).getThreadNamePrefix());
    assertTrue(((ThreadPoolTaskScheduler) scheduler).isDaemon());
    assertEquals(1, ((ThreadPoolTaskScheduler) scheduler).getPoolSize());
  }

  @Test
  public void propertySourcesPlaceholderConfigurerTest() {
    // Arrange
    StandardEnvironment standardEnvironment = new StandardEnvironment();

    // Act and Assert
    assertEquals(2147483647, DIConfiguration.propertySourcesPlaceholderConfigurer(standardEnvironment).getOrder());
    assertEquals(0, standardEnvironment.getActiveProfiles().length);
    MutablePropertySources propertySources = standardEnvironment.getPropertySources();
    assertEquals(3, propertySources.size());
    assertEquals(
        "[JndiPropertySource {name='java:comp'}, MapPropertySource"
            + " {name='systemProperties'}, SystemEnvironmentPropertySource" + " {name='systemEnvironment'}]",
        propertySources.toString());
  }
}

