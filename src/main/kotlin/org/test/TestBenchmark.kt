package org.test

import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@CompilerControl(CompilerControl.Mode.DONT_INLINE)
open class TestBenchmark {

    @Setup
    open fun setup() {

    }

    @Benchmark
    fun vectorAdd(): Int {
        return 42
    }
}