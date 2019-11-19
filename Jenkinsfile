pipeline {
    agent any

    stages {
        stage('Testing Environment') {
            steps {
		    sh 'mvn test -Dtest=ControllerAndServiceSuite'
            }
        }
        stage('Build') {
            steps {
                    sh 'mvn install -DskipTests'
            }
        }
        stage('Staging') {
            steps {
                sh 'sudo docker-compose build'
                sh 'sudo docker-compose up -d'
            }
        }
        stage('Deploy') {
            steps {
                    echo "Deploy"
            }
        }
    }
}
