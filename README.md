# RetoSoftkaE2E
Acá encontraras el reto de perfomance para mas info leer README


Título del Proyecto
Reto performance 

# 🧪 Proyecto de Automatización E2E con Cucumber, Java, JUnit y Gradle

Este proyecto implementa un **framework de automatización de pruebas end-to-end (E2E)** para validar el correcto funcionamiento de los flujos principales de una aplicación web.  
La solución combina **Cucumber**, **Java**, **JUnit**, **Gradle** y el lenguaje **Gherkin** para escribir escenarios de prueba legibles y ejecutables.

---

## 🚀 Objetivo del Proyecto

El objetivo principal de este proyecto es:
- Garantizar la **calidad funcional** del sistema mediante pruebas automatizadas.  
- Validar los flujos **desde la perspectiva del usuario final**, asegurando la integración entre componentes del sistema.

---

## 🧩 Tecnologías y Frameworks Utilizados

| Herramienta | Propósito |
|--------------|-----------|
| **Java 11+** | Lenguaje principal de desarrollo. |
| **Gradle** | Sistema de construcción y gestión de dependencias. |
| **JUnit 5** | Framework para la ejecución y reporte de pruebas. |
| **Cucumber** | Framework de BDD para definir y ejecutar escenarios en lenguaje natural. |
| **Gherkin** | Lenguaje para describir los escenarios de prueba en formato legible. |

---

## 🧱 Arquitectura del Proyecto

El proyecto sigue una **arquitectura modular y basada en principios SOLID**, lo que permite su fácil mantenimiento y escalabilidad.

e2e-automation/
├── build.gradle # Configuración del proyecto y dependencias
├── settings.gradle
├── src/
│ ├── main/java/
│ │ └── utils/ # Clases de soporte y utilidades
│ └── test/java/
│ ├── runners/ # Clases que configuran la ejecución de Cucumber + JUnit
│ ├── stepDefinitions/ # Definiciones de pasos (Given, When, Then)
│ ├── pages/ # Clases del patrón Page Object (POO)
│  
│
└── src/test/resources/
├── features/ # Escenarios escritos en Gherkin (.feature)
│ ├── login.feature
│ ├── checkout.feature
│ └── search.feature
└── config/ # Archivos de datos, CSV u otras configuraciones

---

## ✍️ Estructura de un Escenario Gherkin

#Autor: Kevin


Feature: Perform validation with an automated test of a successful purchase in OpenCart.
  As a certification analyst,
  I want to validate the response from the purchasing service on the front end.
  To validate that the purchase message is successful.
|


Gradle 7+

Git

Un IDE compatible (Eclipse, IntelliJ IDEA, VS Code)

🧰 Instalación del Proyecto
bash
Copiar código
# Clonar el repositorio
♦@
git clone https://github.com/kevingarciamontes/RetoSoftkaPerformance.git


##  Autor : Kevin Garcia Montes

# Compilar y descargar dependencias
gradle clean build
▶️ Ejecución de las Pruebas
bash
Copiar código
# Ejecutar todas las pruebas
gradle test

# O ejecutar un feature específico
gradle test --tests "runners.LoginRunner"
También puedes ejecutar directamente desde el IDE utilizando la clase Runner correspondiente.

📊 Reportes de Ejecución
Al finalizar la ejecución, los reportes se generan automáticamente en:

Copiar código
/build/reports/tests/test/index.html

👨‍💻 Autor
Kevin Garcia Montes
📧 kevingarciamontes@gmail.com
💼 Proyecto de Automatización E2E – Cucumber + Java + Gradle