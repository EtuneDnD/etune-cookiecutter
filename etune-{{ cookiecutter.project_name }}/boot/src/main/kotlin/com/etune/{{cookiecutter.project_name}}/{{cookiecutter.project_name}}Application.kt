package com.etune.{{cookiecutter.project_name}}

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@EnableRabbit
class UsersApplication

fun main(args: Array<String>) {
	try {
		runApplication<UsersApplication>(*args)
	} catch (e: Exception){
		e.printStackTrace()
	}
}
