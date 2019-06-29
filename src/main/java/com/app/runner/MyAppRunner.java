package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyAppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//1.read all keys
		Set<String> optionkeys=args.getOptionNames();
		System.out.println("optionkeys :"+optionkeys);
		
		//2.one key related values
		List<String> list=args.getOptionValues("profile");
				System.out.println("list:"+list);
				
				
		//3.checks for key exist
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));

		
		//4.non option
		List<String> nonop=args.getNonOptionArgs();
		System.out.println("nonop :"+nonop);
		
		//5.all args
		String[] arg=args.getSourceArgs();
		System.out.println("arg:"+arg);
		System.out.println(Arrays.asList(args));
		
	}

}
