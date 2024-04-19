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
                echo 'Ejecutando el análisis estático con SonarQube Scanner'
                withSonarQubeEnv(installationName: 'org.maven.prueba-20') {
                    def mvn = tool 'Default Maven';
                    sh '${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=org.maven.prueba-20 -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_c3e1174a993be1cc1996a678de5670588d9650a7'
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
