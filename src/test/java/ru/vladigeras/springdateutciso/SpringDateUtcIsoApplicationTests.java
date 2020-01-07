package ru.vladigeras.springdateutciso;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@SpringBootTest
class SpringDateUtcIsoApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void testUtcZoneDefault() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowUtc = LocalDateTime.now(ZoneOffset.UTC);
		Assertions.assertEquals(0, Duration.between(now, nowUtc).toMinutes());
	}
}
