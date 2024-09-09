# 🚀 Pruebas UI con Selenium, Maven, Java y Cucumber

![Banner](https://img.shields.io/badge/Selenium-Maven--Java--Cucumber-blue?style=flat&logo=selenium&logoColor=white) 

## 🌟 Descripción

Este proyecto implementa **pruebas automatizadas** para aplicaciones web utilizando una combinación poderosa de **Selenium WebDriver**, **Maven**, **Java** y **Cucumber**. Las pruebas están diseñadas para validar la funcionalidad de la aplicación y detectar posibles regresiones de manera eficiente, integrándose perfectamente en el flujo de trabajo de desarrollo.

## 📂 Estructura del Proyecto

- **`src/test/java`**: Contiene el código fuente de las pruebas.
  - **`pages`**: Modelos de página que representan las páginas de la aplicación y encapsulan la interacción con sus elementos.
  - **`stepDefinitions`**: Implementaciones de pasos de Cucumber que definen la lógica de los escenarios descritos en los archivos `.feature`.
  - **`utils`**: Clases utilitarias para operaciones comunes, incluyendo esperas y depuración.

- **`src/test/resources`**: Contiene los archivos de características escritos en sintaxis Gherkin.
  - **`features`**: Directorio con los archivos `.feature` que describen los escenarios de prueba.

- **`pom.xml`**: Archivo de configuración de Maven que gestiona las dependencias del proyecto y configura el proceso de construcción.

## 🔧 Requisitos

- **Java 11 o superior**
- **Maven 3.6 o superior**
- **Selenium WebDriver**
- **Cucumber**

## 📥 Instalación

1. Clona el repositorio:
   ```sh
   git clone https://github.com/brayan14ts/ui-testing-with-selenium-maven-java-cucumber.git
