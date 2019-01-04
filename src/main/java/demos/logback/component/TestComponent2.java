package demos.logback.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestComponent2 extends DemoLog{
	private static final Logger logger = LoggerFactory.getLogger(TestComponent2.class);


	@PostConstruct
	public void setup() {
		logStatements(logger,"-inside TestComponent2.setup() ");
	}

	@PreDestroy
	public void clean() {
		logStatements(logger,"-inside TestComponent2.clean() ");
	}
}
