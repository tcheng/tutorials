package com.ripjava.java.core.casting;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cat  extends  Animal implements  Mew{
    private static final Logger LOGGER = LoggerFactory.getLogger(Cat.class);

    @Override
    public void eat() {
        LOGGER.info("cat is eating");
    }

    @Override
    public void meow() {
        LOGGER.info("meow");
    }
}
