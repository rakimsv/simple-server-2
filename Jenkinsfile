pipeline {
    agent any

    stages {
        stage('Testing a Ryan') {
            steps {
		    sh 'mvn test -Dtest=ControllerAndServiceSuite'
		    sh 'mvn test -Dtest=IntegrationSuite'
            }
        }
        stage('Building a Ryan') {
            steps {
                    sh 'mvn install -DskipTests'
            }
        }
        stage('Staging a Ryan') {
            steps {
                echo "Staging"
            }
        }
        stage('Deploying a Ryan') {
            steps {
                    echo "Deploy"
            }
        }
	stage('Ryan Deployed') {
	    steps {
		    echo "Ryan Deployed"
	    }
	}
    }
}
