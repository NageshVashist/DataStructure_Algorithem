package com.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface<T> {

	public boolean filter(T q);
}
