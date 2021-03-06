package com.springinaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Java Config
//===============================================================
@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
}






//===============================================================

// Auto Component Scan
//===============================================================
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan
//public class CDPlayerConfig {
//}
//===============================================================
