package com.hashcode;

import org.junit.Test;

public class ExecutionTest {

    @Test
    public void runa(){
        Scheduler.schedule("src/main/resources/a_example.in");
    }


    @Test
    public void runb(){
        Scheduler.schedule("src/main/resources/b_should_be_easy.in");
    }


    @Test
    public void runc(){
        Scheduler.schedule("src/main/resources/c_no_hurry.in");
    }

    @Test
    public void rund() {
        Scheduler.schedule("src/main/resources/d_metropolis.in");
    }

    @Test
    public void rune() {
        Scheduler.schedule("src/main/resources/e_high_bonus.in");
    }
}

