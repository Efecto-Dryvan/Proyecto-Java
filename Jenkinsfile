pipeline {
	agent any
	options {
        timeout(time: 5, unit: 'SECONDS') // Ajusta el timeout a 1 minutos
    }
	stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio
                echo 'Clonando el repositorio'
                checkout scm
            }
        }
        
        stage('SonarQube Analysis') {
            steps {
                // Ejecutar el análisis estático con SonarQube Scanner
                echo 'Ejecutando el análisis estático con SonarQube Scanner'
                script {
                    sh 'mvn clean sonar:sonar -Dsonar.projectKey=org.maven.prueba21 -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_39b84779320f6f87fd8edf456e6ff0c932820ad8'
                }
            }
        }
        
        stage('Test') {
            steps {
                // Ejecutar las pruebas
                // Esto puede variar según el lenguaje y las herramientas utilizadas en tu proyecto
                echo 'Ejecutando las pruebas'
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
                echo 'Construyendo el proyecto'
                sh 'mvn clean package' // Ejemplo para un proyecto Maven
            }
        }
        
        // Otras etapas de tu pipeline...
    }
}
