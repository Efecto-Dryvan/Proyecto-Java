pipeline {
	agent any
	options {
        timeout(time: 5, unit: 'SECONDS') // Ajusta el timeout a 1 minutos
    }
	stages {
		stage("Build") {
			steps {
				echo "Build Stage"
			}
		}
		
		stage("Test") {
			steps {
				echo "Test Stage"
			}
		}
		
		stage("Deploy") {
			steps {
				echo "Deploy Stage"
			}
		}
	}
}