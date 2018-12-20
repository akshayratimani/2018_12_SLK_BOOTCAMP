package com.slk.training.programs;

public class P01_ReadCommandlineArgs {

	// command to execute this program on the command prompt (terminal): 
	// java com.slk.training.programs.P01_ReadCommandlineArgs Hello Vinod Kumar
	public static void main(String[] args) {
		System.out.printf("There are %d arguments\n", args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s\n", i, args[i]);
		}

	}

}
