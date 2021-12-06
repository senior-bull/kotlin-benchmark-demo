package org.test;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@CompilerControl(CompilerControl.Mode.DONT_INLINE)
public class TestBenchmarkJava {

    @Setup
    public void setup() {

    }

    @Benchmark
    public int return42() {
        return 42;
    }
}
