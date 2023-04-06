package com.morphtest.morphtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MorphtestApplication

fun main(args: Array<String>) {
	runApplication<MorphtestApplication>(*args)
}
