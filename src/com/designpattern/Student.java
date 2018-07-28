package com.designpattern;

public class Student {

	private String name;
	private String surName;

	public Student(String name, String surName) {
		this.name = name;
		this.surName = surName;
	}

	public static class Builder {
		private String name;
		private String surName;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setSurName(String surName) {
			this.surName = surName;
			return this;
		}

		public Student Build() {
			return new Student(name, surName);
		}
	}

}