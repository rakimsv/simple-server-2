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
                echo "Staging"
            }
        }
        stage('Deploy') {
            steps {
                    echo "Deploy"
            }
        }
    }
}
