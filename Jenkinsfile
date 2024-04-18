pipeline {
	agent any
	options {
        timeout(time: 5, unit: 'SECONDS') // Ajusta el timeout a 1 minutos
    }
	stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio
                checkout scm
            }
        }
        
        stage('SonarQube Analysis') {
            steps {
                // Ejecutar el análisis estático con SonarQube Scanner
                script {
                    def scannerHome = tool 'SonarQube Scanner'
                    withSonarQubeEnv('SonarQube Server') {
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                // Ejecutar las pruebas
                // Esto puede variar según el lenguaje y las herramientas utilizadas en tu proyecto
                sh 'mvn test' // Ejemplo para un proyecto Maven
            }
            post {
                success {
                    echo 'Las pruebas han pasado correctamente, procediendo con la construcción.'
                }
                failure {
                    error 'Las pruebas han fallado, no se puede continuar con la construcción.'
                }
            }
        }
        
        stage('Build') {
            steps {
                // Ejecutar el proceso de construcción
                // Esto puede variar según el lenguaje y las herramientas utilizadas en tu proyecto
                sh 'mvn clean package' // Ejemplo para un proyecto Maven
            }
        }
        
        // Otras etapas de tu pipeline...
    }
}