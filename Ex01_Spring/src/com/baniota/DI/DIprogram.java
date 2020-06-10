package com.baniota.DI;

import com.baniota.DI.entity.AiExam;
import com.baniota.DI.entity.Exam;

import com.baniota.DI.ui.ExamConsole;


public class DIprogram {
	public static void main(String[] args) {
	 Exam exam = new AiExam(10,10,10); 
	 ExamConsole console = new com.baniota.DI.ui.InlineExamConsole();
	 console.setExam(exam);
	 console.print();
}
}
