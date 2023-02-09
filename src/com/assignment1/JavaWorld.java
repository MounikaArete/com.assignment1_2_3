package com.assignment1;

public class JavaWorld implements JavaLanguage {
	private PythonLanguage pythonlanguage;
	public JavaWorld(PythonLanguage PL) {
		pythonlanguage = PL;
	}
	
	@Override
	public String learningJava() {
		return "I am learning Java";
	}

	@Override
	public String learningPython() {
		
		return pythonlanguage.learningPython();
	}
	

}
