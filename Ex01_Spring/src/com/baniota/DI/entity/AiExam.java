package com.baniota.DI.entity;

import com.baniota.DI.entity.Exam;

public class AiExam implements Exam {

	private int nlp, ml, dl;

	public AiExam() {
		nlp = 0;
		ml = 0;
		dl = 0;
	}

	public AiExam(int nlp, int ml, int dl) {
		super();
		this.nlp = nlp;
		this.ml = ml;
		this.dl = dl;
	}

	@Override
	public int getTotal() {

		return nlp+ml+dl;
	}

}
