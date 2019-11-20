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
                    sh 'mvn package -DskipTests'
		    sh 'docker build -t="rakimsv/simple-project:latest" .'
            }
        }
	stage('Deploying a Ryan') {
            steps {
		   sh 'docker push "rakimsv/simple-project:latest"'
                   echo "Deploy"
            }
        }
	stage('Testing Ryan's Environment') {
            steps {
                echo "hello"
            }
        }
        stage('Staging a Ryan') {
            steps {
                   echo "Staging"
            }
        }
      stage('A Ryan is in Production') {
            steps {
                echo "hello"
            }
        }
    }
}

