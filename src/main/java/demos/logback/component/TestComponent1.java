package demos.logback.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestComponent1 extends DemoLog{

	private static final Logger logger = LoggerFactory.getLogger(TestComponent1.class);

	@PostConstruct
	public void setup() {
		DemoLog.logStatements(logger, "-inside TestComponent1.setup() ");
	}

	@PreDestroy
	public void clean() {
		DemoLog.logStatements(logger,"-inside TestComponent1.clean() ");
	}

}
