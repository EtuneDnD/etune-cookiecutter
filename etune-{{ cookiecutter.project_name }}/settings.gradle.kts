rootProject.name = "{{cookiecutter.project_name}}"
include("domain")
include("application")
include("boot")
include("infrastructure:rest")
include("infrastructure:jooq")
include("infrastructure:firebase")
include("infrastructure:flyway")
include("infrastructure:rabbitmq")
